package src.expressionNStatments;

import java.util.Arrays;
import java.util.Scanner;

public class StudentRecordsSystem {
    static Scanner scanner = new Scanner(System.in);
    static int index = 0;
    static char exit = 'a';
    static final int ARRAY_SIZE = 4;
    static String[] names = new String[ARRAY_SIZE];
    static int[] rollNos = new int[ARRAY_SIZE];
    static int[] ages = new int[ARRAY_SIZE];
    static int[] classes = new int[ARRAY_SIZE];
    static char[] genders = new char[ARRAY_SIZE];

    public static void main(String[] args) {
        mainMenu();
        while (exit != 'e') {

            searchSystemMain();
        }
    }

    public static void mainMenu() {
        System.out.println("                        \"Student Record System\"");
        System.out.println("*****Main Menu*****");
        System.out.println("                           ");

    }

    public static void searchSystemMain() {
        while (true) {
            System.out.println("________________________________________________");
            System.out.println("To add new student record please press: 'n'");
            System.out.println("To search please press: 's'");
            System.out.println("To delete please press: 'd'");
            System.out.println("To view all students record press: 'a'");
            System.out.println("To exit please press: 'e'");
            System.out.println("________________________________________________");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice please: ");
            char input = scanner.next().charAt(0);
            if (input == 'n' || input == 's' || input == 'd' || input == 'a' || input == 'e') {
                inputChecker(input);
                break;
            } else {
                System.out.println("Enter Valid input");
            }
        }
    }

    public static void inputChecker(char input) {

        flush();
        if (input == 'n') {
            addStudent();

        } else if (input == 's') {
            searchStudentData();

        } else if (input == 'e') {
            exitFromProgram();

        } else if (input == 'd') {
            exitFromDeleteProgram();

        } else if (input == 'a') {
            exitFromViewDataFunctionToMainMenu();


        } else {

            System.out.print("Enter valid input: ");
        }
    }


    // To Exit From Program********************************************************** To Exit From Program//

    public static void exitFromProgram() {
        exit = 'e';

    }


    // Add Data System Started----------------------------------Add Data System Started//
    // Add Data System Started----------------------------------Add Data System Started//
    // Add Data System Started----------------------------------Add Data System Started//
    //*****************CLEAR****************************//

    public static void addStudent() {

        while (true) {
            if (index < ARRAY_SIZE) {
                System.out.println("----Adding a new student-----");
                getStudentName();
                getStudentRollNo();
                getStudentAge();
                getStudentClass();
                getStudentGender();
                System.out.println("________________________________________");
                index++;
                char choice = addAnotherStudentChoiceReader();
                if (choice == 'm') {
                    break;
                }
            } else {
                System.out.println("No enough space to add more students....... ");
                break;
            }
        }
    }

