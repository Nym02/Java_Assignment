package if_else_loop;

import java.util.Scanner;

public class FindGradeAndGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int subjectNum, count = 0;
        double number, sum = 0;
        System.out.println("Enter the number of subject you have: ");
        subjectNum = input.nextInt();

        for(int i=1; i<=subjectNum; i++){
            System.out.println("Enter your subject number: ");
            number = input.nextDouble();

            if(number >=90){
                sum += 4 * 3;
                System.out.println("Your grade is: A");
            } else if(number >= 70 && number < 90){
                sum += 3.7 * 3;
                System.out.println("Your grade is: A-");
            } else if(number >= 60 && number < 70){
                sum += 3 * 3;
                System.out.println("Your grade is: B");
            } else if(number >=50 && number < 60){
                sum += 2.7 * 3;
                System.out.println("Your grade is: C");
            } else if(number < 50) {
                sum += 0 * 3;
                System.out.println("Your grade is: F");
            }

        }

        System.out.println("Your GPA is: " + sum/(subjectNum*4));


    }
}
