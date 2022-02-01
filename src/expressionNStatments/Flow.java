package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num = 3222222;

        System.out.println(num+" Sum of first and last integer is " + sumFandL(num));
    }

    public static int sumFandL(int num) {
        if (num < 9 && num >= 0) {
            return num + num;
        } else if (num > 9) {
            int div = num;
            int sum = 0;
            int count = 0;
            while (div != 0) {
                sum = sum + (div % 10);
                sum = sum * 10;
                count++;
                div = (div / 10);

                if (div < 10 ) {
                    sum = (int) (sum / (Math.pow(10, count)));
                    sum = sum + (div % 10);
                    return sum;
                }

            }
        }
        return -1;
    }
}
