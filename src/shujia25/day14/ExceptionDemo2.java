package shujia25.day14;

/*
    异常的处理：
        try...catch..finally
        throws

        在运行try中的代码的时候，如果遇到了问题， try中 的其他代码停止执行，直接去匹配对应的catch
        如果匹配到了对应的catch，后面的代码继续执行，如果没有匹配到则会报官方错误并停止执行后续的代码
        但finally中的代码无论是否出现异常都会执行，除非在执行到finally之前jvm退出了

    报红就是官方处理方案
 */

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        try {
            // 在运行try中的代码的时候，如果遇到了问题， try中 的其他代码停止执行，直接去匹配对应的catch
            // 代码如果出现问题由catch捕获匹配
            System.out.println(arr[6]);  // ArrayIndexOutOfBoundsException
            int a =10;
            int b = 0;
            System.out.println(a/b);   // ArithmeticException

            // 写法一
//        }catch (ArrayIndexOutOfBoundsException e){       // ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException()
//            System.out.println("索引越界！");
//            e.printStackTrace();  // 官方处理
//        }catch (ArithmeticException e){
//            e.printStackTrace();

            // 写法二
//        }catch (Exception e){               // Exception e = new ArrayIndexOutOfBoundsException()   (多态)
//            e.printStackTrace();

            // 写法三
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//            e.printStackTrace();

            // 写法四
            // 如果多个异常存在父子继承关系，请将父类异常写在后面
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
//            e.printStackTrace();
            String message = e.getMessage();    // 获取异常信息，返回字符串。
            System.out.println(message);
            String string = e.toString();       // 获取异常类名和异常信息，返回字符串
            System.out.println(string);

            System.exit(0);
            // 被finally控制的语句体一定会执行
            // 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
        }finally {
            //finally中的代码无论是否出现异常，都会执行
            //这里一般情况下放的都是一些释放资源，关闭连接的代码
            System.out.println("finally中的代码会不会被执行呢？");
        }
        System.out.println("后面的代码会不会执行呢？");
    }
}
