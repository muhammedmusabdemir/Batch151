package javaders.day16arraysforeachloopDT;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi istedigi zaman durdurabilmesi icin gereken kodu yaziniz.
        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Coklu data'yi yerlestirmek icin bir array olusturmaliyim
            3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
            4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numOfElement = input.nextInt();

        String stdNames [] = new String[numOfElement];

        System.out.println("To stop adding press q");

        for(int i = 0; i < stdNames.length; i++){
            System.out.println("Enter the " + (i+1) + ". student name");
            String name = input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name;
            }

        }
        System.out.println(Arrays.toString(stdNames));


    }//main
}//class