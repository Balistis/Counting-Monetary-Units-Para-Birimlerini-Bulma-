public class secondBiggestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 6, -1, 9999999, 5, 8, 8};
        int max = Integer.MIN_VALUE; // Initialize the maximum value as the smallest possible integer
        int secondMax = Integer.MIN_VALUE; // Initialize the second maximum value as the smallest possible integer

        for (int j : arr) { //to analyse each value
            if (max < j) {
                secondMax = max; // Update the second maximum value with the previous maximum value, because there is a new bigger value
                max = j; // Update the maximum value with the current element
            } else if (max > j && secondMax < j) {
                secondMax = j; // Update the second maximum value if the current element is smaller than the maximum but greater than the current second maximum
            }
        }

        // Print the maximum and second maximum values
        System.out.printf("max: %d\nsecondMax: %d", max, secondMax);
    }
}
