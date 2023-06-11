import javax.xml.transform.Source;

public class StringRotation {
    // How to check if two strings are rotations of each other?
    // Write an efficient program to test if two given String is a rotation of each
    // other or not, e.g. if the given String is "XYZ" and "ZXY" then your function
    // should return true, but if the input is "XYZ" and "YXZ" then return false.
    public static void main(String[] args) {
        String str1 = "MADO";
        String str2 = "DOMA";

        String strFinal = str1 + str1;

        if (strFinal.contains(str2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
