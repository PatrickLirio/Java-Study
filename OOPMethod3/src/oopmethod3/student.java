
// this is a student class
/*
- to initialize the private date you need a constructor
-getter and setter is a method 
-when you are returning date make sure that the returnType is based on the 
    type of data that you are returning. do not use void
*/
package oopmethod3;

/**
 *
 * @author Patrick
 */
public class student {
    //example 1:
//    //example of a public method
//    public void weight(){
//        System.out.println("Your weight is 70kg. ");
//    }
//    
//    //example of a private method
//    private void studentGrade(){
//        System.out.println("Student grade");
//    }
    
    //example 2:
//    private String studentName;
//    private int studentGrade;
//    private int studentYear;
//    
//    public student(String Name, int Grade, int Year){
//        this.studentName = Name;
//        this.studentGrade = Grade;
//        this.studentYear = Year;
//        
//    }
//    public void displayStudentDetails(){
//        System.out.println("Hi "+ this.studentName);
//        System.out.println("Your Grade is "+ this.studentGrade);
//        System.out.println("In the year "+ this.studentYear);
//    }
//    
    //example 3 Getter and Setter
    /*
    return = to return the data of variables
    */
    private String studentName;
    private int studentGrade;
    private int studentYear;
    
  
  public student(String Name, int Grade, int Year){
       this.studentName = Name;
        this.studentGrade = Grade;
        this.studentYear = Year;
}
    //Getter
    public String getStudentName(){
        return this.studentName;
    }
    public int getStudentGrade(){
        return this.studentGrade;
    }
    public int getStudentYear(){
        return this.studentYear;
    }
    
    //Setter
    public void setStudentInfo(String Name, int Grade, int Year){
        this.studentName = Name;
        this.studentGrade = Grade;
        this.studentYear = Year;
    }
    public void displayStudentDetails(){
        System.out.println("Hi "+ this.studentName);
        System.out.println("Your Grade is "+ this.studentGrade);
        System.out.println("In the year "+ this.studentYear);
    }
}
