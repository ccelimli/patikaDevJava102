import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Computer extends Product {
    private Scanner input = new Scanner(System.in);
    private int computerId=1;

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public Integer getComputerId() {
        return this.computerId;
    }

    private List<Computer> computers = new ArrayList<>();

    public Computer(){
        super();
    };

    public Computer(Integer id, Integer unitPrice, Float discountRate, Integer amountStock, String productName, Brand brand, String memory, String screenSize, Integer ram) {
        super(id, unitPrice, discountRate, amountStock, productName, brand, memory, screenSize, ram);
    }

    public void process() {
        while (true) {
            System.out.println("İşlem Seç");
            System.out.println("1 - Ekleme");
            System.out.println("2 - Silme");
            System.out.println("3 - Listeleme");
            int select = input.nextInt();
            switch (select) {
                case 1 -> this.add();
                case 2 -> this.delete();
                case 3 -> this.displayComputers();
                default -> System.out.println("Yanlış Seçim");
            }
        }
    }

    public void add(){
        Computer computer=null;
        computer.setId(this.getComputerId());

        System.out.println("Ücret: ");
        Integer unitPrice= input.nextInt();
        computer.setUnitPrice(unitPrice);

        System.out.println("İndirim Oranı: ");
        Float discountRate= input.nextFloat();
        computer.setDiscountRate(discountRate);

        System.out.println("Stok Adedi: ");
        Integer amountStock= input.nextInt();
        computer.setAmountStock(amountStock);

        System.out.println("Ürün Adı: ");
        String productName= input.nextLine();
        computer.setProductName(productName);

        System.out.println("Marka Seç: ");
        computer.setBrandName(new Brand().selectBrand());

        System.out.println("Hafıza: ");
        Integer memory= input.nextInt();
        computer.setMemory(memory);

        System.out.println("Ekran Boyutu: ");
        Float screenSize= input.nextFloat();
        computer.setScreenSize(screenSize);

        System.out.println("Ram: ");
        Integer ram= input.nextInt();
        computer.setRam(ram);

        this.computers.add(computer);
        this.setComputerId(this.getComputerId()+1);
    }

    public void delete(){
        for (Computer computer : computers) {
            System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%.2f\t%d",
                    computer.getId(), computer.getBrandName(), computer.getProductName(),
                    computer.getRam(), computer.getMemory(), computer.getScreenSize(),computer.getUnitPrice(),
                    computer.getDiscountRate(), computer.getAmountStock());
        }
    }
}


