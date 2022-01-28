package src.expressionNStatments;

public class MethodOverLoading {
    public static void main(String[] args) {
        int min=121;
        int sec=43;
        int sec1=3600;
        sectomin(min,sec);
        sectomin(sec1);

    }
    public static int sectomin(int min,int sec){
        if(min>=0&&sec>=0&&sec<59){
            if(min>59){
                int hour=min/60;
                int min1=min-(hour*60);
                System.out.println(hour+"h:"+min1+" m: "+sec+" s");
            }
            else if(min<=59){
                int hour=0;
                System.out.println(hour+"h: "+min+" m: "+sec+" s");
            }

        }
        else {
            System.out.println("enter valid number");
        }
        return 0;
    }
    public static int sectomin(int sec){
        if(sec>=0){
            if(sec>59){
                int min=sec/60;
                int sec1=(min*60)-sec;
                if(min>59){
                    int hour=min/60;
                    int min1=min-(hour*60);
                    System.out.println(hour+"h:"+min1+"m:"+sec1+"s");
                }else {
                    int hour=0;
                    System.out.println(hour+"h:"+min+"m:"+sec1+"s");

                }
            }else {
                int hour=0;
                int min=0;
                System.out.println(hour+"h:"+min+"m"+"s");
            }
        }else {
            System.out.println("enter vald number");
        }return 0;
    }
}
