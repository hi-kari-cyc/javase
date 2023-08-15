package shujia25.day04;

/*
        方法：完成功能的代码块
        语句定义格式：
            修饰符 返回值类型 方法名(参数类型1 参数名1,参数类型2 参数名2,......){
                方法体;
                return 返回值;
            }

        名词解释：
            修饰符：目前修饰符固定写法 public static
            返回值类型：调用方法结束后得到的数据的数据类型
            方法名：随便起名字，但是要符合标识符的规则
            参数：
                实参：实际调用方法时传入的具体值
                形参：在方法定义时小括号中的参数名
            方法体：方法要实现的功能代码
            return：结束整个方法，将方法的返回值进行返回，返回给调用者
            返回值：与返回值类型一样或者父子关系的具体的值，将来会被return返回出去给调用者

        方法定义以及使用注意事项：
            1、方法与方法是平级关系，不能嵌套定义,但是可以嵌套调用、使用
            2、方法不调用不执行
            3、如果一个方法有返回值，那么在调用的时候，可以使用一个变量接收结果值，也可以直接使用。
            4、方法在调用的时候，不需要传入数据类型，只需要传值即可。
            5、方法定义的时候参数之间用逗号隔开
            6、如果方法有明确的返回值，一定要有return带回一个值


 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        // 定义一个方法求两个数之和
//        public static int sum(int a,int b){
//            return a+b;
//        }

        // 变量接收
        int res = sum(10,20);
        System.out.println(res);

        System.out.println(sum(10,20));

//        int res2 = sum(int a = 3,int b = 4);

    }

    public static int sum(int a,int b){
        return a+b;
    }
}
