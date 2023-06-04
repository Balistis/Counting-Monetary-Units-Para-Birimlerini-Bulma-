import java.util.Random;

public class basamakToplami { // sum of the digits from a random number
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1001); // random number generated up to 1000
        int sum = 0;

        System.out.println(number); // printing the random number we got on the console

        while (number != 0) { // until number becomes 0 keep running
            int basamak = number % 10; // get the last digit
            sum += basamak; // sum the last digit we have
            number /= 10; // cut the last digit off
        }

        System.out.println(sum); // printing sum of all the digits we got from random number
    }
}