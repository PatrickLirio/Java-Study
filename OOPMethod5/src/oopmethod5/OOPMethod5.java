/*
This is all about PolyMorphism tutorial

polymorphism = "Many" "Forms"
ex.
superClass(Student)
subClass(BSIT,BSCpE,Educ)
own implementation: section

they share common name and grades being asked but 
they have their own implementation

*/
package oopmethod5;

public class OOPMethod5 {

  
    public static void main(String[] args) {
       // call the student class (parent class)
       Student stud1 = new Student ();
       stud1.studentSection();
       
       // call the BSIT class (child class)
       BSIT bsit = new BSIT();
       bsit.studentSection();
       
       // call the Educ class (child class)
       Educ teacher = new Educ();
        teacher.studentSection();
        
        // Other way to call the parent and child at the same time
        //example 1
        Student stud2 = new BSIT();
        stud2.studentSection();
        //example 2
        Student stud3 = new Educ();
        stud3.studentSection();
    }
    
}
