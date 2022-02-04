package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
int num=56668;
int num1=24684;
        System.out.println(getGreatestCommonDivisor(num,num1));
       }
       public static int getGreatestCommonDivisor(int num,int num1){
        if(num>10){
            for(int i=num; i>=1; i--){
                if(num%i==0 && num1%i==0){
                    return i;
                }
            }
        }
        return -1;
       }
}
