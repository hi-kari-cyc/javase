package shujia25.day03;

/*
        while循环的另一种格式:
            do...while循环

                语句定义格式:

                    初始化条件语句:
                    do{
                        循环体语句;
                        控制条件语句;
                    }while(判断条件语句);

        while循环和do...while循环的区别？
            答：while循环会先进行判断，当判断结果为true的时候才会执行循环体内容
               do...while循环会先执行一次循环体内容，再进行判断，当判断结果为true的时候继续执行循环体内容


 */
public class DoWhileDemo {
    public static void main(String[] args) {

        // while
        int j = 1;
        while (j<=10){
            System.out.println("hello world");
            j++;
        }


        // do...while
        int i = 1;
        do {
            System.out.println("Hello World");
            i++;
        }while (i<=10);
    }
}
