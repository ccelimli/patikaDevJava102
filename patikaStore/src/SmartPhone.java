public class SmartPhone extends Product{
    int batterryPower;
    String color;

    public SmartPhone(Integer id, Integer unitPrice, Float discountRate, Integer amountStock, String productName, Brand brand, String memory, String screenSize, Integer ram, int batterryPower, String color) {
        super(id, unitPrice, discountRate, amountStock, productName, brand, memory, screenSize, ram);
        this.batterryPower = batterryPower;
        this.color = color;
    }
}
