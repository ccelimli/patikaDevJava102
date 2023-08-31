import java.sql.SQLOutput;
import java.util.*;

public class Computer extends Product {
    private Scanner input = new Scanner(System.in);
    private int computerId = 1;

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public Integer getComputerId() {
        return this.computerId;
    }

    private List<Computer> computers = new ArrayList<>();

    public Computer() {
        super();
    }

    ;

    public Computer(Integer id, Integer unitPrice, Float discountRate, Integer amountStock, String productName, String brandName, Integer memory, Float screenSize, Integer ram) {
        super(id, unitPrice, discountRate, amountStock, productName, brandName, memory, screenSize, ram);
    }

    public void process() {
        while (true) {
            System.out.println("İşlem Seç");
            System.out.println("1 - Ekleme");
            System.out.println("2 - Silme");
            System.out.println("3 - Listeleme");
            System.out.println("4 - Markaya Göre Arama");
            System.out.println("5 - Id'ye Göre Arama");
            System.out.println("6 - Geri Dön");
            int select = input.nextInt();
            switch (select) {
                case 1 -> this.add();
                case 2 -> this.delete();
                case 3 -> {
                    this.displayComputers();
                }
                case 4 -> this.getByBrand();
                case 5 -> this.getById();
                case 6 -> Store.start();
                default -> System.out.println("Yanlış Seçim");
            }
        }
    }

    private void getById() {
        System.out.println("Ürüne ait ID giriniz: ");
        Integer findId = input.nextInt();
        for (Computer item : computers) {
            if (Objects.equals(item.getId(), findId)) {
                System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%.2f\t%d",
                        item.getId(), item.getBrandName(), item.getProductName(),
                        item.getRam(), item.getMemory(), item.getScreenSize(), item.getUnitPrice(),
                        item.getDiscountRate(), item.getAmountStock());
            } else {
                System.out.println(findId + " numaralı ID'ye ait herhangi bir ürün bulunamadı!");
            }
        }
    }

    private void getByBrand() {
        System.out.println("Marka İsmi Giriniz: ");
        String brandName = input.nextLine();
        for (Computer item : computers) {
            if (Objects.equals(item.getBrandName(), brandName)) {
                System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%.2f\t%d",
                        item.getId(), item.getBrandName(), item.getProductName(),
                        item.getRam(), item.getMemory(), item.getScreenSize(), item.getUnitPrice(),
                        item.getDiscountRate(), item.getAmountStock());
            } else {
                System.out.println(brandName + " markasına ait herhangi bir ürün bulunamadı!");
            }
        }
    }


    public void add() {
        Computer computer = new Computer();
        computer.setId(this.getComputerId());

        System.out.println("Ücret: ");
        Integer unitPrice = input.nextInt();
        computer.setUnitPrice(unitPrice);


        System.out.println("İndirim Oranı: ");
        Float discountRate = input.nextFloat();
        computer.setDiscountRate(discountRate);

        System.out.println("Stok Adedi: ");
        Integer amountStock = input.nextInt();
        computer.setAmountStock(amountStock);

        System.out.println("Ürün Adı: ");
        String productName = input.nextLine();
        computer.setProductName(productName);

        System.out.println("Marka Seç: ");
        computer.setBrandName(new Brand().selectBrand());

        System.out.println("Hafıza: ");
        Integer memory = input.nextInt();
        computer.setMemory(memory);

        System.out.println("Ekran Boyutu: ");
        Float screenSize = input.nextFloat();
        computer.setScreenSize(screenSize);

        System.out.println("Ram: ");
        Integer ram = input.nextInt();
        computer.setRam(ram);

        this.computers.add(computer);
        System.out.println("Eklenen Ürün: ");
        System.out.format("Id\tMarka\tÜrün Adı\tRam\tHafıza\tEkran Boyutu\tFiyat\tİndirim Oranı\tStok Adedi\n");
        System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%.2f\t%d\n\n",
                computer.getId(), computer.getBrandName(), computer.getProductName(),
                computer.getRam(), computer.getMemory(), computer.getScreenSize(), computer.getUnitPrice(),
                computer.getDiscountRate(), computer.getAmountStock());
        this.setComputerId(this.getComputerId() + 1);
    }

    public void delete() {
        this.displayComputers();

        System.out.println("\n\nSilmek istediğiniz ürün: ");
        Integer selectId = input.nextInt();
        Iterator<Computer> computerIterator=this.computers.iterator();
        while(computerIterator.hasNext()){
            if (computerIterator.next().getId().equals(selectId)){
                computerIterator.remove();
                System.out.println("Silme İşlemi Başarılı.");
                this.displayComputers();
            }
            else{
                System.out.println("Silme İşleminde Bir Hata Oluştu!");
            }
        }

    }

    private void displayComputers() {
        if (this.computers.isEmpty()) {
            System.out.println("Liste Boş!\n\n");
            System.out.println("Ana menüye dönmek için tuşa basın: 'Y'");
            String letter = input.nextLine();
            letter = letter.toUpperCase();
            switch (letter) {
                case "Y" -> Store.start();
                default -> System.out.println("Yanlış Seçim!");
            }
        }
        for (Computer item : computers) {
            System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%.2f\t%d",
                    item.getId(), item.getBrandName(), item.getProductName(),
                    item.getRam(), item.getMemory(), item.getScreenSize(), item.getUnitPrice(),
                    item.getDiscountRate(), item.getAmountStock());
        }
    }
}


