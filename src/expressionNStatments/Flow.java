package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num=70707;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num){
        int div=num;
        int reverse=0;
        while (div!=0){

            reverse=reverse+(div%10);
            div=(div/10);
            reverse=reverse*10;
        }
        reverse=reverse/10;

        if(reverse==num){
            return true;
        }
        return false;
    }

}
