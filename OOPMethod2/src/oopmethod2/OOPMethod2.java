

//This is about classes,objects and constructor
/* 
- One way to create a class go to the project file of this code and click 
the "Source Packages" file and right click the "OOPMethod2.java" and click
"new" and then "java class"
- there is only one main method where you can render all your methods
- to call the class name you need to treat it as Scanner class 
*/
package oopmethod2;

import java.util.Scanner;


public class OOPMethod2 {


    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        /* syntax to call the other class
            !! initialized if first by doing this
            className objectName = new Constructor;
            !! to call the method in a class do this
            objectName.methodName();
        */
        //student student1 = new student();
       // car densoTech = new car();
        
//        student1.displayName();
//        student1.displayGrade();
//        densoTech.carName();
//        student1.inputTaking();
        
        // example to get the name from the student class
//          System.out.println("Your name is "+ student1.name);
//          System.out.println("Your age is "+ student1.age); /* uncommenct this and read the error message to see why not working*/


        //example to get the value private variable from the class
//       student student1 = new student("crystel");
//       student1.displayName();
       //another complex example
        System.out.print("Enter your name: ");
        String name = inp.next();
        System.out.print("Enter your age: ");
        int age = inp.nextInt();
        student student1 = new student(name,age);
        student1.displayStudentInfo();
       
    }
    
}
