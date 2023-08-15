package shujia25.day19;

/*
    JDK1.5之后：java专门提供了一个关键字去创建枚举类 enum

    1. 将枚举相关的对象放在开头

    2. 创建枚举类的属性(成员遍历)，必须是作为私有常量出现

    3. 必须将构造方法私有化，这是为了保证类的对象是有限个的目的

    4. 提供公共的获取属性的方法

    5. 重写toString()方法

 */

public class EnumDemo2 {
    public static void main(String[] args) {
        Weekend2 monday = Weekend2.MONDAY;
        System.out.println(monday);

        // java中的enum修饰的枚举类都有一个共同的父类叫做枚举类java.lang.Enum
        System.out.println(Weekend2.class.getSuperclass());
        System.out.println("-----------------------------------------------------");

        // 枚举类中常用的方法
        // 获取所有的枚举对象组成的数组
        Weekend2[] values = Weekend2.values();
        for (Weekend2 value : values) {
            System.out.println(value);
            value.work();
        }

    }
}

interface Inter12{
    void work();
}
enum Weekend2 implements Inter12{

//    MONDAY("星期一","是一个快乐的上班日！！"),
//    TUESDAY("星期二","是一个无聊的上班日！！"),
//    WEDNESDAY("星期三","是一个精彩的上班日！！"),
//    THURSDAY("星期四","是一个刺激的上班日！！"),
//    FRIDAY("星期五","是一个开心的上班日！！"),
//    SATURDAY("星期六","是一个悲伤的休息日！！"),
//    SUNDAY("星期日","是一个愉快的休息日！！");

    MONDAY("星期一","是一个快乐的上班日！！"){
        @Override
        public void work() {
            System.out.println("今天是星期一，开会的日子！");
        }
    },
    TUESDAY("星期二","是一个无聊的上班日！！"){
        @Override
        public void work() {
            System.out.println("开始做任务了");
        }
    },
    WEDNESDAY("星期三","是一个精彩的上班日！！"){
        @Override
        public void work() {
            System.out.println("改一改bug");
        }
    },

    THURSDAY("星期四","是一个刺激的上班日！！"){
        @Override
        public void work() {
            System.out.println("喝一喝下午茶");
        }
    },
    FRIDAY("星期五","是一个开心的上班日！！"){
        @Override
        public void work() {
            System.out.println("摸鱼");
        }
    },
    SATURDAY("星期六","是一个悲伤的休息日！！"){
        @Override
        public void work() {
            System.out.println("钓鱼");
        }
    },
    SUNDAY("星期日","是一个愉快的休息日！！"){
        @Override
        public void work() {
            System.out.println("睡觉");
        }
    };


    //1. 创建枚举类的属性(成员遍历)，必须是作为私有常量出现
    private String name;
    private String info;

    //2. 必须将构造方法私有化，这是为了保证类的对象是有限个的目的
    //默认就是私有
    Weekend2(){}

    Weekend2(String name,String info){
        this.name = name;
        this.info = info;
    }

    //4. 提供公共的获取属性的方法
    public String getName() {
        return name;
    }


    public String getInfo() {
        return info;
    }

    //5. 重写toString()方法
    @Override
    public String toString() {
        return "Weekend{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public void work() {
        System.out.println("好好上班，好好挣钱！");
    }
}