// Java program for the above approach

import java.io.*;
import java.util.*;

class StringRotation2 {

    // java program to check if two strings are rotation of
    // each other or not
    static boolean checkString(String s1, String s2,
            int indexFound, int Size) {
        for (int i = 0; i < Size; i++) {

            // check whether the character is equal or not
            if (s1.charAt(i) != s2.charAt((indexFound + i) % Size))
                return false;

            // %Size keeps (indexFound+i) in bounds,
            // since it ensures it's value is always less
            // than Size
        }

        return true;
    }

    // Driver code
    public static void main(String args[]) {
        String s1 = "MADO";
        String s2 = "DOMA";

        if (s1.length() == s2.length()) {

            ArrayList<Integer> indexes = new ArrayList<Integer>(); // store occurrences of the
                                                                   // first character of s1
            for (int i = 0; i < s1.length(); i++) {
                if (s2.charAt(i) == s1.charAt(0)) {
                    indexes.add(i);
                }
            }

            boolean isRotation = false;

            // check if the strings are rotation of each
            // other for every occurrence of firstChar in s2
            for (int idx : indexes) {
                isRotation = checkString(s1, s2, idx, s1.length());

                if (isRotation)
                    break;
            }

            if (isRotation)
                System.out.println(
                        "TRUE");
            else
                System.out.println(
                        "FALSE");
        }
    }
}

// This code is contributed by shinjanpatra
