public class reverseStringIterative {
    // How to reverse a given String? java write recursive and iterative solutions.
    // For example, if a given input is "abcd," then your function should return
    // "dcba".
    public static void main(String[] args) {
        String kelime = "aras";
        StringBuilder tersKelime = new StringBuilder();

        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime.append(kelime.charAt(i));
        }
        System.out.println(tersKelime);
    }
}
