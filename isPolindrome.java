public class isPolindrome {
    //    A palindrome is a word, phrase, number, or
//    sequence of characters that reads the same
//    forward and backward. In other words, it remains
//    unchanged when its characters are reversed.
//    For example, "radar," "level," and "madam"
//    are palindromic words.

    public static boolean polindromeMu(String word) {// we need to check the first and last characters of each word en move to the middle
        int head = 0; //to start from the first character of the word
        int tail = word.length() - 1; //last index(character) of each word

        for (head = 0; head < word.length() / 2; head++, tail--) { //even tho words has odd number of characters we do not need to check the middle character
            if (word.charAt(head) != (word.charAt(tail))) { //checking first and last characters are the same if not false else true
                return false;
            }
        }
        return true; // true statement is outside of the loop because we need
        // to check every character before deciding but if any of the characters
        // or not matching the word is not palindrome
    }

    public static void main(String[] args) {

        String[] words = {"pencil", "tool", "asddsa", "zxcxz"}; //words to check

        for (String word : words) {
            System.out.printf("%s, %b\n", word, polindromeMu(word));
        }
    }
}
