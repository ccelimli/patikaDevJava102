import javax.management.openmbean.ArrayType;
import java.util.ArrayList;

public class MyList<T> {
    private T[] array;
    private int sizeCount;
    private int capacity;

    public MyList() {
        this.setCapacity(10);
        this.setArray(new Object[this.getCapacity()]);
    }

    public MyList(int capacity) {
        this.setCapacity(capacity);
        setArray(new Object[getCapacity()]);
    }

    // METHOD THAT RETURNS TO A LIST OF GIVEN ARRAY AS A STRING
    public String toString() {
        String str = "";
        for (int i = 0; i < size(); i++) {
            if (getArray()[i] instanceof Integer) {
                T num = getArray()[i];
                str = str + Integer.toString((Integer) num) + " ";
            } else if (getArray()[i] instanceof String) {
                str = str + getArray()[i] + " ";
            }
        }
        return str;
    }

    // IT ADDS AN ELEMENT TO AN ARRAY
    public void add(T data) {
        if (size() >= getCapacity()) {
            DoubleCapacity();
        }
        this.getArray()[size()] = data;
    }

    // DOUBLES CAPACITY
    public void DoubleCapacity() {
        setCapacity(getCapacity() * 2);
    }

    // IT RETURNS THE NUMBE OF ELEMENTS IN THE ARRAY
    public int size() {
        int count = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (getArray()[i] != null) {
                count++;
            }
        }
        return count;
    }

    // VALUE OF AN INDEX
    public T get(int index){
        if (getArray()[index] == null){
            return null;
        }
        return getArray()[index];
    }

    // REMOVE A VALUE
    public void remove(int index){
        if (getArray()[index]!=null){
            this.getArray()[index]=null;
            // IT SLIDES REMAINING INDEXSES
            for(int i=index +1; i<=size(); i++){
                getArray()[i-1]=getArray()[i];
            }
        }
        else {
            System.out.println("null");
        }
    }

    // SET A VALUE TO AN INDEX
    public void set(int index, T data){
        if (getArray()[index]==null){
            System.out.println("null");
        }
        getArray()[index]=data;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = (T[]) array;
    }

    public int getSizeCount() {
        return sizeCount;
    }

    public void setSizeCount(int sizeCount) {
        this.sizeCount = sizeCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
