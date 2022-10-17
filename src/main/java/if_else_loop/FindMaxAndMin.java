//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package if_else_loop;

import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int num;
        char ch;

        do{
            System.out.println("Enter your number: ");
            num = input.nextInt();

            if(max < num){
                max = num;
            }

            if(num < min){
                min = num;
            }
            System.out.println("Do you want to continue y/n?");
            ch = input.next().charAt(0);
        } while(ch == 'y' || ch == 'Y');

        System.out.println(max);
        System.out.println(min);
    }
}
