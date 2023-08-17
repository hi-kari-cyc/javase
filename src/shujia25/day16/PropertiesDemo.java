package shujia25.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

/*
    Properties概述：配置文件    Properties作为Map集合的使用
    Properties的特殊功能
        public Object setProperty(String key,String value)
            将指定的key映射到此key value中指定的value。 钥匙和价值都不能是null.(与hashtable中的put方法一致)
        public String getProperty(String key)
            根据key获取配置文件中的value值
        public Set<String> stringPropertyNames()
            返回此属性列表中的一组键，其中键及其对应的值为字符串


    Properties和IO流的结合使用
    public void load(Reader reader)  加载配置文件
    public void store(Writer writer,String comments)


 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        //创建配置文件对象
        Properties prop = new Properties();

        //调用方法加载自己的配置文件
        //创建字符缓冲输入、输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/shujia25/day16/File/propertiesFile.properties"));
        BufferedReader br = new BufferedReader(new FileReader("src/shujia25/day16/File/propertiesFile.properties"));

        // 写入属性
        prop.setProperty("username", "cyc");
        prop.setProperty("password", "123456");

        prop.store(bw, "Application Properties"); // 写注释

        // 获取属性值
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
