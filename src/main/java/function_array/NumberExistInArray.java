//1. Take input from a user and check if the number exists in the array
//        let the array is [1,3,5,7,2,4,6,8]
//        Input: 7
//        Output: Found in the position 3
//        Input: 9
//        Output: Found no element

package function_array;

import java.util.Scanner;

public class NumberExistInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count=0;
        int arr[] = {1,3,5,7,2,4,6,8,3};

        System.out.println("Enter the number: ");
        num = input.nextInt();


        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
                System.out.println("Found in " + i + " position");
            }

        }

        if(count == 0){
            System.out.println("Found no element.");
        }

    }
}
