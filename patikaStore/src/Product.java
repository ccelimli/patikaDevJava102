public class Product {
    private Integer id;
    private String brandName;
    private String productName;
    private Integer ram;
    private Integer memory;
    private Float screenSize;
    private Float unitPrice;
    private Float discountRate;
    private Integer amountStock;

    public Product(){};

    public Product(Integer id, Float unitPrice, Float discountRate, Integer amountStock, String productName, String brandName, Integer memory, Float screenSize, Integer ram) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountStock = amountStock;
        this.productName = productName;
        this.brandName = brandName;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Float discountRate) {
        this.discountRate = discountRate;
    }

    public Integer getAmountStock() {
        return amountStock;
    }

    public void setAmountStock(Integer amountStock) {
        this.amountStock = amountStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
}
