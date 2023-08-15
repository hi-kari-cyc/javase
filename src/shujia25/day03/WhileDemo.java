package shujia25.day03;

/*
    第二种循环结构：while循环

    语句定义格式:

        初始化条件语句;
        while(判断条件语句){
            循环体语句;
            控制条件语句;
        }
    for循环能否和while循环等价转换呢？可以

    for 循环适用于已知循环次数的情况，通过初始化条件、循环条件和循环后操作来控制循环的执行。（从哪到哪）
    while 循环适用于未知循环次数的情况，只通过循环条件来控制循环的执行。（当什么时候结束）

 */
public class WhileDemo {
    public static void main(String[] args) {
        // 输出十行Hello World
        // 使用for循环实现
        for(int i = 1;i<=10;i++){
            System.out.println("Hello World");
        }

        // while循环实现
        int i = 1;
        while (i<=10){
            System.out.println("hello world");
            i++;
        }

    }
}
