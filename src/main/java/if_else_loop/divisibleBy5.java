//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100

package if_else_loop;

public class divisibleBy5 {
    public static void main(String[] args) {
        int sum = 0;


        for(int i=0; i<100; i++){
            if(i % 5 == 0){
                sum += i;
            }
        }

        System.out.println("The sum: " + sum);
    }
}
