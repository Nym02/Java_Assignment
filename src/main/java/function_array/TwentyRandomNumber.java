//7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)

package function_array;

public class TwentyRandomNumber {
    public void findMax(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max element is: "+ max);
    }
    public void findMin(int arr[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min element is: "+ min);
    }
    public void findDuplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Elements are: " + arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int randomNum[] = new int[20];
        int rn;


        for(int i=0; i<20; i++){
             rn = (int) Math.floor(Math.random() * 100);
            randomNum[i] = rn;
        }

        TwentyRandomNumber num = new TwentyRandomNumber();
        num.findMax(randomNum);
        num.findMin(randomNum);
        num.findDuplicate(randomNum);

    }
}
