public class reverseStringRecursive {
    public static String reverseRecursive(String str) {
        // Base case: if the string is empty or has only one character, return the
        // string itself
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: reverse the substring from index 1 to end and concatenate the
        // first character at the end
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "aras";
        String reversed = reverseRecursive(input);
        System.out.println("Reversed string: " + reversed);
    }
}