//3. Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary

package function_array;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdHighestSalary {

    public void findSalary(int arr[]){
        Arrays.sort(arr);
        System.out.println("Third Highest Salary: " + arr[arr.length - 3]);
    }

    public static void main(String[] args) {
        int salaryArr[] = {35000, 25000, 28000, 32500, 44000, 32800};
        ThirdHighestSalary salary = new ThirdHighestSalary();
        salary.findSalary(salaryArr);

    }
}
