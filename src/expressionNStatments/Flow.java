package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
int num=8128;

        System.out.println(printNumber(num));
       }
       public static boolean printNumber(int num){
       if(num>1){
          int sum=0;
           for (int i=1; i<num; i++){
               if(num%i==0){
                  sum=sum+i;
               }
           }
           if(sum==num){
               return true;
           }
           else
               return false;
       }
       else
           return false;

       }
}
