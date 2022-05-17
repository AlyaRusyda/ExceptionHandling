package javaapplication2.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException {
        public static void main(String[] args) {
            //int a=100;
            //System.out.println("Enter the value for b");
            Scanner scan = new Scanner(System.in);
            // int b = console.nextInt();

            System.out.println("Enter the value for c");
            // Exception Handling
            try {
                int c = scan.nextInt();
                int res = c / 0;
                // 10/(b-c);    
                System.out.println(" The result is " + res);
            }
            catch (Exception a){
            System.out.println("adalah = " + a);
        }
    }
}