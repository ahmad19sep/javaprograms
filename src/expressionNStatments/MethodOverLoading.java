package src.expressionNStatments;

public class MethodOverLoading {
    public static void main(String[] args) {
        int year = 2009;
        int month = 5;

        System.out.println(monthyear(month,year));
    }



    public static int monthyear(int month, int year) {
        if (month > 1 && month < 12 && year > 0 && year < 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                switch (month) {
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        return 31;

                    case 2:
                        return 29;
                  //  break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    //break;
                    default:
                        return -1;
                }
            } else {
                switch (month) {
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        return 31;
                //    break;
                    case 2:
                        return 28;
                  //  break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                  //  break;
                    default:
                        return -1;
                }
            }
        }
        else
            return -1;
    }}

