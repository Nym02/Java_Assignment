// 8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

package if_else_loop;

import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        int count = 0;


        double rn11 = Math.round(Math.random() * 100);
        double rn22 =  Math.round(Math.random() * 100);

        for(int i=1; i<=10; i++){
            System.out.println("Guess the random numbers: ");
            num = input.nextDouble();

            if(num == rn11 || num == rn22){
                count++;
            }
        }

        System.out.println("You guessed it "+ count + " times correctly");






    }
}
