package src.expressionNStatments;

import java.util.Objects;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {
        String[] names = {"Ali", "Ahmad", "Shahzad", "Muzamil", "Amina", "Smara", "Mudassar", "Asha", "Nawaz", "Siddique", "Shaheen"
                , "Taj", "Mehmood", "Nasir", "Abdullah", "Ali Raza", "Ali Akbr", "Akaram", "Afazal", "Yaseen", "Sajid", "Umar", "Mujtaba",
                "Fatima", "Asia", "Aitka", "Mehmood", "Alia", "Mariiyum", "Aslam"};
        System.out.println(names[2]);
        String[] classes = new String[30];
        int[] rollNos = new int[30];
        for (int i = 0; i < 30; i++) {
            rollNos[i] = i;
            classes[i] = "9thA";
        }

        int[] ages = {23, 20, 26, 25, 25, 24, 65, 64, 54, 20, 21, 59, 21, 45, 43, 67, 28, 22, 15, 18, 14, 62, 67, 22, 45, 87, 87, 15, 45, 25};
        char[] grades = {'B', 'C', 'F', 'A', 'D', 'A', 'B', 'C', 'F', 'A', 'B', 'C', 'D', 'F', 'D', 'C', 'B', 'B', 'A', 'F', 'A',
                'A', 'B', 'F', 'B', 'A', 'F', 'C', 'B', 'D'};
        int[] marks = {70, 50, 14, 95, 42, 89, 76, 54, 23, 89, 70, 55, 39, 18, 40, 64, 78, 74, 89, 23, 87, 89, 69, 21, 71, 91, 24, 50, 66, 40};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search With Student Name Press \"s\" ");
        System.out.println("OR");
        System.out.println("Search With RollNO Press \"ro\" ");
        System.out.println("OR");
        System.out.println("Search With Grade Press \"g\" ");
        System.out.println("OR");
        System.out.println("Search With AGE Press \"a\" ");
        System.out.println("OR");
        System.out.println("Search With Marks Press \"m\" ");
        String character = scanner.nextLine();
        if (character.equals("a")) {
            System.out.println("Enter Student age: ");
            int age = scanner.nextInt();

            for (int i = 0; i < 30; i++) {
                if (age == (ages[i])) {
                    System.out.println("Name: " + names[i]);
                    System.out.println("RollNo: " + rollNos[i]);
                    System.out.println("Class: " + classes[i]);
                    System.out.println("Age: " + ages[i]);
                    System.out.println("Marks: " + marks[i]);
                    System.out.println("Grade: " + grades[i]);

                }
            }
        }
            if (character.equals("s")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter Student Name: ");
                String nameoutput = scanner2.nextLine();
                for (int i = 0; i < 30; i++) {
                    if (nameoutput.equals(names[i])) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("RollNo: " + rollNos[i]);
                        System.out.println("Class: " + classes[i]);
                        System.out.println("Age: " + ages[i]);
                        System.out.println("Marks: " + marks[i]);
                        System.out.println("Grade: " + grades[i]);

                    }
                }


            }
            if (character.equals("g")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter Student grade: ");
               char gradeOutput=scanner2.next().charAt(0);
                for (int i = 0; i < 30; i++) {
                    if (gradeOutput == (grades[i])) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("RollNo: " + rollNos[i]);
                        System.out.println("Class: " + classes[i]);
                        System.out.println("Age: " + ages[i]);
                        System.out.println("Marks: " + marks[i]);
                        System.out.println("Grade: " + grades[i]);
                    }
                }
            }
            if (character.equals("ro")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter Student RollNo: ");
                int rollNOOutput = scanner2.nextInt();
                scanner2.nextLine();

                for (int i = 0; i < 30; i++) {
                    if (rollNOOutput == (rollNos[i])) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("RollNo: " + rollNos[i]);
                        System.out.println("Class: " + classes[i]);
                        System.out.println("Age: " + ages[i]);
                        System.out.println("Marks: " + marks[i]);
                        System.out.println("Grade: " + grades[i]);
                    }
                }
            }
            if (character.equals("m")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter Student Marks: ");
                int gradeOutput = scanner2.nextInt();
                scanner2.nextLine();

                for (int i = 0; i < 30; i++) {
                    if (gradeOutput == (marks[i])) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("RollNo: " + rollNos[i]);
                        System.out.println("Class: " + classes[i]);
                        System.out.println("Age: " + ages[i]);
                        System.out.println("Marks: " + marks[i]);
                        System.out.println("Grade: " + grades[i]);
                    }
                }
            }


        }
    }











