import java.sql.SQLOutput;
import java.util.*;

public class SmartPhone extends Product{
    private int batteryPower;
    private String color;
    private int smartPhoneId=1;
    private List<SmartPhone> smartPhones= new ArrayList<>();
    Scanner input= new Scanner(System.in);

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatterryPower(int batterryPower) {
        this.batteryPower = batterryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSmartPhoneId() {
        return smartPhoneId;
    }

    public void setSmartPhoneId(int smartPhoneId) {
        this.smartPhoneId = smartPhoneId;
    }

    public SmartPhone(){
      super();
    }
    public SmartPhone(Integer id, Float unitPrice, Float discountRate, Integer amountStock, String productName, String brandName, Integer memory, Float screenSize, Integer ram, int batterryPower, String color) {
        super(id, unitPrice, discountRate, amountStock, productName, brandName, memory, screenSize, ram);
        this.batteryPower = batterryPower;
        this.color = color;
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
                case 3 -> this.displaySmartPhones();
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
        for (SmartPhone item : smartPhones) {
            if (Objects.equals(item.getId(), findId)) {
                System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%s\t%.2f\t%.2f\t%d",
                        item.getId(), item.getBrandName(), item.getProductName(),
                        item.getRam(), item.getMemory(), item.getScreenSize(),item.getBatteryPower(),item.getColor(), item.getUnitPrice(),
                        item.getDiscountRate(), item.getAmountStock());
            } else {
                System.out.println(findId + " numaralı ID'ye ait herhangi bir ürün bulunamadı!");
            }
        }
    }

    private void getByBrand() {
        System.out.println("Marka İsmi Giriniz: ");
        String brandName = input.next();
        for (SmartPhone item : smartPhones) {
            if (Objects.equals(item.getBrandName(), brandName)) {
                System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%s\t%.2f\t%.2f\t%d",
                        item.getId(), item.getBrandName(), item.getProductName(),
                        item.getRam(), item.getMemory(), item.getScreenSize(),item.getBatteryPower(),item.getColor(), item.getUnitPrice(),
                        item.getDiscountRate(), item.getAmountStock());
            } else {
                System.out.println(brandName + " markasına ait herhangi bir ürün bulunamadı!");
            }
        }
    }

    private void displaySmartPhones() {
        if (this.smartPhones.isEmpty()) {
            System.out.println("Liste Boş!\n\n");
            System.out.println("Ana menüye dönmek için tuşa basın: 'Y'");
            String letter = input.next();
            letter = letter.toUpperCase();
            if (letter.equals("Y")) {
                Store.start();
            } else {
                System.out.println("Yanlış Seçim!");
            }
        }
        for (SmartPhone item : smartPhones) {
            System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%s\t%.2f\t%.2f\t%d\n\n",
                    item.getId(), item.getBrandName(), item.getProductName(),
                    item.getRam(), item.getMemory(), item.getScreenSize(),item.getBatteryPower(),item.getColor(), item.getUnitPrice(),
                    item.getDiscountRate(), item.getAmountStock());
        }
    }

    private void delete() {
        this.displaySmartPhones();

        System.out.println("Silmek istediğiniz ürün: ");
        Integer selectId = input.nextInt();
        Iterator<SmartPhone> smartPhoneIterator= this.smartPhones.iterator();
        while(smartPhoneIterator.hasNext()){
            if (smartPhoneIterator.next().getId().equals(selectId)){
                smartPhoneIterator.remove();
                System.out.println("Silme İşlemi Başarılı.");
                this.displaySmartPhones();
            }
            else {
                System.out.println("Silme İşleminde Bir Hata Oluştu!");
            }
        }
    }

    private void add() {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setId(this.getSmartPhoneId());

        System.out.println("Ücret: ");
        Float unitPrice = input.nextFloat();
        smartPhone.setUnitPrice(unitPrice);

        System.out.println("İndirim Oranı: ");
        Float discountRate = input.nextFloat();
        smartPhone.setDiscountRate(discountRate);

        System.out.println("Stok Adedi: ");
        Integer amountStock = input.nextInt();
        smartPhone.setAmountStock(amountStock);

        System.out.println("Ürün Adı: ");
        String productName = input.next();
        smartPhone.setProductName(productName);

        System.out.println("Marka Seç: ");
        smartPhone.setBrandName(new Brand().selectBrand());

        System.out.println("Hafıza: ");
        Integer memory = input.nextInt();
        smartPhone.setMemory(memory);

        System.out.println("Ekran Boyutu: ");
        Float screenSize = input.nextFloat();
        smartPhone.setScreenSize(screenSize);

        System.out.println("Ram: ");
        Integer ram = input.nextInt();
        smartPhone.setRam(ram);

        System.out.println("Batarya: ");
        Integer batteryPower=input.nextInt();
        smartPhone.setBatterryPower(batteryPower);

        System.out.println("Renk: ");
        String color=input.next();
        smartPhone.setColor(color);

        this.smartPhones.add(smartPhone);
        System.out.println("Eklenen Ürün: ");
        System.out.format("%d\t%s\t%s\t%d\t%d\t%.2f\t%d\t%s\t%.2f\t%.2f\t%s\n\n",
                smartPhone.getId(), smartPhone.getBrandName(), smartPhone.getProductName(),
                smartPhone.getRam(), smartPhone.getMemory(), smartPhone.getScreenSize(),smartPhone.getBatteryPower(),smartPhone.getColor(), smartPhone.getUnitPrice(),
                smartPhone.getDiscountRate(), smartPhone.getAmountStock());
        this.setSmartPhoneId(this.getSmartPhoneId() + 1);
    }
}
