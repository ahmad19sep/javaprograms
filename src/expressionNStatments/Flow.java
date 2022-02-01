package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num = -1;
        int num1=13,num2=13;
        if (isOdd(num)) {
            System.out.println("YOUR NUMBER " + num + " IS ODD");
        } else {
            System.out.println("YOUR NUMBER " + num + " IS EVEN");
        }
        System.out.println(sumOdd(num1,num2));
        System.out.println("Sum of odd numbers in this range is "+sumOdd(num1,num2));
    }

    public static boolean isOdd(int num) {
        if ((num <= 0 || num % 2 == 0)) {
            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if(start<=0||end<=0){
            return -1;
        }
        else if(start>0&&end>0){
            for(int i=start; i<=end; i++){
                if(i%2!=0){
                    sum=sum+i;
                }

            }
        }return sum;
    }
}