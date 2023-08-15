package shujia25.day19;

/*
JDK1.5之前创建枚举类的方式：
    1. 创建枚举类的属性(成员遍历)，必须是作为私有常量出现

    2. 必须将构造方法私有化，这是为了保证类的对象是有限个的目的

    3. 提供公共的静态的final方法给外界获取枚举类中多个对象

    4. 提供公共的获取属性的方法

    5. 重写toString()方法

 */

public class EnumDemo1 {
    public static void main(String[] args) {
        Weekend monday = Weekend.MONDAY;
        System.out.println(monday.getName() + "---" + monday.getInfo());

    }
}

class Weekend {
    // 1. 创建枚举类的属性(成员遍历)，必须是作为私有常量出现
    private String name;
    private String info;

    // 2. 必须将构造方法私有化，这是为了保证类的对象是有限个的目的
    private Weekend() {
    }

    private Weekend(String name, String info) {
        this.name = name;
        this.info = info;
    }


    // 3. 提供公共的静态的final方法给外界获取枚举类中多个对象
    public static final Weekend MONDAY = new Weekend("星期一","是一个快乐的上班日！！");
    public static final Weekend TUESDAY = new Weekend("星期二","是一个无聊的上班日！！");
    public static final Weekend WEDNESDAY = new Weekend("星期三","是一个精彩的上班日！！");
    public static final Weekend THURSDAY = new Weekend("星期四","是一个刺激的上班日！！");
    public static final Weekend FRIDAY = new Weekend("星期五","是一个开心的上班日！！");
    public static final Weekend SATURDAY = new Weekend("星期六","是一个悲伤的休息日！！");
    public static final Weekend SUNDAY = new Weekend("星期日","是一个愉快的休息日！！");

    // 4. 提供公共的获取属性的方法


    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    // 5. 重写toString()方法
    @Override
    public String toString() {
        return "Weekend{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}