public class secondBiggestNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 6, -1, 9999999, 5, 8, 8 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (max > arr[i] && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }
        System.out.printf("max: %d\nsecondMax: %d", max, secondMax);
    }
}
