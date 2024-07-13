/*
This is about inheritance OOP
//Things to know
SuperClass (parent)
SubClass (child

-methods/attributes
*/
package oopmethod4;

import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class OOPMethod4 {

   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your student name: ");
        String studName = inp.next();
        System.out.print("Enter your student grade: ");
        int studGrade = inp.nextInt();
        //example 1
//        // calling the student class
//        student stud1 = new student(studName, studGrade);
//        stud1.displayStudName();
//        stud1.displayStudGrade();
//        stud1.studAge=12;

//        //example 2 
//           // The child class BSIT being called
//        BSIT bsit1 = new BSIT(studName,studGrade);
//        bsit1.displayStudName();
//        bsit1.displayStudGrade();
//        //own method
//        bsit1.displaySection();
        
        //example 3
//            // The child class BSCpE being called
//         BSCpE compeng = new BSCpE (studName, studGrade);
//         compeng.displayStudName();
//         compeng.displayStudGrade();
    }
    
}
