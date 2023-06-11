public class StringToInteger {
    public static int atoi(String str) {
        // if (str == null || str.length() == 0) {
        // throw new IllegalArgumentException("Input string is empty or null");
        // }

        int sign = 1; // 1 for positive, -1 for negative
        int startIndex = 0;
        int result = 0;

        // Check if the string starts with a sign (+ or -) and adjust the startIndex and
        // sign accordingly
        if (str.charAt(0) == '+') {
            startIndex = 1;
        } else if (str.charAt(0) == '-') {
            sign = -1;
            startIndex = 1;
        }

        for (int i = startIndex; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                // Check for overflow
                if (result > Integer.MAX_VALUE / 10
                        || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    System.out.println("Input string represents a number outside the valid range");
                }

                result = result * 10 + digit;
            } else {
                // If a non-digit character is encountered, stop parsing
                break;
            }
        }

        return sign * result;
    }

    public static void main(String[] args) {
        String str1 = "asd";
        int num1 = atoi(str1);
        System.out.println("String: " + str1 + " => Integer: " + num1);

        String str2 = "+231";
        int num2 = atoi(str2);
        System.out.println("String: " + str2 + " => Integer: " + num2);

        String str3 = "-987";
        int num3 = atoi(str3);
        System.out.println("String: " + str3 + " => Integer: " + num3);
    }
}
