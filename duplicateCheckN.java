public class duplicateCheckN {
    // How to find the first non-repeating character in a given String?
    // for example, if the given String is
    // "Java" then the first non-repeated character is "J"
    public static void main(String[] args) {
        String kelime = "java";
        int[] ASCII = new int[256]; //characters being counted are from the ASCII character set

        // Count the occurrence of each character
        for (int i = 0; i < kelime.length(); i++) {
            //Calling a character into an ASCII array will bring its ASCII value: {97 - a}
            //if a character is repeating the value in that memory will increase by one
            ASCII[kelime.charAt(i)]++;
        }

        for (int j = 0; j < kelime.length(); j++) {
            if (ASCII[kelime.charAt(j)] == 1) { //print the character if its memory only bring up once
                System.out.println(kelime.charAt(j));
                //break; // uncomment it if we need the 'first' non repeating character
            }
        }
    }
}
