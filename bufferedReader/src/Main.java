import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader= null;
        try {
//            fileReader = new FileReader("bufferedReader/src/input.txt");
//            BufferedReader bufferedReader= new BufferedReader(fileReader);
////            String line=bufferedReader.readLine();
////            while ((!line.equals(null))){
////                System.out.println(line);
////                line=bufferedReader.readLine();
////            }
//            String line;
//            while((line = bufferedReader.readLine()) != null){
//                System.out.println(line+"####");
//            }

            String data="Java";
            FileWriter fileWriter= new FileWriter("bufferedReader/src/input.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}