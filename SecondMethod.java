//I implemented a function that determines the number of iterations for a prime or a composite number using the second method. Furthermore, I have made necessary updates to various sections within my functions.
import java.util.Scanner;
public class try_ass4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while (true) {
             
             System.out.println("--------------------------");
             System.out.println("Prime Number Checker");
             System.out.println("--------------------------");
             System.out.println("1. CHECK!");
             System.out.println("0. EXIT!");
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
                 if(PrimeNum(number)==1){
                 System.out.println(number + "is prime number and factors are -> " );
                 System.out.println("With 1st method, the number of iterations is: " + FirstMethod(number));
                 System.out.println("With 2nd method, the number of iterations is: " + SecondMethod(number));
        
                 }
        
               else{
                 System.out.println("is composite number and factors are -> " + factor(number));
                 System.out.println("With 1st method, the number of iterations is: " + FirstMethod(number));
                 System.out.println("With 2nd method, the number of iterations is: " + SecondMethod(number));
                 System.out.println();
        
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

    public static String factor(int number) {
    String f = "" ;

    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            f=f+ i + ",";
        }
    }
    if(!f .isEmpty()){ // Remove the , if there are numbers
        f  = f .substring(0, f .length() - 1);
    }

    return f ;
}



    public static int FirstMethod(int number) {
        int NumberOfIter = 0;
        for (int i = 2; i < number; i++) {
            NumberOfIter++;
        }
        return NumberOfIter;
    }

  

public static int SecondMethod(int number) {
    double b = Math.sqrt(number);
    int x = number;
    int i = 2;
    int iterations = 0;
    boolean flag = false;

    while (x > 1 && i <= b) {
        while (x % i == 0) {
         //   System.out.println(i);
            x /= i;
            b = Math.sqrt(x);
            iterations++;
        }
        i++;
        iterations++;
    }
    return iterations;
}

}
