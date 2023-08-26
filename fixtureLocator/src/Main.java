import java.util.LinkedHashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        LinkedHashSet<String> matches = new LinkedHashSet<>();
        matches.add("Galatasaray");
        matches.add("Fenerbahçe");
        matches.add("Beşiktaş");
        matches.add("Başakşehir");
        matches.add("Bursaspor");

        LinkedHashSet<String> copyMatches = new LinkedHashSet<>();
        LinkedHashSet<String> secondCopyMatches= new LinkedHashSet<>();
        for (int i=0; i<matches.size(); i++){
            copyMatches.add((String) matches.toArray()[i]);
        }

        for  (int i=0; i<(matches.size()/2);i++){
            int random1=random.nextInt(0,copyMatches.size());
            secondCopyMatches.add((String) copyMatches.toArray()[random1]);
            copyMatches.remove((String) copyMatches.toArray()[random1]);
        }

        secondCopyMatches.add(null);
        System.out.println("-----------------------------------------------");
        for (int i= 0; i<copyMatches.size(); i++){
            if (secondCopyMatches.toArray()[i]!=null){
                System.out.println(copyMatches.toArray()[i]+" vs "+ secondCopyMatches.toArray()[i]);
            }
            else{
                System.out.println(copyMatches.toArray()[i]+ " vs "+ "BAY");
            }
        }
    }
}