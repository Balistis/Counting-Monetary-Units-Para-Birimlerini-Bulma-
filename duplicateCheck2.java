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

        for (int i = 0; i < kelime.length(); i++) {
            for (int j = i; j < kelime.length(); j++) {
                if (kelime.charAt(i) == kelime.charAt(j)) {
                    sayac++;
                }
            }
            if (maks < sayac) {
                maks = sayac;
                harf = kelime.charAt(i);
            }
            sayac = 0;
        }
        System.out.printf("%c - %d", harf, maks);
    }
}