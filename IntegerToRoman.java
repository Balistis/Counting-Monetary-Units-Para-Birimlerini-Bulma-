import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Create a mapping of integer values to Roman numeral symbols
        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        // Iterate through the mapping and subtract the largest possible value from the
        // given number
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (num >= value) {
                sb.append(symbol);
                num -= value;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 31;
        String roman = intToRoman(num);
        System.out.println("Integer: " + num);
        System.out.println("Roman numeral: " + roman);
    }
}
