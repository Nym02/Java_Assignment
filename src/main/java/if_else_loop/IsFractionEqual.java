//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

package if_else_loop;

import java.util.Scanner;

public class IsFractionEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;

        System.out.println("Enter number 1: ");
        a = input.nextDouble();
        System.out.println("Enter number 2: ");
        b = input.nextDouble();

        if(a == b){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}
