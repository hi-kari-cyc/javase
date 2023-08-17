package shujia25.day16;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
        序列化流
            ObjectOutputStream
        反序列化流
            ObjectInputStream

 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        write();    // 序列化流
        read();     // 反序列化流
    }

    public static void write() throws Exception{
        Student s1 = new Student("张三",18);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/shujia25/day16/File/obj.txt"));
        // 将对象写入到文件中
        oos.writeObject(s1);   // NotSerializableException  java中只有实现了Serializable接口的类产生的对象才可以进行序列化
        // 序列化流先刷新
        oos.flush();
        // 释放资源
        oos.close();
    }

    public static void read() throws Exception{
        // 创建一个对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/shujia25/day16/File/obj.txt"));
        Object o = ois.readObject();
        System.out.println(o);
    }
}
