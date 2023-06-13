import java.util.*;
//How to check if two given String is the anagram of
// each other An anagram contains are of the same length
// and contains the same character, but in a different order,
// for example, "Army" and "Mary" is the anagram.
// Your program should return true if both Strings are the anagram, false otherwise

public class anagramCheck {
    public static void main(String[] args) {
        String kelime1 = "abcd"; // 2 words to check if the word is anagram
        String kelime2 = "cdba";

        //we want to check if these words has the same exact characters
        //in order to do that we need to sort the character and
        // check if their characters are matching.
        // to check character by character
        // we need to convert these strings into char arrays
        char[] karakter1 = kelime1.toCharArray(); //converting strings into char arrays
        char[] karakter2 = kelime2.toCharArray();


        Arrays.sort(karakter1); //sorting the characters to match them if they are in the same order
        Arrays.sort(karakter2);

        System.out.println(karakter1);
        System.out.println(karakter2);

        // if both of the strings has the same characters in the same amount
        // that means they are equal arrays.
        if (Arrays.equals(karakter1, karakter2)) // if they are matching, true else false
            System.out.println("\ntrue\n");
        else
            System.out.println("\nfalse\n");
    }
}
