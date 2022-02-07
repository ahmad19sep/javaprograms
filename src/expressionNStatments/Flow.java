package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("\n");
            for(int j=1; j<=5; j++){
                if((i==1) || (i==5) || (j==1) || (j==5) || ((i+j)%2==0)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}




