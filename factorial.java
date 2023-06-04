public class factorial {
    public static void main(String[] args) {
        int number = 4, factorial = 1; // 24

        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
