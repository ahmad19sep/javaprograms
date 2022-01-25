package src.premitiveDataTypes;

public class floatetc {
    public static void main(String[]args){
        double kilometers=75.114;
        toMilesPerHour(kilometers);
        System.out.println(Math.round(3.4));
       // System.out.println("your total miles=" + toMilesPerHour(kilometers));

    }
    public static void toMilesPerHour(double kiloMetersPerHour) {
        if (kiloMetersPerHour > 0) {
            long miles = Math.round( kiloMetersPerHour /1.6 );
            System.out.println(kiloMetersPerHour+"k/h="+miles+"m/h");

        } else if (kiloMetersPerHour <= 0) {
            System.out.println("invalid value");
        }

    }



}


