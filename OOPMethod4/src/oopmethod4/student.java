/*
in this class you will learn about constructors
-protected means all of the child can modify and access the variable 
of the parent class modify it in the main method
*/
package oopmethod4;


public class student {
    protected int studAge;
    private String studName;
    private int studGrade;
    // constructors
        /*Getter = taking the private variables and set it to public variables*/
    public student(String Name, int Grade){
        this.studName = Name;
        this.studGrade= Grade;
    }
        /*Setter = since the private variables are already equal to public
        we can call it now
        */
    public void displayStudName(){
        System.out.println("STUDENT CLASS");
        System.out.println("Your student name is "+ this.studName);
    }
    public void displayStudGrade(){
        System.out.println("STUDENT CLASS");
        System.out.println("Your student grade is "+ this.studGrade);
    }
}
