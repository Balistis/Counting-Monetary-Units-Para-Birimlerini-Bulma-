import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.sound.sampled.AudioFileFormat.Type;

public class sortArray {
    public static void main(String[] args) {// reversing a list var yarin calis

        // Integer number = 250;
        // int unboxing = number.intValue();
        // System.out.println(unboxing);

        int[] dizi = { 5, -2, 23, 7, 87, -42, 509 };
        int max = dizi[0];
        ArrayList<Integer> yeniDizi = new ArrayList<Integer>();

        for (int i = 0; i < dizi.length; i++) {
            if (max < dizi[i]) {
                yeniDizi.add(dizi[i]);
            }

        }
        System.out.println(yeniDizi);
        // Arrays.sort(dizi);
        // for (int j = 0; j < dizi.length; j++) {
        // System.out.print(dizi[j] + " ");
        // // System.out.print(" ");
        // }

    }
}