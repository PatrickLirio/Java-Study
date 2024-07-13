/*
-this is one of the child class
-to get the implementation of parent class use "extends"
- to overide the implementation that was set to the parent class you should
put "@Override"
*/
package oopmethod5;

/**
 *
 * @author Patrick
 */
public class BSIT extends Student {
     @Override // this means you are overiding the student class method
     public void studentSection(){
         System.out.println("Your section is BSIT1A");
     }   
}
