import java.util.HashMap;
import java.util.Map;

//How to print the duplicate characters from the given String? (solution)
//for example, if given String is "C++" then your program should
// print "+" Similarly, if the input is "Java and JavaScript" then your program should
// print "J", "a" and "v". You can ignore the case for finding duplicates.

public class duplicateCheck {
    public static void main(String[] args) {
        //creating a hashMap to track each character
        //HashMaps does not allow duplicate characters if we create a hash map with a string each character
        //will be stores only once, and each repetitive characters can be detect.

        HashMap<Character, Integer> sayim = new HashMap<>(); //creating a hash map for each character and their number of presence in the string
        String kelime = "Java and JavaScript"; //string that we are investing
        System.out.println(kelime);

        for (char c : kelime.toCharArray()) { //for each look for each character in string in order to put in hashMap
            sayim.put(c, sayim.getOrDefault(c, 0) + 1);
            // if the character does not have a match in the hashmap it gets the value 0,
            // if it does that key's value increased by 1
        }

        for (Map.Entry<Character, Integer> entry : sayim.entrySet()) {
            //printing every key that has value more than 1,
            //1 means, that key has only 1 item. if it is more that means current key is repeating in the string
            if (entry.getValue() > 1)
                System.out.printf("%c, %d\n", entry.getKey(), entry.getValue());
        }
    }
}
