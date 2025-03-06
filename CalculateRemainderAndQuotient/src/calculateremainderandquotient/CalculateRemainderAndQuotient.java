
package calculateremainderandquotient;

import java.util.Scanner;


public class CalculateRemainderAndQuotient {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = scn.nextDouble();
        
        System.out.println("Enter a number:");
        double num2 = scn.nextDouble();
        
        double calculation = num1/num2;
        System.out.println("Quotient and Remainder: " + calculation);
        
    }
    
}
