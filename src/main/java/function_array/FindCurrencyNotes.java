/*2. Input an amount from the user and find out the number of notes from input amount in given array
        [1000,500,100,50,20,10,5,2,1]
        Input: 1256
        Output:
        1000 1
        100 2
        50 1
        2 3 */

package function_array;

import java.util.Scanner;

public class FindCurrencyNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount;
        int notes[] = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[9];

        System.out.println("Enter the amount: ");
        amount = input.nextInt();

        for(int i=0; i<notes.length; i++){
            noteCounter[i] = amount / notes[i];
            amount = amount % notes[i];

        }
        System.out.println("Currency Count: ");
        for(int i=0; i<noteCounter.length; i++){
            System.out.println(notes[i] + " : " + noteCounter[i]);
        }
    }
}
