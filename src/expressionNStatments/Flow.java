package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num=-1;
        System.out.println (getEvenDigSum(num));
    }
    public static int getEvenDigSum(int num){
        if(num>0){
            int mod=0,div=num,sum=0;
            while (div!=0){
                mod=div%10;
                div=div/10;
                if(mod%2==0){
                    sum=sum+mod;
                }

            }
            return sum;
        }
        return -1;
    }
}
