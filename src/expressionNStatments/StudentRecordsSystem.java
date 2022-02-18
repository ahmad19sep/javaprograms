package src.expressionNStatments;

import java.util.Scanner;

public class Flow {
    static int whileBreaker = 0;
    static Scanner scanner = new Scanner(System.in);
    static int index = 0;
    static final int ARRAY_SIZE = 2;
    static String[] names = new String[ARRAY_SIZE];
    static int[] rollNos = new int[ARRAY_SIZE];
    static int[] ages = new int[ARRAY_SIZE];
    static int[] classes = new int[ARRAY_SIZE];
    static char[] genders = new char[ARRAY_SIZE];

    public static void main(String[] args) {
        mainMenu('m');
        while (true) {
            if (whileBreaker > 1) {
                whileBreaker = 0;
                System.out.println(whileBreaker);
                break;
            }searchSystemMain('a');
        }

    }

    public static void mainMenu(char mainMenuDisplay) {
        System.out.println("                        \"Student Record System\"");
        System.out.println("*****Main Menu*****");
        System.out.println("                           ");

    }

    public static void searchSystemMain(char searchSystem) {
        System.out.println("________________________________________________");
        System.out.println("To add new student record please press: 'n'");
        System.out.println("To search please press: 's'");
        System.out.println("To delete please press: 'd'");
        System.out.println("To view all students record press: 'a'");
        System.out.println("To exit please press: 'e'");
        System.out.println("________________________________________________");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice please: ");
        char inputChecker = scanner.next().charAt(0);
        inputChecker(inputChecker);
    }

    public static void inputChecker(char inputChecker) {
        if (inputChecker == 'n') {
            flush('c');
            addStudent('n');
        } else if (inputChecker == 's') {
            flush('c');
            searchStudentData('s');
        } else if (inputChecker == 'e') {
            exitFromProgram('e');
        }

    }

    public static void exitFromProgram(char exit) {
        if (whileBreaker == 0) {
            whileBreaker++;
            whileBreaker++;
        }
    }
    // Add Data System Started----------------------------------Add Data System Started//
    // Add Data System Started----------------------------------Add Data System Started//
    // Add Data System Started----------------------------------Add Data System Started//
    //*****************CLEAR****************************//

    public static void addStudent(char addStudent) {
        if (index < ARRAY_SIZE) {
            while (true) {
                if (index < ARRAY_SIZE) {
                    System.out.println("----Adding a new student-----");
                    getStudentName('n');
                    getStudentRollNo('r');
                    getStudentAge('a');
                    getStudentClass('c');
                    getStudentGender('g');
                    System.out.println("________________________________________");
                    index++;
                    choiceReader('c');
                    if (whileBreaker != 0) {
                        whileBreaker = 0;
                        break;
                    }
                } else {
                    System.out.println("No enough space to add more students....... ");
                    break;
                }
            }

        } else {
            System.out.println("No enough space to add more students....... ");
        }
    }


    public static void choiceReader(char cr) {
        while (true) {
            System.out.println("(:*****Student Added Successfully******:)");
            System.out.println("                            ");
            System.out.println("To Add Another Student press 'a'");
            System.out.println("Back to Main menu press 'm'");
            System.out.println("_____________________________________________");
            System.out.print("Enter your choice: ");
            char choiceReader = scanner.next().charAt(0);
            if (choiceReader == 'm') {
                flush('f');
                whileBreaker++;
                break;
            } else if (choiceReader == 'a') {
                flush('f');
                break;
            } else {
                System.out.println("please give valid choice ('a' or 'm'");
            }
        }
    }

    public static void getStudentName(char getStudentName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        names[index] = scanner.nextLine();
    }

    public static void getStudentRollNo(char r) {
        while (true) {
            System.out.print("Enter Student rollNo: ");
            int rollNo = scanner.nextInt();
            if (rollNo >= 1 && rollNo <= 100) {
                rollNos[index] = rollNo;
                break;
            } else {
                System.out.println("Please enter  in the range(1-100) (:-Thanks-:)");

            }
        }
    }

