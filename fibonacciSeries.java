public class fibonacciSeries {
//    The Fibonacci series is a sequence of numbers
//    in which each number is the sum of the two preceding numbers.
//    It starts with 0 and 1, and each subsequent number is
//    the sum of the two numbers before it. The sequence typically
//    begins as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
//    The Fibonacci series exhibits a pattern where each number is
//    the sum of the previous two numbers, resulting in exponential growth.

    public static void main(String[] args) {
        // Initialize variables for the first two Fibonacci numbers
        int first = 0, second = 1;
        int counter = 1; // Counter to track the number of terms printed

        // Print the first two Fibonacci numbers
        System.out.printf("%d | %d | ", first, second);

        // Calculate the next Fibonacci number
        int next = first + second;
        int previous = next, before = second; // Variables to track the two preceding Fibonacci numbers

        // Loop to calculate and print the remaining Fibonacci numbers
        while (counter < 20) { // Loop until the 20th term
            System.out.printf("%d | ", next); // Print the next Fibonacci number

            // Update the variables to continue the Fibonacci sequence
            before = previous;
            previous = next;
            next = previous + before;

            counter++; // Increment the counter
        }
    }
}
