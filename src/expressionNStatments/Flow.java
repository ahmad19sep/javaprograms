package src.expressionNStatments;

import java.util.Locale;

public class Flow {
    public static void main(String[] args) {
        int num = 400013;
        primeNumber(num);


    }

    public static void primeNumber(int num) {
        int temp = 0;
        int j = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                j++;
                break;
            }
        }
        if (j % 2 != 0) {

            System.out.println("Your number " + num + " is not a Prime Number");
        } else
            System.out.println("Your number " + num + " is  a Prime Number");
    }
}