

//This is the new class now
package oopmethod2;

import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class student {
//    Scanner inp = new Scanner(System.in);
//    // consist of members and objects
//    public void inputTaking(){
//        String name;
//        int grade;
//        System.out.print("Enter your name: ");
//        name = inp.next();
//         System.out.println("Your name is: "+ name);
//        System.out.print("Enter your Grade: ");
//        grade = inp.nextInt();
//        System.out.print("Your Grade is: "+ grade);
//    }
//    public void displayName(){
//        System.out.print("My name is Patrick ");
//    }
//    public void displayGrade(){
//        System.out.print("My grade is 90");
//    }
    
    //other example
    /* modifier type:
        public = can be access in other class
        private = can not be access in other class
        
    
    */
    private String name;
    public int grade;
    private int age;
    
    
    
    //methods with same name of class, without type
    public student (String name,int age){
        // to call the private member of the class use "this" constructor
        this.name = name;
        this.age = age;
    }
    public void displayStudentInfo(){
        System.out.println("Hi "+ this.name);
        System.out.println("Your age is: "+ this.age);
    }
    
    
}
