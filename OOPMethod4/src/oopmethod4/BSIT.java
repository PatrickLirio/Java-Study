/*
-this will represent as the child of Student class
// just put the "extend"
*/
package oopmethod4;


public class BSIT extends student{
    
    public BSIT(String Name, int Grade) {
        super(Name, Grade);
    }
    
    public void displaySection(){
        System.out.println("Your section is BSIT 1-A");
    }
    
}
