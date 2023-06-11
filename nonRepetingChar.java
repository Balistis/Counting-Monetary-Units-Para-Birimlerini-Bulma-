public class nonRepetingChar {
    // How to find the first non-repeating character in a given String?
    // for example, if the given String is
    // "Java" then the first non-repeated character is "J"
    public static void main(String[] args) {
        String kelime = "java";
        int[] ASCII = new int[256];

        for (int i = 0; i < kelime.length(); i++) {
            ASCII[kelime.charAt(i)]++;
        }
        // for (char i : kelime.toCharArray()) {
        // ASCII[kelime.charAt(i)]++;
        // }
        for (int j = 0; j < kelime.length(); j++) {
            if (ASCII[kelime.charAt(j)] == 1)
                System.out.println(kelime.charAt(j));
            // break; -> uncomment it if we need to 'first' non repeating character
        }
    }
}
