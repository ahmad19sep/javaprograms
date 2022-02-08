package src.expressionNStatments;

import java.util.Objects;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {
        int total=0;
        Scanner getInput = new Scanner(System.in);
        for(int i=1; i<=10; i++) {

            System.out.println("Enter your"+i+"Number: ");
            boolean hasInt= getInput.hasNextInt();
            if(hasInt){
            int number=getInput.nextInt();
            getInput.nextLine();

                int sum=0;
                sum +=number;

                    total +=number;

            }else {
                System.out.println("invalid number");
getInput.nextLine();
            }
        }
        System.out.println("Your sum is: "+total+" ");
        getInput.close();
    }
}






