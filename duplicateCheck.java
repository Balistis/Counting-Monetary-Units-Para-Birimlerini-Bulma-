import java.util.HashMap;
import java.util.Map;

public class duplicateCheck {
    public static void main(String[] args) {
        HashMap<Character, Integer> sayim = new HashMap<>();
        String kelime = "java";
        int sayac = 0;
        // System.out.println(kelime.toCharArray());
        for (char c : kelime.toCharArray()) {
            sayim.put(c, sayim.getOrDefault(c, 0) + 1);
        }
        // System.out.println(sayim);
        for (Map.Entry<Character, Integer> entry : sayim.entrySet()) {
            if (entry.getValue() > 1)
                System.out.printf("%c, %d", entry.getKey(), entry.getValue());
        }
    }
}
