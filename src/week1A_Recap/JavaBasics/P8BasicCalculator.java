package week1A_Recap.JavaBasics;

import java.util.Scanner;

public class P8BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int choice = 0;

        do{
            System.out.println("\nCalculator Application");
            System.out.println("1. Add ");
            System.out.println("2. Subtract ");
            System.out.println("3. Multiply: ");
            System.out.println("4. Divide ");
            System.out.println("5. Exit ");
            System.out.println("Enter a choice between 1-5: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = scanner.nextDouble();

                    if(num2 != 0) {
                        System.out.println("Result = " + (num1 / num2));
                    }

                    else{
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Calculator Application.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Selection");
            }
        }while(choice!=5);
    }//main
}//class
