
/* This is about explaining what is method,creating a method, calling a method, 
creating parameter, calling paremeter, creating argument (real value), method overloading

*/
package oopmethods1;

import java.util.Scanner;


public class OOPMethods1 {
Scanner inp = new Scanner(System.in);
  
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temp;
//        displayName();
//        System.out.print("Enter temperature value: ");
//        temp = inp.nextInt();
//        temperature(temp);
          System.out.print("Input car name: ");
          String name = inp.next();
          System.out.print("Input car color: ");
          String color = inp.next();
          //carDetails(name,color);
          System.out.print("Enter car Price: ");
          String price = inp.next();
          carDetails(price);
    }
    public static void displayName(){
        Scanner inp = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = inp.next();
        System.out.println("Hi "+ name);
        inputGrade();
    }
    public static void inputGrade(){
        Scanner inp = new Scanner(System.in);
        int grade;
        System.out.print("Enter your grade!: ");
        grade = inp.nextInt();
        System.out.println("Your grade is: "+ grade);
        
    }
    public static void temperature(int tempa){
        System.out.println("The inputed temperature is "+ tempa);
        
    }
    public static void temperature(float tempa){
        System.out.println("The inputed temperature is "+ tempa);
        
    }
    //method overloading example
    public static void carDetails(String name, String color){
        System.out.println("Name of the car is "+ name);
        System.out.println("The color of the car is " + color);
    }
    public static void carDetails(String name){
        System.out.println("Name of the car is "+ name);
        
    }
    public static void carDetails(int price){
        System.out.println("Name of the car is "+ price);
        
    }
    
    
}
