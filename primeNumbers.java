public class primeNumbers {
    public static void main(String[] args) {
        int count = 2, limit = 50;
        int sayi = 1;

        while (sayi != 51) {
            if (isPrime(count) == true) {
                System.out.printf("%d, %d\n", sayi, count);
                sayi++;
            }
            count++;
        }
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}