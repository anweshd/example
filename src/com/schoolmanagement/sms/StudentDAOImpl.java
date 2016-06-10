/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolmanagement.sms;

import java.util.Scanner;
import sun.applet.AppletViewer;

/**
 *
 * @author hp
 */
public class StudentDAOImpl {

    String[] names = new String[10];
    int counter = 0;
    Scanner input;
    private Object stdDAO;

    public StudentDAOImpl(Scanner input) {
        this.input = input;

    }

    public void menu() {
        System.out.println("1.Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Show All");
        System.out.println("4. Search");
        System.out.println("5. Exit");
        System.out.println("Enter your choice [1-5]");

    }

    public void addStudent() {
        while (true) {
            System.out.println("Add Student");
            System.out.println("Enter Name:");
            names[counter] = input.next();
            counter++;
            System.out.println("Do you want to continue [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showall() {
        System.out.println("Show All");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);

            }
        }
    }

    public void Search() {

        System.out.println("enter any text to search");
        String name = input.next();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].contains(name)) {
                System.out.println("names[i]");
                found = true;

            }
        }

        if (!found) {
            System.out.println("No Name Found");

        }
    }

    public void controller() {
        int choice = input.nextInt();

        if (choice == 1) {
            addStudent();

        } else if (choice == 2) {
            System.out.println("Delete Student");
        } else if (choice == 3) {
            showall();

        } else if (choice == 4) {
            Search();

            System.out.println("No Name found");

        } else {
            System.exit(0);

        }
    }

    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
