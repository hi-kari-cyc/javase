package shujia25.day05;

/*
    一个标准类的3.0写法，将形参的名字遵循见名知意思去定义，加入this关键字

 */
public class Student4 {
    //定义成员变量
    private String name;
    private int age;
    private String gender;
    private String clazz;

    //定义成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getClazz() {
        return clazz;
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("班级：" + clazz);
    }

}
