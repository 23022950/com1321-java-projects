/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradesusingifandelse;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Studentgradesusingifandelse {

    public static void main(String[] args) {
       
        int percent;
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter student's percentage:");
        percent = input.nextInt();
        
       
        
        
        
        
        if (percent >= 80) {
            System.out.println("student got level: 7");}
        else if  (percent >= 70) {
        System.out.println("the student got level:6");}
        
        else if (percent >= 60) {
            System.out.println("the student got level:5");}
        else if (percent >= 50) {
            System.out.println("student got level:4");}
        else if (percent >= 40) {
            System.out.println("the student got level:3");}
        else if (percent >= 30) {
            System.out.println("the student got level:2");}
        else if (percent >= 0){
            System.out.println("the student got level: 1 and failed");
       
        }
        
        
        System.out.println("the student got: "+percent+"% ");
    }


}

