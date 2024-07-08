// This is the tutorial of the basic input and output
package first.project;

import java.util.Scanner; // the package for scanner

public class FirstProject {
//    static int num = 10;
    public static void main(String[] args) {
        // output
//        System.out.println("Hi Hello"); /*next line*/
//        System.out.print("Patrick");
        
        System.out.println("Hello Patrick");
        //Scanner class
        Scanner inp = new Scanner (System.in);
        // Datatype 
        double num; 
        System.out.print("Enter a number: ");
        num = inp.nextDouble();
        System.out.println(num);
    }
    
}

//sout + tab = shortcut key for System.out.print
//alt + shift + i = to import scanner package