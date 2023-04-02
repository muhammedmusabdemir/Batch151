package UserProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService implements Zorunlu{

    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    List<String> usernames = new ArrayList<>();


    @Override
    public void signUp() {
        Scanner input = new Scanner(System.in);

        // 1)Name-Surname:
        System.out.println("Name-Surname: ");
        String name = input.nextLine();

        // 2)Username:
        String username;
        boolean existUsername;


        do {
            System.out.println("Enter username: ");
            username = input.next();
            existUsername = usernames.contains(username);
            if (existUsername){
                System.out.println("username already used, please enter different username");
            }

        }while (existUsername);
        usernames.add(username);

        /*
           3) Email
           must contain @
           must be unique
         */

        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("Lutfen email adresinizi girin: ");
            email = input.next();
            existEmail = emails.contains(email);


            if (existEmail){
                System.out.println("Bu mail adresi daha once kullanildi, lutfen farkli bir email adresi deneyin.");
                isValid = false;
            }

        }while (existEmail);
        emails.add(email);


    }

    @Override
    public void logIn() {

    }

}

