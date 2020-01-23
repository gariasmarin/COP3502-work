package com.jetbrains.;
import java.util.*;
public class SciCalculator {

    public static void main(String[] args) {
        double firstOperand, secondOperand;
        double currentResult = 0.0;
        double sumAvg = 0.0;
        int choice;
        int numOfCalc = 0;
        Scanner scnr = new Scanner(System.in);
        String firstString, secondString;
        boolean menuLoop = true;
        boolean choiceLoop = true;
        while (menuLoop) {// this loop lets the menu keep showing up until the boolean is false
            System.out.println("Current Result: " + currentResult + "\n");//shows the menu of the calculator
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average\n");
            while (choiceLoop) {// this loop allows the user to make a choice on the calculator, and it also keeps the running total for choice 7
                System.out.println("\nEnter Menu Selection: ");
                choice = scnr.nextInt();
                if (choice == 0){// Exits the program
                    menuLoop = false;
                    choiceLoop = false;
                    System.out.println("Thanks for using this calculator. Goodbye!");
                }else if (choice == 1) {// Addition
                    System.out.println("Enter first operand: ");
                    firstString = scnr.next();
                    if (firstString.equals("RESULT")) {
                        firstOperand = currentResult;
                    } else {
                        firstOperand = Double.parseDouble(firstString);
                    }
                    System.out.println("Enter second operand: ");
                    secondString = scnr.next();
                    if (secondString.equals("RESULT")) {
                        secondOperand = currentResult;
                    } else {
                        secondOperand = Double.parseDouble(secondString);
                    }
                    currentResult = firstOperand + secondOperand;
                    sumAvg += currentResult;
                    numOfCalc++;
                    choiceLoop = false;
                }else if (choice == 2) {//Subtraction
                    System.out.println("Enter first operand: ");
                    firstString = scnr.next();
                    if (firstString.equals("RESULT")) {
                        firstOperand = currentResult;
                    } else {
                        firstOperand = Double.parseDouble(firstString);
                    }
                    System.out.println("Enter second operand: ");
                    secondString = scnr.next();
                    if (secondString.equals("RESULT")) {
                        secondOperand = currentResult;
                    } else {
                        secondOperand = Double.parseDouble(secondString);
                    }
                    currentResult = firstOperand - secondOperand;
                    sumAvg += currentResult;
                    numOfCalc++;
                    choiceLoop = false;
                }else if (choice == 3) {//Multiplication
                    System.out.println("Enter first operand: ");
                    firstString = scnr.next();
                    if (firstString.equals("RESULT")) {
                        firstOperand = currentResult;
                    } else {
                        firstOperand = Double.parseDouble(firstString);
                    }
                    System.out.println("Enter second operand: ");
                    secondString = scnr.next();
                    if (secondString.equals("RESULT")) {
                        secondOperand = currentResult;
                    } else {
                        secondOperand = Double.parseDouble(secondString);
                    }
                    currentResult = firstOperand * secondOperand;
                    sumAvg += currentResult;
                    numOfCalc++;
                    choiceLoop = false;
                }else if (choice == 4) {// Division
                    System.out.println("Enter first operand: ");
                    firstString = scnr.next();
                    if (firstString.equals("RESULT")) {
                        firstOperand = currentResult;
                    } else {
                        firstOperand = Double.parseDouble(firstString);
                    }
                    System.out.println("Enter second operand: ");
                    secondString = scnr.next();
                    if (secondString.equals("RESULT")) {
                        secondOperand = currentResult;
                    } else {
                        secondOperand = Double.parseDouble(secondString);
                    }
                    currentResult = firstOperand / secondOperand;
                    sumAvg += currentResult;
                    numOfCalc++;
                    choiceLoop = false;
                }else if (choice == 5) {// Exponentiation
                    System.out.println("Enter first operand: ");
                    firstString = scnr.next();
                    if (firstString.equals("RESULT")) {
                        firstOperand = currentResult;
                    } else {
                        firstOperand = Double.parseDouble(firstString);
                    }
                    System.out.println("Enter second operand: ");
                    secondString = scnr.next();
                    if (secondString.equals("RESULT")) {
                        secondOperand = currentResult;
                    } else {
                        secondOperand = Double.parseDouble(secondString);
                    }
                    currentResult = Math.pow(firstOperand,secondOperand);
                    sumAvg += currentResult;
                    numOfCalc++;
                    choiceLoop = false;
                }else if (choice == 6) {//logarithm
                    System.out.println("Enter first operand: ");
                    firstString = scnr.next();
                    if (firstString.equals("RESULT")) {
                        firstOperand = currentResult;
                    } else {
                        firstOperand = Double.parseDouble(firstString);
                    }
                    System.out.println("Enter second operand: ");
                    secondString = scnr.next();
                    if (secondString.equals("RESULT")) {
                        secondOperand = currentResult;
                    } else {
                        secondOperand = Double.parseDouble(secondString);
                    }
                    currentResult = Math.log(secondOperand) / Math.log(firstOperand);
                    sumAvg += currentResult;
                    numOfCalc++;
                    choiceLoop = false;
                }else if (choice == 7) {// Average
                    if (numOfCalc == 0) {
                        System.out.println("Error: No calculations yet to average!");
                    } else {
                        System.out.print("Sum of calculations: " + sumAvg + "\nNumber of calculations: " + numOfCalc + "\nAverage of calculations: ");
                        System.out.printf("%.2f" , (sumAvg/numOfCalc));//"%.2f" reduces the average to two decimal places
                    }
                }else {// If input is not valid (not 1-7)
                    System.out.println("Error: Invalid selection!");
                }
            }
            choiceLoop = true;


        }


    }

}