package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num = 6;

        System.out.println(get(num));
    }
    public static boolean isPrime(int num){
        if(num>1){
            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    return false;
                }
            }

        }else {
            return false;
        }
        return true;
    }

    public static int get(int num) {
        for(int i=num/2; i>=2; i--){
            if(num%i==0 && isPrime(i)){
                return i;
            }
        }
        return -1;
    }
}




