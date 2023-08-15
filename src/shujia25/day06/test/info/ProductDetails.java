package shujia25.day06.test.info;

/*
            商品详细信息类：
                属性：商品编号，商品名称，所属类别，商品数量（大于 0），商品价格（大于 0），
                方法：盘点的方法，描述商品信息。内容包括商品名称，商品数量，商品价格，  现在商品总价以及所属类别信息

 */
public class ProductDetails {
    private String productId;
    private String productName;
    private ProductCategory productCategory;  // 所属类别
    private int productCount;
    private double productPrice;

    public ProductDetails(){
    }

    public ProductDetails(String productId, String productName, ProductCategory productCategory, int productCount, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        setProductCount(productCount);
        setProductPrice(productPrice);

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        if (productCount > 0) {
            this.productCount = productCount;
        } else {
            System.out.println("库存异常，请联系管理员");
            this.productCount = 0;
        }
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice>0){
            this.productPrice = productPrice;
        }else {
            System.out.println("请输入正确的商品价格！默认为0");
            this.productPrice = 0;
        }
    }

    public void show() {

        System.out.println("商品名称：" + productName);
        System.out.println("所属类别：" + productCategory.getCategoryName());
        System.out.println("商品售价：" + productPrice);
        System.out.println("库存数量：" + productCount);
        double total = productCount * productPrice;
        System.out.println("商品总价：" + total);
    }
}
