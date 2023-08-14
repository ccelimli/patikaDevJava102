public class Main {
    public static void main(String[] args) {
//        //Undefined
//        String s;
//
//        //null
//        String s1= null;
//
//        //empty
//        String s2="";

//        Integer str = 5;
//
//        Nullable<Integer> n = new Nullable<>(str);
//        n.run();


//        Test<Integer, String, Boolean> test= new Test<>(1,"str",true);
//        test.setX("patika");
//        test.showInfo();

        String[] words={"Java", "102", "Patika","Dev"};
        Integer[] numbers={1,2,3,4};
        Character[] characters={'J','A','V','A'};
//
//        Print.printArray(words);
//        System.out.println("------------------------------------------");
//        Print.printArray(numbers);
//        System.out.println("------------------------------------------");
//        Print.printArray(characters);

        Print.printArrays(words,numbers);
    }
}