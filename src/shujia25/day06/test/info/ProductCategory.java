package shujia25.day06.test.info;

/*
            商品类别类：
                    属性：类别编号，类别名称

 */
public class ProductCategory {
    private String categoryId;
    private String categoryName;

    ProductCategory(){
    }

    public ProductCategory(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
