package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
int num=56668;
int num1=24684;
        printFactor(num);
       }
       public static void printFactor(int num){
       if(num>1){
           for (int i=1; i<=num; i++){
               if(num%i==0){
                   System.out.println(i+"\n");
               }
           }
       }
       else
           System.out.println("invalid number");

       }
}
