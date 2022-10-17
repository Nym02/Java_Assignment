//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()


package function_array;

import java.util.Scanner;

public class FindAvg {
    public void average(int arr[]){
        double sum = 0;
        double avg = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        avg = sum / arr.length;

        System.out.println("Average is: " + avg);
    }
    public int countEvenNumbers(int arr[]){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }
    public int countOddNumbers(int arr[]){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter array elements: ");
        for(int i=0; i<5; i++){
            arr[i] = input.nextInt();
        }

        FindAvg avg = new FindAvg();
        avg.average(arr);
        int countEvenNum = avg.countEvenNumbers(arr);
        System.out.println("This array has "+countEvenNum+" even numbers.");
        int countOddNum = avg.countOddNumbers(arr);
        System.out.println("This array has "+countOddNum+" Odd numbers.");

    }
}
