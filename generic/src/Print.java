public class Print {
    public static <T> void printArray(T[] arr){
        for (T array:arr){
            System.out.println(array);
        }
    }

    public static <T,U> void printArrays(T[] arr, U[] arrs){
        for (T array:arr){
            System.out.println(array);
        }

        for (U array:arrs){
            System.out.println(array);
        }
    }
}
