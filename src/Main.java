import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1;
        int s2;
        Random random = new Random();
        MagicBox<String> str = new MagicBox<>(7);
        MagicBox<Integer> num = new MagicBox<>(5);
        while (true){
            s1="слово"+random.nextInt(100);
            if (!str.add(s1)) break;
        }
        System.out.println("Магическая коробка типа String состоит из: ");
        str.printMagicBox();
        System.out.println("Случайное слово: ");
        System.out.println(str.pick());
        while (true){
            s2=random.nextInt(100);
            if (!num.add(s2)) break;
        }
        System.out.println("Магическая коробка типа int состоит из: ");
        num.printMagicBox();
        System.out.println("Случайное число: ");
        System.out.println(num.pick());
        System.out.println("\n\nРабота с незаполненной коробкой:");
        MagicBox<String> str2 = new MagicBox<>(6);
        str2.add("снег"); str2.add("лёд");
        System.out.println("Значения в коробке:");
        str2.printMagicBox();
        System.out.println("Попробуем использовать метод pick() на незаполненной коробке");
        str2.pick();
    }
}