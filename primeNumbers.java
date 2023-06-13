public class primeNumbers {
    public static void main(String[] args) {
        int count = 2; //targeted numbers
        int sayi = 1; //counter

        while (sayi != 51) {
            if (isPrime(count)) {
                System.out.printf("%d -> %d\n", sayi, count); //printing count of the numbers and primes
                sayi++;
            }
            count++;
        }
    }

    public static boolean isPrime(int num) {
        if (num == 2) //numbers that dividable by 2 are not prime, except 2
            return true;

        if (num % 2 == 0) ////numbers that dividable by 2 are not prime
            return false;

        for (int i = 3; i < num; i = i + 2) { //try to divide each number by smaller numbers
            if (num % i == 0)
                return false;
        }
        return true;
    }
}