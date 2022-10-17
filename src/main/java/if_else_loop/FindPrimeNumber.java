//7. Write a program to print prime numbers from 2 to n

package if_else_loop;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean prime;
        System.out.println("Enter a number: ");
        n = input.nextInt();



        for(int i = 2; i <= n; i++){
            prime = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0)
                {
                    prime = false;
                    break;
                }
            }

            if(prime){
                System.out.println(i);
            }
        }
    }
}
