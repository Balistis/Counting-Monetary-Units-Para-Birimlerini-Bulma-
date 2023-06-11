import java.util.ArrayList;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        String cumle = "aras ateser", tersCumle = "";
        char karakter;
        String yeniCumle = new String();
        List<String> yeniCumlem = new ArrayList<>();

        // System.out.println(tersCumle.length());
        for (int i = cumle.length() - 1; i >= 0; i--) {
            tersCumle = tersCumle + cumle.charAt(i);
            System.out.println(tersCumle);
        }
        System.out.println(tersCumle);
    }

}
