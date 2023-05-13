// I started to prepare the menu, the user will be able to enter either 0 or 1.
// If the user enters 1, the system will ask the user to enter a number to check if this number is prime or not.
// If the user enters 0, the system will exit the program.

import java.util.Scanner;
public class try_ass4 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while (true) {
             
             System.out.println("***************************");
             System.out.println("Prime Number Checker");
             System.out.println("***************************");
             System.out.println("0- EXIT!");
             System.out.println("1- CHECK!");
             System.out.print("ENTER YOUR CHOICE:");
             int choice = scanner.nextInt();
             int number = 0;
             
             switch (choice) {
             case 0:
              System.out.println("EXIT THE PROGRAM!!!");
              scanner.close();
               return;
               
              case 1:
              System.out.print("Please Enter a Number: ");
               number = scanner.nextInt();
               if (number == 0) {
               break;
                }
               else{
               //Here I will call my functions in order to check the number and return the number of iterations 
              }
         
                }
          }  
     }
}
