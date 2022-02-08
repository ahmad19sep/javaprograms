package src.expressionNStatments;

import java.util.Objects;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER TO COMPARE: ");
        int max = scanner1.nextInt();
        int min = max;
        int ch = 0;
        while (true) {
            System.out.println("Enter number: ");
            boolean hasnext = scanner.hasNextInt();
            if (hasnext) {

                int num = scanner.nextInt();
                scanner.nextLine();
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }

            } else {
                System.out.println("invalid number");
                break;
            }

        }
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}






