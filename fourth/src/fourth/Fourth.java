
//This will be about the Arithmetic Operations MDAS and Parsing tutorial
package fourth;

import java.util.Scanner;

public class Fourth {

   
    public static void main(String[] args) {
//        Scanner inp = new Scanner (System.in);
//        System.out.printf("Enter first Number: ");
//        int num1 = inp.nextInt();
//        System.out.printf("Enter second Number: ");
//        int num2 = inp.nextInt();
//
//        //Multiplication
//        int product = num1 * num2;
//        System.out.printf("The product of two numbers is: %d\n", product);
//        //Division
//        int quot = num1 / num2;
//        System.out.printf("The Quotient of two numbers is: %d\n", quot);
//        //Addition
//        int sum = num1 + num2;
//        System.out.printf("The sum of two numbers is: %d\n", sum);
//        //Subtraction
//        int diff = num1 - num2;
//        System.out.printf("The difference of two numbers is: %d\n", diff);
//        
        Scanner input = new Scanner (System.in);
        int grade;
        System.out.print("Enter your grade: ");
        grade = input.nextInt();
        System.out.printf("Your grade is %d\n",grade);
        /*OR*/
        System.out.println("Your grade is "+grade);
        
        //Another way to input
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Hi "+name);
        System.out.printf("Hi %s",name);
        
    }
    
}
