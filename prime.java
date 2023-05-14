//I wrote a function to check if the number is prime or not and return a message to the user
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
              if(PrimeNum(number)==1){
              System.out.println(number + " is prime number" );
              }
              else{
                   System.out.println(number + "  is composite number and factors are -> " );
                    //Display the factors        
                }
               }
             }
         }
     }
    public static int PrimeNum(int num) {
        if (num <= 1) {
            return 0;
        }
        else{
        for (int i = 2; i < num; i++) {
         if (num % i == 0) {
          return 0;   
            }
        }
        
     }
         return 1;
    }
     }

