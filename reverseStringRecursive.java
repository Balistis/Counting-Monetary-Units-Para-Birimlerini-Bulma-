import javax.crypto.spec.PSource;

public class reverseStringRecursive {
    public static String reverseRecursive(String str) {
        // Base case: if the string is empty or has only one character, return the
        // string itself
        if (str.isEmpty() || str.length() == 1) { //run if there is any character
            return str;
        }
        //reverseRecursive(str.substring(1)) + str.charAt(0);
        // Recursive case: reverse the substring from index 1 to end and concatenate the
        // first character at the end
        return reverseRecursive(str.substring(1)) + str.charAt(0);//ras + a >> as + r + a >> s + a + r + a
    }

    public static void main(String[] args) {
        String input = "kalem";
        String reversed = reverseRecursive(input);
        System.out.println("Reversed string: " + reversed);
        //System.out.println(input.substring(1) + input.charAt(0));
    }
}