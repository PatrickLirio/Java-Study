
// This is about looping tutorial while, do while ,
package sixth;

import java.util.Scanner;


public class Sixth {

   
    public static void main(String[] args) {
        //While Loop = it reads the condition first before it execute
        //Create a program that will print a value from 1-10
        //Syntax
       /* while (condition){
            increment/decrement;
            statement;
        }*/
       //Ex. Create a program that will print value from 1 -> 10
       /*int count = 1;
       while (count <= 10)
       {
           System.out.println("Do While"); 
           System.out.println(count);
           count++;
       }
        */
       //do while loop = it does first the execution before it reads the condition
     /*  int count2 = 1;
      do{
          System.out.println("Do While");
          System.out.println(count2);
          count2++;
      }while(count2 <= 10);
       */
     //Ex.#2
     Scanner inp = new Scanner (System.in);
     int inputs, num, sum = 0;
     
        System.out.print("Enter number of Inputs: ");
        inputs = inp.nextInt();
        int count = 1;
        //while loop example
        /*while (count <= inputs)
        {
            System.out.print("Enter value for num "+ count +": ");
            num = inp.nextInt();
            sum = sum + num;
            count++;
        }*/
        //do while loop example
        do
        {
            System.out.print("Enter value for num "+ count +": ");
            num = inp.nextInt();
            sum = sum + num;
            count++;
        }while (count <= inputs);
        System.out.println("Sum of integers: "+ sum);
    }
    
}
