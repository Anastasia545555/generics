import java.util.*;
public class MagicBox <T>{
    private T[] boxes;
    public MagicBox(int size){
        this.boxes=(T[]) new Object[size];
    }
    public boolean add(T item){
        for (int i=0; i<boxes.length; i++){
            if (boxes[i]==null) {
                boxes[i]=item;
                return true;
            }
        }
        return false;
    }
    public T pick(){
        boolean mark=false;
        int m=0;
        for (int i=0; i<boxes.length; i++){
            if (boxes[i]==null) {
                mark=true;
                m++;
            }
        }
        if (mark) {
            throw new RuntimeException(String.format("Коробка не полна, незаполненных ячеек: %d", m));
        }
        Random random = new Random();
        int randomInt = random.nextInt(boxes.length-1);
        return boxes[randomInt];
    }
    public void printMagicBox(){
        for (int i=0; i<boxes.length; i++){
            System.out.print(boxes[i]+"   ");
        }
        System.out.println("");
    }
}