    public static void flush(char clear) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("                        ");

        }
    }

    public static void getStudentAge(char a) {
        while (true) {
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            if (age >= 20 && age <= 40) {
                ages[index] = age;
                break;
            } else {
                System.out.println("Please enter  in the range(20-40) (:-Thanks-:)");

            }
        }
    }

    public static void getStudentClass(char c) {
        while (true) {
            System.out.print("Enter Student Class: ");
            int classe = scanner.nextInt();
            if (classe >= 5 && classe <= 16) {
                classes[index] = classe;
                break;
            } else {
                System.out.println("Please enter  in the range(5-16) (:-Thanks-:)");

            }
        }
    }

    public static void getStudentGender(char g) {
        while (true) {
            System.out.print("Enter Student gender: ");
            char gender = scanner.next().charAt(0);
            if (gender == 'm' || gender == 'f') {
                genders[index] = gender;
                scanner.nextLine();
                break;
            } else {
                System.out.println("Please enter  correct gender (:-Thanks-:)");

            }
        }
    }
    //**********************************************CLEAR*****************************************************//

    // SEARCH SYSTEM START    ____________________________________   SEARCH SYSTEM START//
    // SEARCH SYSTEM START    ____________________________________   SEARCH SYSTEM START//
    // SEARCH SYSTEM START    ____________________________________   SEARCH SYSTEM START//
    //************************************CLEAR*****************************************************************//

    public static void searchStudentData(char search) {
        System.out.println("--------------------------------");
        System.out.println("           Search Student");
        do {
            readChoiceForSearchStudent('c');
            System.out.println("_____________________________");
            searchToMainMenu('m');

        } while (whileBreaker == 0);

    }

    public static void searchStudentMenu(char menu) {
        System.out.println("To Search by Name Press: 'n'");
        System.out.println("To Search by Age Press: 'a'");
        System.out.println("To Search by Class Press: 'c'");
        System.out.println("To Search by RollNo Press: 'r'");
        System.out.println("______________________________________");


    }

    public static void readChoiceForSearchStudent(char readChoice) {
        while (true) {
            searchStudentMenu('s');
            System.out.print("Enter Your Choice Please: ");
            char read = scanner.next().charAt(0);
            if (read == 'n') {
                searchByName(read);
                break;
            } else if (read == 'a') {
                System.out.println("     ");
                searchByAge(read);
                break;
            } else if (read == 'c') {
                System.out.println("   ");
                searchByClass(read);
                break;
            } else if (read == 'r') {
                System.out.println("   ");
                searchByRollNo(read);
                break;
            } else {
                System.out.println("Enter valid option:");
            }
        }
    }

    public static void searchByName(char searchByName) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner1.nextLine();
        for (int i = 0; i < index; i++) {
            if (name.equals(names[i])) {
                outputMenuOfSearch(i);
            }
        }
    }

    public static void outputMenuOfSearch(int loop) {
        System.out.println("---------------------------");
        System.out.println("Student Name: " + names[loop]);
        System.out.println("Student Age: " + ages[loop]);
        System.out.println("Student Class: " + classes[loop]);
        System.out.println("Student RollNo: " + rollNos[loop]);
        if (genders[loop] == 'm') {
            System.out.println("Student Gender:male");
        } else if (genders[loop] == 'f') {
            System.out.println("Student Gender: female");
        }
    }

    public static void searchByAge(char searchByAge) {
        while (true) {
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age > 19 && age < 41) {
                for (int i = 0; i < index; i++) {
                    if (age == ages[i]) {
                        outputMenuOfSearch(i);

                    }
                }
                break;
            } else {
                System.out.println("Please enter Age in the range: ");
            }
        }
    }

    public static void searchByClass(char searchByClass) {
        while (true) {
            System.out.print("Enter Student Class: ");
            int classe = scanner.nextInt();
            scanner.nextLine();
            if (classe >= 5 && classe <= 16) {
                for (int i = 0; i < index; i++) {
                    if (classe == classes[i]) {
                        outputMenuOfSearch(i);

                    }
                }
                break;
            } else {
                System.out.println("Please enter Class in the range(5-16: ");
            }
        }
    }

    public static void searchByRollNo(char searchByRollNo) {
        while (true) {
            System.out.print("Enter Student RollNo: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            if (roll >= 1 && roll <= 100) {
                for (int i = 0; i < index; i++) {
                    if (roll == rollNos[i]) {
                        outputMenuOfSearch(i);

                    }
                }
                break;
            } else {
                System.out.println("Please enter Age in the range: ");

            }
        }
    }

    public static void searchToMainMenu(char mainOption) {
        while (true) {
            System.out.println("    ");
            System.out.println("To Search More Data Press: 's");
            System.out.println("Back to MainMenu press: 'm");
            System.out.println("---------------------------------");
            System.out.print("Enter Your choice:  ");
            char choiceReader = scanner.next().charAt(0);
            if (choiceReader == 'm') {
                whileBreaker++;
                break;
            } else if (choiceReader == 's') {
                break;
            } else {
                System.out.print("Enter valid option: ");


            }

        }
    }
    //********************************************CLEAR*********************************************************//

}


















