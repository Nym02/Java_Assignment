//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4

package string_manipulation;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int count = 0;

        System.out.println("Enter your string: ");
        s = input.nextLine();
        s = s.toLowerCase();


        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println("Vowels counted: " + count + " times.");
    }
}
