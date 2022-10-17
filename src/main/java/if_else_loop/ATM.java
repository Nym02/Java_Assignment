// 4. Write a program to check balance and withdraw money from ATM booth using if else or switch case

package if_else_loop;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 100000, withdraw;



        while(true)
        {
            System.out.println("Welcome to QA Bank ATM Machine");
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Check Balance");
            System.out.println("Enter 4 for EXIT");
            System.out.println("");


            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the amount you want to withdraw:");
                    withdraw = input.nextInt();

                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println(" ");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                        System.out.println(" ");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

    }

