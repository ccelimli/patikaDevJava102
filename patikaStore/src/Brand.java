import java.util.*;

public class Brand {
    private Integer id;
    private String name;
    private Map<Integer,String> brands= new HashMap<>();
    private Scanner input= new Scanner(System.in);

    public Brand(){
        this.defineBrand();
    }
    public Brand(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void defineBrand(){
        this.brands.put(1,"Samsung");
        this.brands.put(2,"Lenovo");
        this.brands.put(3,"Apple");
        this.brands.put(4,"Huawei");
        this.brands.put(5,"Casper");
        this.brands.put(6,"Asus");
        this.brands.put(7,"Hp");
        this.brands.put(8,"Xiaomi");
        this.brands.put(9,"Monster");
    }


    public String selectBrand() {
        for (Integer item : this.brands.keySet()) {
            System.out.println(item + " : " + this.brands.get(item));
        }

        System.out.println("Seçim: ");
        Integer selectBrandId= input.nextInt();

        return this.brands.get(selectBrandId);

    }

    public void displayBrand(){
        for (Integer item : this.brands.keySet()) {
            System.out.println(item + " : " + this.brands.get(item));
        }
    }

    public String findBrandById(Integer id) {
        return brands.get(id);
    };

    public void location(){
        this.displayBrand();
        while (true){
            System.out.println("Ana menüye dönmek için tuşa bas: 'Y' ");
            String select= input.next();
            select=select.toUpperCase();
            switch (select){
                case "Y" ->Store.start();
                default -> System.out.println("Yanlış Seçim");
            }
        }
    }
}
