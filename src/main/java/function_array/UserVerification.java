//6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: admin@123
package function_array;

import java.util.Scanner;

public class UserVerification {
    public void userLogin(){
        Scanner input = new Scanner(System.in);
        String dbUserName = "admin";
        String dbPassword = "admin@123";

        String username, password;

        int count = 0;

        while(count <= 3){
            System.out.println("Enter Username: ");
            username = input.nextLine();
            System.out.println("Enter Password: ");
            password = input.nextLine();

                if(dbUserName.equals(username) && dbPassword.equals(password)){
                   System.out.println("User login successful.");
                   break;
               } else if(dbUserName.equals(username) && !dbPassword.equals(password)){
                  count++;
                   if(count <= 3){
                       System.out.println("Username & Password does not match.");
                   } else {
                       System.out.println("Your user has been temporary locked.");
                       break;
                   }
               } else if(!dbUserName.equals(username) && !dbPassword.equals(password)){
                    count++;
                    if(count <= 3){
                        System.out.println("Username & Password does not match.");
                    } else {
                        System.out.println("Your user has been temporary locked.");
                        break;
                    }
                }

        }

    }
    public static void main(String[] args) {


        UserVerification user = new UserVerification();

        user.userLogin();
    }
}
