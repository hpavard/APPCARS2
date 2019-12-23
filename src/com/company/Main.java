package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * This is what is first displayed when the application oppens.
         */
        System.out.println("\nWELCOME\n\n1 Help         2 Exit\n");

        /**
         * And then, here is the method that manage the menu.
         */
        int num = 1;
        Scanner sc = new Scanner(System.in);

        String lastName;
        String firstName;
        int age;
        String nationality;
        int department;

        /**
         * Display full menu or quit the application
         */
        while (num == 1) {
            num = sc.nextInt();
            while (num != 1 && num != 2) {
                System.out.println("\nPlease enter a valid number (1/2)\n");
                num = sc.nextInt();
            }
            while (num == 1) {
                System.out.println(
                        "\n3 Add user               7 Add car               11 Rent car" +
                                "\n4 Edit user              8 Edit car              12 Return car" +
                                "\n5 Remove user            9 Remove car            13 Rents list" +
                                "\n6 Users list             10 Cars list" +
                                "\n\n14 Save                  15 Restore" +
                                "\n\n2 Exit\n");
                num = sc.nextInt();
                /**
                 * Enter new user informations
                 */
                while (num == 3) {
                    System.out.println("\nEnter a last name\n");
                    lastName = sc.nextLine();
                    System.out.println("\nEnter a first name\n");
                    firstName = sc.nextLine();
                    System.out.println("\nEnter an age\n");
                    age = sc.nextInt();
                    System.out.println("\nEnter a nationality\n");
                    nationality = sc.nextLine();
                    System.out.println("\nEnter a department\n");
                    department = sc.nextInt();
                }
            }
        }
        /**
         * Exit message
         */
        System.out.println("\nThe application has been closed\n");
    }
}