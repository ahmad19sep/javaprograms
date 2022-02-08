package src.expressionNStatments;

import java.util.Objects;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {
        String ch= String.valueOf('r');
        while (!Objects.equals(ch, "s")){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int number= Integer.parseInt(scanner.nextLine());
        output(number);
            System.out.println("Press 'S' TO AND 'C' TO CONTINUE");
            Scanner scanner1=new Scanner(System.in);
            ch= scanner1.nextLine();
        }
        //int digit = 45;
        //output(digit);

    }


    public static String onetoTen(int onetoten) {
        switch (onetoten) {
            case 0:
                return "";
            case 1:
                return "i";
            case 2:
                return "ii";
            case 3:
                return "iii";
            case 4:
                return "iv";
            case 5:
                return "v";
            case 6:
                return "vi";
            case 7:
                return "vii";
            case 8:
                return "viii";
            case 9:
                return "ix";

            default:
                return "invalid number";
        }
    }

    public static String twThFu(int twthfu) {
        if (twthfu == 0) {
            return "";
        }
        if (twthfu == 10) {
            return "x";
        }
        if (twthfu == 20) {
            return "xx";
        } else if (twthfu == 30) {
            return "xxx";
        } else {
            return "xxxx";

        }
    }

    public static String fifty(int fifty) {
        if (fifty == 50) {
            return "L";
        } else return "invalid number";

    }

    public static String hundredToF(int htof) {
        switch (htof) {
            case 100:
                return "C";
            case 200:
                return "CC";
            case 300:
                return "CCC";
            case 400:
                return "CCCC";
            default:
                return "invalid value";
        }
    }

    public static String fveHundredTo999(int fivehundred999) {
        switch (fivehundred999) {
            case 500:
                return "D";
            case 600:
                return "DL";
            case 700:
                return "DLL";
            case 800:
                return "DLLL";
            case 900:
                return "DLLLL";
            default:
                return "invalid value";
        }
    }

    public static String thousand(int thousand) {
        if (thousand == 1000) {
            return "M";
        }
        return "invalid value";
    }

    public static void output(int num) {
        if (num >= 1 && num <= 1000) {
            if (num >= 1 && num <= 9) {
                System.out.println(onetoTen(num));
            }
            if (num >= 10 && num < 50) {
                int orginum = num;
                int div = num / 10;
                div = div * 10;
                orginum = num - div;
                String output = twThFu(div);
                output += onetoTen(orginum);
                System.out.println(output);
            }
            if (num == 50) {
                System.out.println(fifty(num));
            }
            if (num > 50 && num < 100) {
                int lessfifty = num - 50;
                int orginum = lessfifty;
                int div = orginum / 10;
                div = div * 10;
                orginum = lessfifty - div;
                String output = "L";
                output += twThFu(div);
                output += onetoTen(orginum);
                System.out.println(output);

            }
            if (num >= 100 && num < 500) {
                int remainingvalu = num;
                int hundred = num / 100;
                hundred = hundred * 100;
                remainingvalu = num - hundred;
                if (remainingvalu > 50 && remainingvalu < 100) {
                    int lessfifty = remainingvalu - 50;
                    int orginum = lessfifty;
                    int div = orginum / 10;
                    div = div * 10;
                    orginum = lessfifty - div;
                    String output = hundredToF(hundred);
                    output = output + "L";
                    output += twThFu(div);
                    output += onetoTen(orginum);
                    System.out.println(output);

                }
                if (remainingvalu == 50) {
                    String output = hundredToF(hundred);
                    output = output + fifty(remainingvalu);
                    System.out.println(output);
                }
                if (remainingvalu >= 10 && remainingvalu < 50) {
                    int orginum = remainingvalu;
                    int div = remainingvalu / 10;
                    div = div * 10;

                    orginum = remainingvalu - div;
                    String output = hundredToF(hundred);
                    output = output + twThFu(div);
                    output += onetoTen(orginum);
                    System.out.println(output);
                }
                if (remainingvalu >= 1 && remainingvalu <= 9) {
                    String output = hundredToF(hundred);
                    output += (onetoTen(remainingvalu));
                    System.out.println(output);
                }
            }
            if (num == 500) {
                System.out.println("D");
            }
            if (num >= 500 && num < 1000) {
                int extranum = num - 500;
                if (extranum <= 499) {

                    if (extranum >= 100 && extranum < 500) {
                        int remainingvalu = 0;
                        int hundred = extranum / 100;
                        hundred = hundred * 100;
                        remainingvalu = extranum - hundred;
                        if (remainingvalu > 50 && remainingvalu < 100) {
                            int lessfifty = remainingvalu - 50;
                            int orginum = lessfifty;
                            int div = orginum / 10;
                            div = div * 10;
                            orginum = lessfifty - div;

                            String output = "D";
                            output += hundredToF(hundred);
                            output = output + "L";
                            output += twThFu(div);
                            output += onetoTen(orginum);
                            System.out.println(output);

                        }
                        if (remainingvalu == 50) {
                            String output = "D";
                            output += hundredToF(hundred);
                            output = output + fifty(remainingvalu);
                            System.out.println(output);
                        }
                        if (remainingvalu >= 10 && remainingvalu < 50) {
                            int orginum = remainingvalu;
                            int div = remainingvalu / 10;
                            div = div * 10;

                            orginum = remainingvalu - div;
                            String output = "D";
                            output += hundredToF(hundred);
                            output = output + twThFu(div);
                            output += onetoTen(orginum);
                            System.out.println(output);
                        }
                        if (remainingvalu >= 1 && remainingvalu <= 9) {
                            String output = "D";
                            output += hundredToF(hundred);
                            output += (onetoTen(remainingvalu));
                            System.out.println(output);
                        }
                    }
                    if (extranum > 50 && extranum < 100) {
                        int lessfifty = extranum - 50;
                        int orginum = lessfifty;
                        int div = orginum / 10;
                        div = div * 10;
                        orginum = lessfifty - div;
                        String output = "D" + "L";
                        output += twThFu(div);
                        output += onetoTen(orginum);
                        System.out.println(output);

                    }
                    if (extranum == 50) {
                        String output = "D";
                        output += (fifty(num));
                        System.out.println(output);
                    }
                    if (extranum >= 10 && extranum < 50) {
                        int orginum = extranum;
                        int div = extranum / 10;
                        div = div * 10;
                        orginum = extranum - div;
                        String output = "D";
                        output += twThFu(div);
                        output += onetoTen(orginum);
                        System.out.println(output);
                    }
                    if (extranum >= 1 && extranum <= 9) {
                        String output = "D";
                        output += (onetoTen(extranum));
                        System.out.println(output);
                    }
                }


            }
            if (num == 1000) {
                System.out.println(thousand(num));
            }
        } else {
            System.out.println("Invalid NUMBER");
        }
    }
}






