package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num = 4787;
        int num1 = 677;
        int num2=287;
        System.out.println(sharedDig(num, num1,num2));
    }

    public static boolean sharedDig(int num, int num1,int num2) {
        if (num > 10 && num1 > 10 && num2>10&& num1 <=1000 && num <=1000) {
            int div = num;
            int mod = 0;
            mod = mod + div % 10;

            int div1 = num1;
            int mod1 = 0;
            mod1 = mod1 + (div1 % 10);
           int div2=num2;
           int mod2=0;
           mod2=mod2+(div2%10);
            if (mod == mod1 || mod == mod2 ||mod1==mod2){
                return true;
            }
        }
        return false;
    }
}
