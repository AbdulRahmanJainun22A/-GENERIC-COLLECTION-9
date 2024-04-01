

import java.util.ArrayList;
import java.util.ArrayDeque;
/**
 *
 * @author Abdul Rahman Jainun
 */

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        
        System.out.println("Isi ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }
        
        // Contoh penggunaan ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        
        System.out.println("\nIsi ArrayDeque:");
        for (int item : arrayDeque) {
            System.out.println(item);
        }
    }
}
