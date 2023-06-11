import java.util.*;

public class removeDupChar {
    // How to remove all duplicates from a given string?
    // Write a program to remove all the duplicate characters from a given input
    // String, like, if the given String is "Java" then the output should be "Java".
    // The second or further occurrence of duplicates should be removed.
    public static void main(String[] args) {
        String kelime = "java";
        HashSet<Character> karakter = new HashSet<>();
        StringBuilder yeniKelime = new StringBuilder();

        for (int i = 0; i < kelime.length(); i++) {
            karakter.add(kelime.charAt(i));
        }
        for (char c : karakter) {
            yeniKelime.append(c);
        }
        System.out.println(kelime);
        System.out.println(yeniKelime);
    }
}
