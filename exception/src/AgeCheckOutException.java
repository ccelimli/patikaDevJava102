public class AgeCheckOutException extends Exception{
    public AgeCheckOutException(String message) {
        super(message);
    }

    @Override
    public String toString(){
        return "Bu AgeCheck sınfına ait bir Exception";
    }
}
