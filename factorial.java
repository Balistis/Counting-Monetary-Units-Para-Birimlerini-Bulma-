public class factorial {

    public static Integer facto(int sayi) {
        if (sayi == 1 || sayi == 0)
            return 1;

        return sayi * facto(sayi - 1);
    }

    public static void main(String[] args) {
        int number = 4, factorial = 1; // 24

        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        System.out.println(facto(4));
    }
}
