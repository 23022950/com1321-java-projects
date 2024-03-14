/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannerclass3;

/**
 *
i * @author user
 */
 import java.util.Scanner;

public class Scannerclass3 {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    
    
    int num1, num2 , subtraction;
    
    System.out.print("Enter Eirst Num: ");
    num1 = input.nextInt();
    
     num2 = input.nextInt();
    
    subtraction = num1 - num2;
    
    System.out.print("The Final Answer is: " +subtraction);
    
    
    }
}
