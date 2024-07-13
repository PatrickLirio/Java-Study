/*
-this is another child class inheriting the constructors of superclass (student)
*/
package oopmethod4;

/**
 *
 * @author Patrick
 */
public class BSCpE extends student{
    
    public BSCpE(String Name, int Grade) {
        super(Name, Grade);
    }
    
    public void displaySection(){
        System.out.println("Your section is BSCpE 3-A");
    }
}
