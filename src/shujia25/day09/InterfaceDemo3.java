package shujia25.day09;

/*
    接口与接口之间的关系：继承关系 extends
    注意：接口与接口之间可以是单继承，也可以是多继承。

    java里面运行多继承吗？
        类与类之间不能多继承
        接口与接口之间能多继承
 */
interface Inter2{

}

interface Inter3{

}

interface Inter4 extends Inter2,Inter3{

}

public class InterfaceDemo3 {
    public static void main(String[] args) {

    }
}
