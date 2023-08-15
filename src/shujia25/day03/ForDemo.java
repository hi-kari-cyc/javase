package shujia25.day03;

/*
        循环结构：重复做某一件事（需要提供，开始条件，判断条件，循环体语句，结束条件）
        java中的循环：
            1、for循环
                语句定义格式：
                    for(初始化条件语句;判断条件语句;控制条件语句){
                        循环体语句;
                    }
            注意事项：
                1、初始化条件语句只会在开始进入循环的时候执行一次
                2、判断条件语句结果一定是boolean类型的值
                3、初始化条件语句可以写在for循环外面（将变量声明在循环外部），作用域不限循环内部，循环结束后保留变量的值
                4、判断条件可以不写，如果不写就成死循环了
                5、控制条件语句也可以不写，但是不写就是死循环了
                6、大括号能不能不写呢？如果循环体语句只有一行的话，可以省略，建议永远不要省略

            2、while循环


 */
public class ForDemo {
    public static void main(String[] args) {
        //需求：我想要在控制台中输出10行Hello World
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        //使用循环进行改进
        /**
         *      for(初始化条件语句;判断条件语句;控制条件语句){
         *          循环体语句;
         *      }
         *   因为我们要循环10次，所以定义一个开始值，假设是1，初始化条件语句：int i = 1;
         *        因为我们要循环10次，每次循环后i的值要+1，当i<=10的时候进入循环，判断条件语句：i<=10
         *        控制条件语句：i++
         */

        for (int i=1;i<=10;i++){
            System.out.println("Hello World");
        }

        // 写法二
        int i = 1;
        for (;i<=10;i++){
            System.out.println("Hello World");
        }

        // 写法三
        int j = 1;
        for (;j<=10;){
            System.out.println("Hello World");
            j++;
        }

            //死循环
//        for(;;){
//            System.out.println("Hello World");
//        }

//        System.out.println(i);

    }
}
