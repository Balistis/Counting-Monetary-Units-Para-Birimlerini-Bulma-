import java.util.Random;

public class basamakToplami { // sum of the digits of a random number
    public static void main(String[] args) {
        Random rand = new Random(); //creating a random class to get random integers
        int number = rand.nextInt(1001); // generating a random integer between 1 and 1001
        int sum = 0; // assigned number to collect the digits one by one

        System.out.println(number); // printing the random number we got on the console: 532

        while (number != 0) { // until there are no numbers to cut, keep running
            int basamak = number % 10; // get the last digit of the current number: 2,3,5
            sum += basamak; // sum of the last digits: 0 + 2 + 3 + 5
            number /= 10; // cut the last digit off: 53, 5
        }

        System.out.println(sum); // printing sum of all the digits we got from random number: 10
    }
}