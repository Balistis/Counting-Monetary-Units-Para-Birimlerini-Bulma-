public class reverse {
    public static void main(String[] args) {
        String cumle = "aras ateser", tersCumle = "";
        char karakter;

        // System.out.println(tersCumle.length());
        for (int i = cumle.length() - 1; i >= 0; i--) {
            karakter = cumle.charAt(i);
            tersCumle = tersCumle + karakter;
            System.out.println(tersCumle);
        }
        // System.out.println(tersCumle);
    }

}
