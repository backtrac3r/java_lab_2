class Store extends Institution {

    private String productCategory;

    public Store(
        String name,
        String location,
        int capacity,
        String productCategory
    ) {
        super(name, location, capacity);
        this.productCategory = productCategory;
    }

    @Override
    public void describeActivity() {
        System.out.println("Store sells " + productCategory + " products.");
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Product Category: " + productCategory);
    }
}
