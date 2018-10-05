//<Program2.java> -- Bar chart printing program
//CSIS 212-B01
//<Citations if necessary> -- citations are required
//  for any references you used (outside of your book, 
//  the website associated with your book, or references
//  provided in class/Blackboard).

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;
/**
 *
 * @author andrew
 */
public class Program2 { 
     public static void main(String[] args) {
        int num1 = 0; 
        int num2 = 0; 
        int num3 = 0; 
        int num4 = 0; 
        int num5 = 0;

        Scanner input = new Scanner (System.in); 
        System.out.print("Enter a number between 1 - 30 "); //requests user number input
        num1 = input.nextInt();//stores number to variable
        while (num1 > 30){System.out.print("Invalid entry, try again: ");num1 = input.nextInt();} //checks validity

        System.out.print("Enter a number between 1 - 30 "); //requests user number input
        num2 = input.nextInt(); //stores number to variable
        while (num2 > 30){System.out.print("Invalid entry, try again: ");num2 = input.nextInt();} //checks validity
        
        System.out.print("Enter a number between 1 - 30 "); //requests user number input
        num3 = input.nextInt(); //stores number to variable
        while (num3 > 30){System.out.print("Invalid entry, try again: ");num3 = input.nextInt();} //checks validity
        
        System.out.print("Enter a number between 1 - 30 "); //requests user number input
        num4 = input.nextInt(); //stores number to variable
        while (num4 > 30){System.out.print("Invalid entry, try again: ");num4 = input.nextInt();} //checks validity
        
        System.out.print("Enter a number between 1 - 30 "); //requests user number input
        num5 = input.nextInt(); //stores number to variable
        while (num5 > 30){System.out.print("Invalid entry, try again: ");num5 = input.nextInt();} //checks validity
    for(int i = 0; i <= num1-1 && i < 30; i++){ //prints num1 *s
            System.out.print("*");  
        } 
        System.out.print("\n"); 
    for(int i = 0; i <= num2-1 && i < 30; i++){ //prints num2 *s
            System.out.print("*");  
        } 
        System.out.print("\n");  
    for(int i = 0; i <= num3-1 && i < 30; i++){ //prints num3 *s
            System.out.print("*");  
        } 
        System.out.print("\n");  
    for(int i = 0; i <= num4-1 && i < 30; i++){ //prints num4 *s
            System.out.print("*");  
        } 
        System.out.print("\n");  
    for(int i = 0; i <= num5-1 && i < 30; i++){ //prints num5 *s
            System.out.print("*");  
        } 
        System.out.print("\n");  
} }
