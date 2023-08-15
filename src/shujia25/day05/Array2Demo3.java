package shujia25.day05;

/*
    二维数组的第三种定义格式：
        数据类型[][] 数组名 = new 数据类型[][]{{元素1,元素2,...},{元素1,元素2,元素3,..},{...},...};
        数据类型[][] 数组名 = {{元素1,元素2,...},{元素1,元素2,元素3,..},{...},...};
 */
public class Array2Demo3 {
    public static void main(String[] args) {
        String[][] shujia = new String[][]{{"小黑", "小白"}, {"小花", "小草", "小小"}, {"刘天保", "陆鹏", "汪远明", "田小强"}};

        //遍历
        System.out.println(shujia.length); // 得到的是一维数组的个数
        for (int i = 0; i < shujia.length; i++) {
            for (int j = 0; j < shujia[i].length; j++) {
                System.out.println(shujia[i][j]);
            }
            System.out.println("-----------------");
        }
    }
}