/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialfunc;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Factorialfunc {
   
    public static long factorial(int n) {
        if(n ==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.print("Enter number: ");
            int num = scan.nextInt();
            
            long calcfact = factorial(num);
            System.out.printf("the factorial: %d", calcfact);
        }
    }
}
