package shujia25.day18;

/*
    通过反射获取构造方法并使用
    类：
        构造方法：Constructor
        成员变量：Field
        成员方法：Method


        获取构造方法
            getConstructors
            getDeclaredConstructors
        创建对象
            newInstance()
        暴力访问
            method.setAccessible(true);

 */

import java.lang.reflect.Constructor;

public class ConstructorDemo {
    public static void main(String[] args) throws Exception{
        // 获取类的class文件对象
        Class<?> aclass = Class.forName("shujia25.day18.Student");

        // 获取这个类中的构造方法
        //public Constructor<T> getConstructor(Class<?>... parameterTypes) 只能获取公共的public修饰的构造方法
        Constructor<?> c1 = aclass.getConstructor();    // 只能获取公共无参构造方法
        System.out.println(c1);

        Constructor<?> c2 = aclass.getConstructor(String.class);    // 只能获取公共有参构造方法
        System.out.println(c2);

        Constructor<?> dc1 = aclass.getDeclaredConstructor(String.class, int.class);    // 可以获取所有权限修饰的构造方法
        System.out.println(dc1);

        System.out.println("----------------------------------------");

        Constructor<?>[] c3 = aclass.getConstructors();     // 获取所有公共构造方法
        for (Constructor<?> constructor : c3) {
            System.out.println(constructor);
        }

        System.out.println("----------------------------------------");

        Constructor<?>[] dc2 = aclass.getDeclaredConstructors();    // 获取所有构造方法
        for (Constructor<?> declaredConstructor : dc2) {
            System.out.println(declaredConstructor);
        }

        //获取构造方法的目的是实例化
        //T newInstance(Object... initargs)
        //使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object o1 = c1.newInstance();
        System.out.println(o1);

        Object o2 = c2.newInstance("张三");
        System.out.println(o2);

//        Object o3 = dc1.newInstance("张三",18);
//        System.out.println(o3);
        // 私有构造方法无法使用

        //使用私有的构造方法创建对象
        //绕过JVM检测机制，暴力访问
        dc1.setAccessible(true);
        Object o3 = dc1.newInstance("张三", 18);
        System.out.println(o3);

    }
}
