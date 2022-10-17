package string_manipulation;

import java.util.Scanner;

public class MakeUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;


        System.out.println("Enter String: ");
        str = input.nextLine();

        String words[]=str.split(" ");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }

        System.out.println(capitalizeWord);

    }
}
