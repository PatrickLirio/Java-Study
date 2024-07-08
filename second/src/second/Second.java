
//This is about the right String Formatting tutorial
package second;


public class Second {

 
    public static void main(String[] args) {
        
        //Display string value
        String college = "CET";
        String name = "Patrick Pogi";
        System.out.printf("College: %s \nName: %s\n", college, name);
        
        //Display integer value
        int grade = 100;
        System.out.printf("\nThe grade is: %d\n", grade);
        
        //Display decimal value
        float num = 3.434321f;
        double number = 7.8432973402f;
        System.out.printf("\nThe decimal value is: %f\n", num);
        
        //Display formatting with width %.4f
        System.out.printf("\nFormatting with only 4 decimal place value: %.4f \n", number);
        
        //Displaying from right with 20 characters space
        System.out.printf("\nFormat via right: %5.2f", num);
    }
    
}

// this formatting will only work for "printf"
// %s = for inserting string
// %d = for inserting integer
// %f = for inserting decimal value (float or double)
// %2f = how many decimal place you will be showing
// %3.3f = for inserting spaces "number of characters.number of decimal places and put f"