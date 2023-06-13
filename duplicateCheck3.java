public class duplicateCheck3 {
    // How to print the duplicate characters from the given String?
    public static void printDuplicateCharacters(String stra) {
        int[] charCount = new int[256]; //characters being counted are from the ASCII character set
        String str = stra.toLowerCase(); //lowering every character to not have any problems with different cases

        // Count the occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            //Calling a character into an ASCII array will bring its ASCII value: {97 - a}
            //if a character is repeating the value in that memory will increase by one
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < charCount.length; i++) { //printing out the all ASCII array and repeating characters in the memory
            System.out.printf("%d - %d\n", i, charCount[i]);
        }

        // Print the duplicate characters
        System.out.print("Duplicate characters: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); //checking each character one by one
            if (charCount[c] > 1) { //checking if the character has more than 1 value in its memory
                System.out.print(c + " ");
                charCount[c] = 0; // Marking the current character as 0, so when character is encountered again it won't print it out again. Because if we do not change it as 0, duplicated values will be shown as much as their duplicated characters. By doing that when we encounter a value that duplicated and printed, we won't print it again
            }
        }
    }

    public static void main(String[] args) {
        String input = "javav";
        printDuplicateCharacters(input);
    }
}
