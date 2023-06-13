public class reverseStringIterative {
    public static void main(String[] args) {
        String cumle = "aras ateser"; //string to reverse
        StringBuilder tersCumle = new StringBuilder(); //string to create the new string

        for (int i = cumle.length() - 1; i >= 0; i--) {
            tersCumle.append(cumle.charAt(i)); //starting from the last character of the string and add it to the new string
            //System.out.println(tersCumle); //uncomment to observe the process
        }
        System.out.println(tersCumle);
    }

}
