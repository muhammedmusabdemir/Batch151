package geceJAVAcalismasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TimeSorusu {

    /* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN  : **** **** **** 1478
  */

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        List<String> surName = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Isim giriniz");
        String isim = scan.next().toUpperCase();

        System.out.println("Soyisim giriniz");
        String soyIsim = scan.next().toUpperCase();

        System.out.println("Kart no giriniz");
        String kartNo = scan.next();

        /*
        if (kartNo.length() != 16){
            System.out.println("invalid credit card number");
        }
        System.out.print(isim.substring(0,1) + isim.substring(1).replaceAll("[A-Za-z0-9]","*"));
        System.out.println(" " + soyIsim.substring(0,1) + soyIsim.substring(1).replaceAll("[A-Za-z0-9]","*"));
        System.out.println(kartNo.substring(0,4).replaceAll("[A-Za-z0-9]","*") +" "+ kartNo.substring(5,9).replaceAll("[A-Za-z0-9]","*") +" "+ kartNo.substring(9,12).replaceAll("[A-Za-z0-9]","*") +" "+ kartNo.substring(12));

        */


        name.add(Arrays.toString(isim.split(" ")));
        name.add(soyIsim);

        if (name.size() > 0 && name.size() == 1)

        for (int i = 0; i< name.size(); i++){

            System.out.print(name.get(0).charAt(0) + name.get(0).substring(1).replaceAll("[A-Za-z0-9]",""));

            int bosluk = name.indexOf(" ");



        }




    }//main

}//class
