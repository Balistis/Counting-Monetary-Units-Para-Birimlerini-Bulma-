import java.util.ArrayList;

public class sortArray {
    public static void main(String[] args) {
        int[] dizi = { 5, -2, 23, 7, 87, -42, 509 };

        int max = dizi[0];
        ArrayList<Integer> yeniDizi = new ArrayList<Integer>();

        for (int i = 0; i < dizi.length; i++) {
            if (max < dizi[i])
                max = dizi[i];
        }
    }
}