public class isPolindrome {

    public static boolean polindromeMu(String word) {
        int head = 0, tail = word.length() - 1;
        // boolean desicion;
        // char[] kelime = word.toCharArray();

        for (head = 0; head < word.length() / 2; head++, tail--) {
            if (word.charAt(head) != (word.charAt(tail))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String word1 = "pencil"; // 0
        // String word2 = "tool"; // 0
        // String word3 = "asddsa";// 1
        // String word4 = "zxcxz"; // 1

        String[] words = { "pencil", "tool", "asddsa", "zxcxz" };

        for (int j = 0; j < words.length; j++) {
            System.out.printf("%s, %b\n", words[j], polindromeMu(words[j]));

        }
        // System.out.printf("\n%s,%b\n", word1, polindromeMu(words[0]));
        // System.out.printf("%s,%b\n", word2, polindromeMu(word2));
        // System.out.printf("%s,%b\n", word3, polindromeMu(word3));
        // System.out.printf("%s,%b\n", word4, polindromeMu(word4));
    }
}

// for (int wordCounter = 0; wordCounter < words.length; wordCounter++) {
// int head = 0, tail = words[wordCounter].length() - 1;
// for (head = 0; head < words[wordCounter].length() / 2; head++) {
// for (tail = words[wordCounter].length() - 1; tail >
// words[wordCounter].length() / 2; tail--) {
// if (words[head].equals(words[tail])) {
// continue;
// } else {
// break;
// }

// }
// }
