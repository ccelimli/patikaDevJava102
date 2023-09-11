import java.util.ArrayList;
import java.util.List;

public class Counter implements Runnable {
    private List<Integer> numberToCheck;
    private List<Integer> evens = new ArrayList<>();
    private List<Integer> odds = new ArrayList<>();
    private int indexToStart;
    private int indexToEnd;

    public Counter(List<Integer> numberToCheck) {
        this.numberToCheck = numberToCheck;
        this.indexToStart = -2500;
        this.indexToEnd = 0;
    }

    public List<Integer> getNumberToCheck() {
        return numberToCheck;
    }

    public void setNumberToCheck(List<Integer> numberToCheck) {
        this.numberToCheck = numberToCheck;
    }

    public List<Integer> getEvens() {
        return evens;
    }

    public void setEvens(List<Integer> evens) {
        this.evens = evens;
    }

    public List<Integer> getOdds() {
        return odds;
    }

    public void setOdds(List<Integer> odds) {
        this.odds = odds;
    }

    public int getIndexToStart() {
        return indexToStart;
    }

    public void setIndexToStart(int indexToStart) {
        this.indexToStart = indexToStart;
    }

    public int getIndexToEnd() {
        return indexToEnd;
    }

    public void setIndexToEnd(int indexToEnd) {
        this.indexToEnd = indexToEnd;
    }

    @Override
    public void run() {
        this.indexToStart += 2500;
        this.indexToEnd += 2500;
        addToNumber();
    }

    public synchronized void addToNumber() {
        int i = this.indexToStart;
        while (i < this.indexToEnd) {
            int number = numberToCheck.get(i);
            List<Integer> listToAdd = number % 2 == 0 ? evens : odds;
            listToAdd.add(number);
            i++;
        }
        System.out.println("Odds");
        for (Integer item: this.odds){
            System.out.print(item+"-");
        }

        System.out.println("\n\nEvens");
        for (Integer item: this.evens){
            System.out.print(item+"-");
        }
    }
}
