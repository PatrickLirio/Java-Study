
// This is about encapsulation tutorial
/*
    - the purpose of encapsulation is to HIDE data from one class to another class
        it provides security
*/
package oopmethod3;

/**
 *
 * @author Patrick
 */
public class OOPMethod3 {

  
    public static void main(String[] args) {
        
//        //example 1:
//        // lets initialize the student class here in the main method
//        student stud1 = new student();
//        stud1.weight();
////        stud1.studentGrade(); /*uncomment this and check the error for yourself */
      
        //example 2:
//        student stud2 = new student ("Crystel Ganda", 95, 2024);
//        stud2.displayStudentDetails();
        
        //example 3:
        student stud3 = new student ("Crystel Ganda", 95, 2024);
        System.out.println("Getter");
        System.out.println(stud3.getStudentName());
        System.out.println(stud3.getStudentGrade());
        System.out.println(stud3.getStudentYear());
        System.out.println("-------------------------");
        System.out.println("Setter");
        stud3.setStudentInfo("Patrick pogi",100,2025);
        System.out.println("New Student name is "+stud3.getStudentName());
        System.out.println("New Student grade is "+stud3.getStudentGrade());
        System.out.println("New Student year is "+stud3.getStudentYear());
        

    }
    
}
