import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            list.add(random.nextInt(100));
        }

        list.forEach(i -> System.out.print(i + "-"));
        System.out.println("\n\n###################\n\n");
        list.stream().filter(i -> i > 60).forEach(i -> System.out.print(i + "-"));
        System.out.println("\n\n###################\n\n");
        list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + "-"));
        System.out.println("\n\n###################\n\n");
        list.stream().map(i->i=0).forEach(i-> System.out.print(i+"-"));

    }
}