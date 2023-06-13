public class largestNumber {
    public static void main(String[] args) {
        int[] sayiDizi = {21, 11, 32, 5, 9, 1}; //integer array to check
        int max = Integer.MIN_VALUE; //declaring the smallest integer

        for (int j : sayiDizi) {
            if (max < j) {
                max = j; //if the current number is bigger than the max number change it and continue searching
            }
        }
        System.out.println(max);
    }
}
