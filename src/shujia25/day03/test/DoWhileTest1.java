package shujia25.day03.test;

/*
        看完执行流程图解后，用do…while循环改写案例
            A:输出10次HelloWorld案例
            B:求出1-100之和

 */
public class DoWhileTest1 {
    public static void main(String[] args) {

        // A:输出10次HelloWorld案例
        int i = 1;
        do {
            System.out.println("Hello World");
            i++;
        }while (i<=10);

        // B:求出1-100之和
        int j = 1;
        int num = 0;
        do{
            num += j;
            j++;
        }while (j<=100);
        System.out.println("1-100之和为:"+num);
    }
}
