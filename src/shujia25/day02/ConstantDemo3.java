package shujia25.day02;

/*
    整数常量中存在二进制的表现形式,其中计算机内部所有的运算都是采用补码的形式进行的,而要想知道补码,就必须知道反码,而要想知道反码就必须知道原码

    而原码,反码,补码都是二进制的表现形式
    需求: 求除-7或者 7的补码
    1. 分别求出-7 或者7的原码
    规律: 负数的原码最高位是1,正数的原码最高位是0
    7的二进制:00000111
             符号位        数值位
    -7的原码:   1         0000111
     7的原码:   0         0000111

    2. 求7或者-7的反码
     规律: 正数的反码和原码一样, 负数的反码:符号位与原码一样,数值位按位取反
              符号位        数值位
     -7的反码:   1         1111000
      7的反码:   0         0000111

     3. 求7或者-7的补码
     规律:正数的补码与原码一样, 负数的补码是反码的基础之上末位+1
                符号位       数值位
      -7的补码:   1        1111001
       7的补码:   0        0000111

     求-7+1的结果
     -7的补码和1的补码
     -7的补码:   1        1111001
      1的补码:   0        0000001
      --------------------------
 负数补码形式:    1        1111010

      注意:我们最终看到的是原码的十进制形式
      已知补码求原码:
      负数补码形式:    1        1111010
      负数反码形式:    1        1111001
      负数原码形式:    1        0000110
      --------------------------------
      结果: -6

      // 如果符号位为都是1，高位溢出舍去
 */
public class ConstantDemo3 {
}