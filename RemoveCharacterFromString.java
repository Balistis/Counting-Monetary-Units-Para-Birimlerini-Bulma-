public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String kelime = "aras";
        char harf = 'a'; //character to remove

        StringBuilder yeniKelime = new StringBuilder(); //create a new string without the letter we want to delete

        for (int i = 0; i < kelime.length(); i++) { //check every character in the string
            if (harf != kelime.charAt(i)) //if the character is not matching with the letter add it into the new string
                yeniKelime.append(kelime.charAt(i));
        }
        System.out.println(yeniKelime);
    }
}
