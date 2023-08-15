package shujia25.day03.test;

/*
        看程序写结果

 */
public class SwitchTest4 {
    public static void main(String[] args) {
//        版本1：
        int x = 2;
        int y = 3;
        switch(x){
            default:
                y++;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y);// 4

//        版本2：

        switch(x){
            default:
                y++;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y);// 7
    }
}
