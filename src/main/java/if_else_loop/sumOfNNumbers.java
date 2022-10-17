//9. Write a program to sum of user input until users input ‘q’ from keyboard

package if_else_loop;

import java.util.Scanner;

public class sumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        char ch;

        do{
            System.out.println("Enter a number: ");
            num = input.nextInt();

            sum += num;

            System.out.println("Enter q to stop the addition");
            ch = input.next().charAt(0);

        }while(ch != 'q');

        System.out.println("The sum is: " + sum);
    }
}
