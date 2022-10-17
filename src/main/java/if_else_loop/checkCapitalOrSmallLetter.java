//1. Write a program to check if inputted letter is small or capital

package if_else_loop;

import java.util.Scanner;

public class checkCapitalOrSmallLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);


        if(ch >= 65 && ch <= 90){
            System.out.println("Capital Letter");
        } else if(ch >= 97 && ch <= 122){
            System.out.println("Small Letter");
        }
    }
}
