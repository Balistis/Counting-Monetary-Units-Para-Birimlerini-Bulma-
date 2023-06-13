public class factorial {

    //factorial calculator

    public static Integer facto(int sayi) {//factorial calculation in function
        if (sayi == 1 || sayi == 0)
            return 1;

        return sayi * facto(sayi - 1);
        //multiply the number, and give 1 value less number
        // to the same function until it gets to 1
    }

    public static void main(String[] args) {//factorial calculation in for loop
        int number = 4, factorial = 1; // 24

        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial); //in for loop
        System.out.println(facto(4)); //in function
    }
}
