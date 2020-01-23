import java.util.*;
public class Calculator {

    public static void main(String[] args) {
	double firstOperand;
	double secondOperand;
	int operation; //tells code which operation is going to occur
	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter first operand: ");
	firstOperand = scnr.nextDouble();
	System.out.print("Enter second operand: ");
	secondOperand = scnr.nextDouble();

	System.out.println("Calculator Menu");
	System.out.println("---------------");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.print("Which operation do you want to perform? ");
	operation = scnr.nextInt();//allows user to use one of the four operations
	if (operation == 1)//add
	{
		System.out.print("The result of the operation is " + (firstOperand + secondOperand) + ". Goodbye!");
	}
	else if (operation == 2)//subtract
	{
		System.out.print("The result of the operation is " + (firstOperand - secondOperand) + ". Goodbye!");
	}
	else if (operation == 3)//multiply
	{
		System.out.print("The result of the operation is " + (firstOperand * secondOperand) + ". Goodbye!");
	}
	else if (operation == 4)//divide
	{
		System.out.print("The result of the operation is " + (firstOperand / secondOperand) + ". Goodbye!");
	}
	else System.out.print("Error: Invalid selection! Terminating program.");
    }
}
