public class duplicateCheck {
    public static void main(String[] args) {
        int dizi[] = { 1, 4, 4, 4, 5, 5, 6, 6 };
        // int tekrarEden = Integer.MAX_VALUE;

        for (int i = 0; i < dizi.length; i++) {
            // int sayi1 = dizi[i];
            for (int j = i + 1; j < dizi.length; j++) {
                // int sayi2 = dizi[j];
                if (dizi[i] == dizi[j]) {
                    System.out.println(dizi[i]);
                    // if (tekrarEden == dizi[i] || tekrarEden == dizi[j])
                    // break;
                    // } else
                    // System.out.printf("%d\n", dizi[j]);
                }
            }
        }
    }
}
