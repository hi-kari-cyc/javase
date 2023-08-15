package shujia25.day11;

/*
    System: 与系统相关的类

    成员方法
    public static void gc()     垃圾回收
    public static void exit(int status)     强制推出
    public static long currentTimeMillis()

 */

public class SystemDemo {
    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            System.out.println(i);
//            if(i==30){
////                break;
//                System.exit(0);
//            }
//        }
//        System.out.println("12345568");
        /*
               exit与return的区别：
            return结束方法，exit推出程序
         */

            //public static long currentTimeMillis()  获取当前系统的时间戳
            long time = System.currentTimeMillis();
            System.out.println(time); // 1688905325027
    }
}
