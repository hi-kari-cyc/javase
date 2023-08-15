package shujia25.day06;

public class ToolDemo {
    public static void main(String[] args) {
        int[] arr = {2, 34, 12, 1, 564, 34, 56, 345, 767, 6890, 45, 36};

        //需求：打印遍历数组
        printArray(arr);

        //使用工具类调用打印的方法
        ArrayTool.printArray(arr);

        //获取数组中的最大值
        System.out.println(getMaxNumber(arr));

        //使用工具类调用获取数组中的最大值
        System.out.println(ArrayTool.getMaxNumber(arr));
        //将来可能会出现10000种对数组做操作的功能需求
        //那按照现在的写法，是不是到时候会出现10000个方法
        //虽然功能封装成方法会比直接编写功能代码要方便，但是方法一多，这个类也显得非常臃肿
        //那么我们可以根据功能将不同的方法放到一个类中，将来别的程序要想使用这个功能，就可以拿这个类区调用
        //这样的类，称之为工具类

        /**
         * 如何编写工具
         * 1、构造方法私有化
         * 2、成员方法必须是静态的
         *
         * 工具类编写后要附带一个帮助文档，如何生成一个帮助文档？使用文档注释
         * javadoc -d 目录\+创建目录名 -author -version xxx.java
         * javadoc -d D:\IDEA\JavaProject\java25\src\shujia25\day06\docs -author -version ArrayTool.java
         */
    }

    public static int getMaxNumber(int[] arr) {
        int maxNumer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumer) {
                maxNumer = arr[i];
            }
        }
        return maxNumer;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}