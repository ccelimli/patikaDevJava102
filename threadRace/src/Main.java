import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();

        for (int i=1; i<=10000; i++){
            numbers.add(i);
        }

        Counter counter= new Counter(numbers);
        ExecutorService executorService= Executors.newFixedThreadPool(4);

        executorService.execute(counter);

    }
}