import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // // int number = sc.nextInt();
        // int income = sc.nextInt();
        
        // if else Statement

        int age = 15;
        if(age >= 18) {
            System.out.println("adult : drive, vote");
        } 
        
        if(age > 13 && age < 18) {
            System.out.println("teenager");
        }

        else {
            System.out.println("not adult");
        }

        // Qs print the largest of 2 A=10, B=30.

        int A = 10;
        int B = 30;

        if(A >= B) {
            System.out.println("A is largest number");

        } else {
            System.out.println("B is largest number");
        }
        
        // Qs print if a number is odd or even.

        if(number % 2 == 0) {
        System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // else if Statement

        int age = 13;

        if(age >= 18) {
            System.out.println("Adult");
        } 
         else if(age >= 13 && age < 18 ) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
         }

        // Income Tax Calculator
        
        int tax; 
        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.20);
        } 
        else {
            tax = (int) (income * 0.30);
        }

        System.out.println("Your tax is : " + tax);

// largest of 3. 

        int A = 10;
        int B = 30;
        int C = 60;

        if((A >= B) && (A >= C)) {
            System.out.println("A is largest number");

        }else if (B >= C){
            System.out.println("B is largest number");
        }else {
            System.out.println("C is largest number");
        }
    }
}