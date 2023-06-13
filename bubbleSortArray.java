public class bubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 6, 3};

        // Bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for iterations
            for (int j = 0; j < arr.length - i - 1; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) {//change the arrow to make it in descending order
                    
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
