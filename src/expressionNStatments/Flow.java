package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num = 42;
        int num1 = 43;
        System.out.println(sharedDig(num, num1));
    }

    public static boolean sharedDig(int num, int num1) {
        if (num > 10 && num1 > 10 && num1 < 99 && num < 99) {
            int div = num;
            int mod = 0;
            mod = mod + div % 10;
            div = div / 10;
            int div1 = num1;
            int mod1 = 0;
            mod1 = mod1 + (div1 % 10);
            div1 = div1 / 10;
            if (mod == div1 || mod == mod1 || div == div1 || div == mod1) {
                return true;
            }
        }
        return false;
    }
}
