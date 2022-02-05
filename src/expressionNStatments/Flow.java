package src.expressionNStatments;

public class Flow {
    public static void main(String[] args) {
        int num = 30001;
        numberToWords(num);
    }

    public static void numberToWords(int num) {
        if (num % 10 != 0) {
            int mod = 0;
            String numToWords = "";
            int orgNum = 0;
            int div = num;
            while (div != 0) {
                mod = mod + (div % 10);
                div = div / 10;
                mod = mod * 10;
            }
            mod = mod / 10;
            while (mod != 0) {
                orgNum = (mod % 10);
                switch (orgNum) {
                    case 0:
                        numToWords = numToWords + "zero ";
                        break;
                    case 1:
                        numToWords = numToWords + "one ";
                        break;
                    case 2:
                        numToWords = numToWords + "two ";
                        break;
                    case 3:
                        numToWords = numToWords + "three ";
                        break;
                    case 4:
                        numToWords = numToWords + "four ";
                        break;
                    case 5:
                        numToWords = numToWords + "five ";
                        break;
                    case 6:
                        numToWords = numToWords + "six ";
                        break;
                    case 7:
                        numToWords = numToWords + "seven ";
                        break;
                    case 8:
                        numToWords = numToWords + "eight ";
                        break;
                    case 9:
                        numToWords = numToWords + "nine ";
                        break;
                }
                mod = mod / 10;

            }
            System.out.println(num+" = "+numToWords);

    }
}
}



