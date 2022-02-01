package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num=-125;
        System.out.println("Your sum is "+sumDig(num));

    }
    private static int sumDig(int num){
        if(num>=10){
            int mod=0;
            int div=num;
            while (div!=0){
                mod=mod+(div%10);
                div=div/10;
            }
            return mod;
        }else
            return num;
    }

}
