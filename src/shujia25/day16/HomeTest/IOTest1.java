package shujia25.day16.HomeTest;

import java.io.StringReader;
import java.io.StringWriter;

/*
      实现字符串和字节数组之间的相互转换。必如将字符串“数加科技sjkj”转换为字节数组，并将字节数组再转换回字符串。
      StringWriter和StringReadr不需要依靠外界的文件

 */
public class IOTest1 {
    public static void main(String[] args) throws Exception{
        StringWriter sw = new StringWriter();
        sw.write("数加科技sjkj");
        String string = sw.toString();
        StringReader sr = new StringReader(string);

        char[] chars = new char[1024];
        int length;
        while ((length=sr.read(chars))!=-1){
            System.out.println(new String(chars, 0, length));
        }
    }
}
