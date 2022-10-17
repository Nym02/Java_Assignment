//4. Write a program that will give following output:
//        Input: chattogram
//        Output: C8M

package string_manipulation;

public class ReplaceMiddleChar {
    public static void main(String[] args) {
        String str = "chattogram";

        str = str.toUpperCase();

        char s1 = str.charAt(0);
        char s2 = str.charAt(str.length()-1);

        int strLength = str.length() - 2;

        System.out.println("Output is: "+s1+strLength+ s2);

    }
}
