package shujia25.day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*

    反射获取类中的成员方法并使用

 */
public class ReflexDemo2 {
    public static void main(String[] args) throws Exception{
        // 获取类的字节码文件对象
        Class<?> aClass = Class.forName("shujia25.day19.Student");

        // 获取某一个公共的成员方法
        // public Method getMethod(String name, Class<?>... parameterTypes)
        // 会根据你写的方法名和参数类型找到对应的方法包装成一个Method对象进行返回
        Method fun2 = aClass.getMethod("fun2", String.class);
        System.out.println(fun2);

        Method fun1 = aClass.getMethod("fun1");
        System.out.println(fun1);

//        Method fun3 = aClass.getMethod("fun3", String.class);
//        System.out.println(fun3);
        // 获取任意一个权限修饰的成员方法，包括所有
        Method fun3 = aClass.getDeclaredMethod("fun3", String.class);
        System.out.println(fun3);

        System.out.println("----------------------------------------------------------------");
        //获取本类和父类中的所有公共的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 获取自己本类的成员方法，包括私有
        System.out.println("----------------------------------------------------------------");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("----------------------------------------------------------------");


        //方法的调用需要告诉是调用的哪一个对象中的方法
        //如果要给一个通过反射获取的成员变量进行赋值的话，就必须要告诉它是哪一个对象的成员变量
        Constructor<?> c1 = aClass.getDeclaredConstructor();
        // 今后最好在使用前设置为暴力访问
        c1.setAccessible(true);
        Object o = c1.newInstance();
        System.out.println(o);

        //Object invoke(Object obj, Object... args)
        //在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        fun2.invoke(o, "好好学习");     //  传入的参数是，对象和实参，告诉方法你是哪一个对象要调用的，参数值是什么

        fun3.setAccessible(true);
        fun3.invoke(o,"天天向上");
    }
}
