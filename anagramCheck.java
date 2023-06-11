import java.util.*;
// ?12) How to check if two given String is the anagram of each other An anagram contains are of the same length and contains the same character, but in a different order, for example, "Army" and "Mary" is the anagram. Your program should return true if both Strings are the anagram, false otherwise

public class anagramCheck {
    public static void main(String[] args) {
        String kelime1 = "BCDE";
        String kelime2 = "ECBD";

        char[] karakter1 = kelime1.toCharArray();
        char[] karakter2 = kelime2.toCharArray();

        Arrays.sort(karakter1);
        Arrays.sort(karakter2);

        if (karakter1.equals(karakter2))
            System.out.println("\ntrue\n");
        else
            System.out.println("\nfalse\n");
    }
}
