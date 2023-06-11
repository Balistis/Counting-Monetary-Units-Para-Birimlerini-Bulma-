public class fibonacciSeries {
    public static void main(String[] args) {
        int first = 0, second = 1;
        int counter = 1;
        System.out.printf("%d | %d | ", first, second);
        int next = first + second;
        int previous = next, before = second;

        while (counter < 20) {
            System.out.printf("%d | ", next);
            before = previous;
            previous = next;
            next = previous + before;

            counter++;
        }
    }
}
