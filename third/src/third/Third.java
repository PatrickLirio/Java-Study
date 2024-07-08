// This is executing the Math functions tutorial
package third;


public class Third {

   
    public static void main(String[] args) {
        double num1 = 58;
        double num2 = 10;
        
        //Maximum value Math.max(variableName, variableName)
        System.out.println("The maximum value is: " + Math.max(num1, num2));
        /* the output will be "The maximum value is: 50.0" */
        
        //Minimum value Math.min(variableName, variableName)
        System.out.println("The minimum value is: " + Math.min(num1, num2));
        /* the output will be "The minimum value is: 10.0" */
        
        //Square root Math.sqrt(variableName)
        System.out.println("The square root of "+ num2 + "is: " + Math.sqrt(num2));
        /*OR*/
        double sqrtNum = Math.sqrt(num2);
        System.out.println("The square root of "+ num2 + "is: "+sqrtNum);
        /* the output will be "The square root of 10.0is: 3.1622776601683795"*/
        
       //Power Math.pow(variableName,variableName);
        System.out.println("The power of num1 and num2 is: "+ Math.pow(num1,num2));
        /* the output will be "The power of num1 and num2 is: 4.3080420689940582E17"*/
        
        //Exponent Math.exp(variableName);
        System.out.println("The exponent of "+ num1 + "is: " + Math.exp(num1));
        /* the output will be "The exponent of 58.0is: 1.545538935590104E25"*/
    }
    
}
