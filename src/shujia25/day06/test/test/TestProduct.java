package shujia25.day06.test.test;

/*
        编写测试类，测试商品类别类和商品详细信息类的对象及相关方法（测试数据  信息自定）


 */

import shujia25.day06.test.info.ProductCategory;
import shujia25.day06.test.info.ProductDetails;

public class TestProduct {
    public static void main(String[] args) {
        ProductCategory productCategory = new ProductCategory("0001", "洗发水");
        ProductDetails p1 = new ProductDetails("001", "潘婷洗发水400ml",productCategory,16,40.5);
        p1.show();

        System.out.println("=============================");

        ProductDetails p2 = new ProductDetails("002", "蜂花洗发水250ml" ,productCategory,-1,11.5);
        p2.show();
    }
}
