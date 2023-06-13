public class duplicateCheck2 {
    // How to find the maximum occurring character in a given String?
    // Write an efficient Java/C/Python program to return the maximum occurring
    // character in the input string, e.g., if the input string is "Java" then the
    // function should return 'a'.
    public static void main(String[] args) {
        String kelime = "aras";
        int sayac = 0;
        int maks = 0;
        char harf = ' ';

        //in order to check each character with the others in the string we will use nested-for loops
        for (int i = 0; i < kelime.length(); i++) { //checking will start from the head and continue until the end
            for (int j = i; j < kelime.length(); j++) {
                // checking will start from the next character we are looking for,
                // by that we won't match the exact same characters
                if (kelime.charAt(i) == kelime.charAt(j)) {
                    sayac++; //if the characters are same we need to increase the value by one
                }
            }
            if (maks < sayac) {
                //if the value is bigger than the last maks value,
                // that means we found a character that occurred more than the previous character
                maks = sayac; //changing the amount of the character
                harf = kelime.charAt(i); //changing the repetitive character
            }
            sayac = 0; //restarting the counter to count the next character in the strings
        }
        System.out.printf("%c - %d", harf, maks);
    }
}