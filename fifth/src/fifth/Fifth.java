
//This is about the Logical Condition, Logical Operators, Conditional Statments
// created a sample project "Payroll System"
package fifth;

import java.util.Scanner;

public class Fifth {

  
    public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
         //if else = either true or false;
        //if condition = possibility to become true in many parts
        //else = the catcher if the if conditions are not met
        //else if = if ever false on previous line (if statement) it
        //will print out and it will not go through the next line.
//        System.out.printf("Enter your grade: ");
//        int grade = inp.nextInt();
//        if (grade >= 75 && grade <= 80)
//        {
//            System.out.println("CICT!");
//        }
//        else if (grade >= 81 && grade <=90 ){
//            System.out.println("BSIT");
//        } 
//        else if (grade >= 91 && grade <=95 ){
//            System.out.println("BSCS");
//        } 
//        else if (grade >= 96 && grade <=100 ){
//            System.out.println("BSCpE");
//        } 
//        else{
//            System.out.println("Invalid!");
//        }
//          
        
/* Lets do a sample code */        
        /* Payroll system */
         Scanner inp = new Scanner(System.in);
        long empNum;
        String empName = null;
        double hourSalary, weeklyTime, weeklySalary, 
                overTime, regPay,overtimePay,netPay;
        System.out.printf("Enter Employee No. : ");
        empNum = inp.nextLong();
        System.out.printf("Enter Hourly Salary: ");
        hourSalary = inp.nextDouble();
        System.out.printf("Enter Weekly Time: ");
        weeklyTime = inp.nextDouble();
        
        if (empNum == 10001){
            empName = "Patrick Pogi";
        }
        else if(empNum == 10002){
            empName = "Crystel Ganda";
        }
        else if(empNum == 10003){
            empName = "Bajop Pogi";
        }
        else if(empNum == 10004){
            empName = "kape";
        }
        else{
            System.out.println("Unknown Employee!");
        }
        
        if (weeklyTime <= 100){
            weeklySalary = weeklyTime;
            overTime = 0;
            regPay = hourSalary * weeklyTime;
            overtimePay = 0;
            netPay = regPay;
        }
        else{
            weeklySalary = 200;
            overTime = weeklyTime - 40;
            regPay = hourSalary * weeklySalary;
            overtimePay = hourSalary * overTime;
            netPay = regPay + overtimePay;
        }
        System.out.println("==========================");
        System.out.println("=-=- Employee Payroll =-=-=");
        System.out.println("==========================");
        System.out.printf("Employee Number: %d\n", empNum);
        System.out.println("Employee Name: "+ empName);
        System.out.printf("Hourly Salary: %.2f\n",hourSalary );
        System.out.printf("Weekly Time: %.2f\n",weeklyTime );
        System.out.printf("Weekly Salary: %.2f\n",weeklySalary );
        System.out.printf("Regular Pay: %.2f\n", regPay);
        System.out.printf("Overtime Pay: %.2f\n",overtimePay);
        System.out.printf("Total Pay: %.2f\n",netPay);
                
        
    }
    
}
