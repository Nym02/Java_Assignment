//6. Write  a program to find the factorial of a given number

package if_else_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        long factorial = 1;
        System.out.println("Enter a number: ");

        num = input.nextInt();

        for(int i=1; i<=num; i++){
            factorial *= i;
        }

        System.out.println("Factorial of" + num + "is: " + factorial);

    }
}
