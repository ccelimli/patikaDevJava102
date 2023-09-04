import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("Mercedes", "G63");

        try {
//            FileOutputStream outputStream= new FileOutputStream("serialization/src/araba.txt");
//            ObjectOutputStream output= new ObjectOutputStream(outputStream);
//            output.writeObject(car);
//            output.close();

            FileInputStream fileInputStream= new FileInputStream("serialization/src/araba.txt");
            ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
            Car newCar=(Car)inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}