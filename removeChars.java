import java.util.*;

public class removeChars {
    // How to remove characters from the first String which are present in the
    // second String? java function that takes two strings as arguments and removes
    // the characters from the first string, which are present in the second string.
    // For example, if the first String "India is great" and the second String is
    // "in" then the output should be "da s great"
    public static void main(String[] args) {
        String kelime1 = "aras ateser";
        String kelime2 = "a";
        StringBuilder yeniKelime = new StringBuilder();
        // char[] kelime2Harfleri = kelime2.toCharArray();
        HashSet<Character> kelime2Chars = new HashSet<>();
        for (int i = 0; i < kelime2.length(); i++) {
            kelime2Chars.add(kelime2.charAt(i));
        }
        // System.out.println(kelime2Chars);

        for (char c : kelime1.toCharArray()) {
            if (!kelime2Chars.contains(c))
                yeniKelime.append(c);
        }
        System.out.println(yeniKelime);
    }
}
