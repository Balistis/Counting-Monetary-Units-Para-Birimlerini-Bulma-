public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String kelime = "aras";
        char harf = 'a';
        StringBuilder yeniKelime = new StringBuilder();

        for (int i = 0; i < kelime.length(); i++) {
            if (harf != kelime.charAt(i))
                yeniKelime.append(kelime.charAt(i));
        }
        System.out.println(yeniKelime);
    }
}
