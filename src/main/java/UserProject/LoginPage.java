package UserProject;

import java.util.Scanner;

public class LoginPage extends UserService{

    public static void main(String[] args) {

        start();





    }//main

    public static void start () {

        Scanner input = new Scanner(System.in);
        int secenek;


        do {
            showMenu();
            secenek = input.nextInt();
            switch (secenek){
                case 1:

                    break;
                case 2:
                    //log in
                    break;
                case 3:
                    //OUT
                default:
                    System.out.println("Yanlis deger girdiniz lutfen tekrar deneyin");
            }

        }while (secenek!=0);


    }

    public static void showMenu() {
        System.out.println("TECHPRO EDUCATION");
        System.out.println("1-Sign Up");
        System.out.println("2-Log In");
        System.out.println("0-OUT");
        System.out.println("Seciminiz :");
    }



}//class
