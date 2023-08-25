package shujia25.day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
    通过反射获取类中的成员变量并使用（赋值）
 */
public class ReflexDemo1 {
    public static void main(String[] args) throws Exception{
        // 获取类的字节码文件对象
        Class<?> aClass = Class.forName("shujia25.day19.Student");

        // Field 根据名字获取某一个成员变量
        Field name = aClass.getField("name");
        System.out.println(name);

//        Field like = aClass.getField("like");
//        System.out.println(like);
        // getField只能获取公共的属性
        // getDeclaredField都可以获取
        Field age = aClass.getDeclaredField("age");
        System.out.println(age);

        Field like = aClass.getDeclaredField("like");
        System.out.println(like);

        Field address = aClass.getDeclaredField("address");
        System.out.println(address);
        System.out.println("------------------------------------------------");

        // 只能获取所有公共的成员变量
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("------------------------------------------------");

        // 获取所有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("------------------------------------------------");

        // 如果要给一个通过反射获取的成员变量进行赋值的话，就必须要告诉它是哪一个对象的成员变量
        // 创建一个对象，先获取构造方法，再创建
        Constructor<?> c1 = aClass.getDeclaredConstructor();
        Object o = c1.newInstance();
        System.out.println(o);

        //Field类中的方法：void set(Object obj, Object value)
        //将指定对象参数上的此 Field对象表示的字段设置为指定的新值。
        name.setAccessible(true);
        name.set(o,"张三");   // 将对象o中的成员变量赋一个值
        System.out.println(o);

        age.set(o,18);
        System.out.println(o);

        address.set(o,"合肥");
        System.out.println(o);

        // like是私有的，需要暴力访问
        like.setAccessible(true);
        like.set(o,"吃");
        System.out.println(o);

    }
}
