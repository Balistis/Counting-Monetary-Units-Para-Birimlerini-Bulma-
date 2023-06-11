public class dupliChar {
    // How to print the duplicate characters from the given String?
    public static void printDuplicateCharacters(String stra) {
        int[] charCount = new int[256]; // Assuming ASCII characters
        String str = stra.toLowerCase();
        // Count the occurrence of each character
        for (int i = 0; i < str.length(); i++) { // int dizi icerisinde karakter cagirmak onun ascii degerini getirir
                                                 // 256 karakterlik int dzisine istenilen kelimenin karakterleri
                                                 // cagirildigi taktirde o an islenen karakterin ASCII degeri dizinin o
                                                 // hafizasina islenir. eger karakter cagirdigimiz int dizinin hafizasi
                                                 // 256dan az ise hata verecektir ve sadece ascii degerler icin
                                                 // kullanilmalidir
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < charCount.length; i++) {
            System.out.printf("%d - %d\n", i, charCount[i]);
        }

        // Print the duplicate characters
        System.out.print("Duplicate characters: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] > 1) {
                System.out.print(c + " ");
                charCount[c] = 0; // Mark the character as printed to avoid duplicates
            }
        }

        System.out.println(); // Print a new line
    }

    public static void main(String[] args) {
        String input = "java";
        printDuplicateCharacters(input);
    }
}
