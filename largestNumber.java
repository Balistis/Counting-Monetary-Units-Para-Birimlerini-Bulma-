public class largestNumber {
    public static void main(String[] args) {
        int[] sayiDizi = { 21, 11, 32, 5, 9, 1 };
        int max = 0;

        for (int i = 0; i < sayiDizi.length; i++) {
            if (max < sayiDizi[i]) {
                max = sayiDizi[i];
            }
        }
        System.out.println(max);
    }
}