    public static char addAnotherStudentChoiceReader() {
        while (true) {
            System.out.println("(:*****Student Added Successfully******:)");
            System.out.println("                            ");
            System.out.println("To Add Another Student press 'a'");
            System.out.println("Back to Main menu press 'm'");
            System.out.println("_____________________________________________");
            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);
            if (choice == 'm' || choice == 'a')
                return choice;
            System.out.println("please give valid choice ('a' or 'm'");

        }

    }

    public static void getStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        names[index] = scanner.nextLine();
    }

    public static void getStudentRollNo() {
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

    public static void flush() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("");

        }
    }

    public static void getStudentAge() {
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

    public static void getStudentClass() {
        while (true) {
            System.out.print("Enter Student Class: ");
            int enteredClass = scanner.nextInt();
            if (enteredClass >= 5 && enteredClass <= 16) {
                StudentRecordsSystem.classes[index] = enteredClass;
                break;
            } else {
                System.out.println("Please enter  in the range(5-16) (:-Thanks-:)");

            }
        }
    }

    public static void getStudentGender() {
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

    public static void searchStudentData() {
        System.out.println("--------------------------------");
        System.out.println("           Search Student");
        while (true) {
            readChoiceForSearchStudent();
            System.out.println("_____________________________");
            char choice = searchToMainMenu();
            if (choice == 'm') {
                break;
            }
        }


    }

    public static void searchStudentMenu() {
        System.out.println("To Search by Name Press: 'n'");
        System.out.println("To Search by Age Press: 'a'");
        System.out.println("To Search by Class Press: 'c'");
        System.out.println("To Search by RollNo Press: 'r'");
        System.out.println("______________________________________");


    }

    public static void readChoiceForSearchStudent() {
        while (true) {
            searchStudentMenu();
            System.out.print("Enter Your Choice Please: ");
            char read = scanner.next().charAt(0);
            if (read == 'n') {
                searchByName();
                break;
            } else if (read == 'a') {
                System.out.println("     ");
                searchByAge();
                break;
            } else if (read == 'c') {
                System.out.println("   ");
                searchByClass();
                break;
            } else if (read == 'r') {
                System.out.println("   ");
                searchByRollNo();
                break;
            } else {
                System.out.println("Enter valid option:");
            }
        }
    }

    public static void searchByName() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner1.nextLine();
        boolean isFound = false;
        for (int i = 0; i < index; i++) {
            if (name.equals(names[i])) {
                displaySearchResults(i);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("NO RESULTS FOUND ");
        }
    }


    public static void displaySearchResults(int resultIndex) {
        System.out.println("---------------------------");
        System.out.println("Student Name: " + names[resultIndex]);
        System.out.println("Student Age: " + ages[resultIndex]);
        System.out.println("Student Class: " + classes[resultIndex]);
        System.out.println("Student RollNo: " + rollNos[resultIndex]);
        if (genders[resultIndex] == 'm') {
            System.out.println("Student Gender: male");
        } else if (genders[resultIndex] == 'f') {
            System.out.println("Student Gender: female");
        }
    }

    public static void searchByAge() {
        while (true) {
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age > 19 && age < 41) {
                int conditionIfElse = 0;
                for (int i = 0; i < index; i++) {
                    if (age == ages[i]) {
                        displaySearchResults(i);
                        conditionIfElse++;
                    }
                }
                if (conditionIfElse == 0) {
                    System.out.println("NO RESULTS FOUND ");
                    break;
                }
                break;
            } else {
                System.out.println("Please enter Age in the range: ");
            }
        }
    }

    public static void searchByClass() {
        while (true) {
            System.out.print("Enter Student Class: ");
            int enteredClass = scanner.nextInt();
            scanner.nextLine();
            if (enteredClass >= 5 && enteredClass <= 16) {
                int conditionIfElse = 0;
                for (int i = 0; i < index; i++) {
                    if (enteredClass == classes[i]) {
                        displaySearchResults(i);
                        conditionIfElse++;

                    }
                }
                if (conditionIfElse == 0) {
                    System.out.println("NO RESULTS FOUND ");
                    break;
                }
                break;

            } else {
                System.out.println("Please enter Class in the range(5-16): ");
            }
        }
    }


    public static void searchByRollNo() {
        while (true) {
            System.out.print("Enter Student RollNo: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            if (roll >= 1 && roll <= 100) {
                int conditionIfElse = 0;
                for (int i = 0; i < index; i++) {
                    if (roll == rollNos[i]) {
                        displaySearchResults(i);
                        conditionIfElse++;

                    }
                }
                if (conditionIfElse == 0) {
                    System.out.println("NO RESULTS FOUND ");
                    break;
                }
                break;
            } else {
                System.out.println("Please enter rollNo in the range 1-100: ");
            }
        }
    }

    public static char searchToMainMenu() {
        while (true) {
            System.out.println("    ");
            System.out.println("To Search More Data Press: 's");
            System.out.println("Back to MainMenu press: 'm");
            System.out.println("---------------------------------");
            System.out.print("Enter Your choice:  ");
            char choice = scanner.next().charAt(0);
            if (choice == 'm' || choice == 's') {
                return choice;
            } else {
                System.out.print("Enter valid option: ");


            }

        }
    }
    //********************************************CLEAR*********************************************************//

    //                                Delete Any Student Data                                                  //
//_________________________________________________________________________________________________________________//
    public static void deleteSystemDisplayMenu() {
        System.out.println("          Welcome in Delete Student Data  System");
        System.out.println("********Menu********");
        System.out.println("Delete By RollNo Press: 'r'");
        System.out.println("_________________________________________________");

    }

    public static void inputReaderFromDeleteSystemDisplayMenu() {
        while (true) {
            deleteSystemDisplayMenu();
            System.out.print("Enter Your Choice: ");
            char deleteSystemInput = scanner.next().charAt(0);
            if (deleteSystemInput == 'r') {
                flush();
                deleteByRollNo();
                break;
            } else {
                System.out.println("Enter Valid input Please");
            }
        }
    }


    public static void deleteByRollNo() {
        while (true) {
            System.out.print("Enter Student RollNo: ");
            int RollNo = scanner.nextInt();
            scanner.nextLine();
            if (RollNo > 0 && RollNo <= 100) {
                int forBreaker = 0;
                for (int i = 0; i < index; i++) {
                    if (RollNo == rollNos[i]) {
                        forBreaker++;
                        removeIndexValue(i);
                        System.out.println(Arrays.toString(rollNos));
                    }
                }
                if (forBreaker == 0) {
                    System.out.println("No results found");
                }
                break;
            } else {
                System.out.println("Enter Valid Input: ");

            }

        }
    }

    public static void removeIndexValue(int indexNumber) {
        names[indexNumber] = names[index - 1];
        rollNos[indexNumber] = rollNos[index - 1];
        classes[indexNumber] = classes[index - 1];
        ages[indexNumber] = ages[index - 1];
        genders[indexNumber] = genders[index - 1];
        index--;
        names[index] = "null";
        rollNos[index] = 0;
        ages[index] = 0;
        classes[index] = 0;
        genders[index] = 0;
        System.out.println("..........Deleted successfully.......");
    }

    public static char subFunctionOfExitFromDeleteProgram() {
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("    ");
            System.out.println("To  Another Student Data Press: 'd'");
            System.out.println("Back to MainMenu press: 'm");
            System.out.println("---------------------------------");
            System.out.print("Enter Your choice:  ");
            char choice = scanner.next().charAt(0);
            if (choice == 'm' || choice == 'd') {
                return choice;
            } else {
                System.out.print("Enter valid option: ");


            }

        }
    }

    public static void exitFromDeleteProgram() {
        while (true) {
            inputReaderFromDeleteSystemDisplayMenu();
            char choice = subFunctionOfExitFromDeleteProgram();
            if (choice == 'm') {
                break;
            }
        }
    }
    //-----------------------------DELETE SECTION COMPLETED------------------------------------------------//
    //  -----------------------
    //                                                       ---------------------------------------------//

    //********************************TO VIEW ALL STUDENT RECORD*******************************************//
    public static void toViewAllDataDisplayMenu() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("YOU REALLY WANT TO CHECK ALL DATA PRESS 'yes' : ");
        String viewDATA = scanner1.nextLine();
        while (true) {
            if (viewDATA.equals("yes")) {
                if (index != 0) {
                    for (int i = 0; i < index; i++) {
                        System.out.println(" ");
                        int list = i + 1;
                        System.out.println(" ");
                        System.out.println(" *********NO:" + list + "*********");
                        System.out.println("---------------------------");
                        System.out.println("Student Name: " + names[i]);
                        System.out.println("Student Age: " + ages[i]);
                        System.out.println("Student Class: " + classes[i]);
                        System.out.println("Student RollNo: " + rollNos[i]);
                        if (genders[i] == 'm') {
                            System.out.println("Student Gender:male");
                        } else if (genders[i] == 'f') {
                            System.out.println("Student Gender: female");
                        }
                    }
                } else {
                    System.out.println("DATA NOT FOUND THANKS");
                }
                break;
            } else {
                System.out.println("Enter valid input please: ");
            }
        }

    }

    public static char subFunctionOfExitFromViewDataFunctionToMainMenu() {
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("Press 'a' To View  Data Again: ");
            System.out.println("Press 'm' To MainMenu: ");
            System.out.println("________________________________");
            System.out.print("Enter Your Choice: ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine();
            if (choice == 'm' || choice == 'a') {
                return choice;
            } else {
                System.out.println("Enter valid input");
            }
        }
    }

    public static void exitFromViewDataFunctionToMainMenu() {
        while (true) {
            toViewAllDataDisplayMenu();
            System.out.println(" ");
            char choice = subFunctionOfExitFromViewDataFunctionToMainMenu();
            if (choice == 'm') {
                break;
            }

        }
    }
}




















