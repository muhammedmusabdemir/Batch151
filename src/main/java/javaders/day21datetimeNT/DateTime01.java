package javaders.day21datetimeNT;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //Anlik zamani nasil alariz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //21:04:37.533508700

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour); //21

        int minute = myCurrentTime.getMinute();
        System.out.println(minute); //6

        int second = myCurrentTime.getSecond();
        System.out.println(second); //32

        int nano = myCurrentTime.getNano();
        System.out.println(nano); //237519200

        //Gelecek ve gecmis zamana nasil gidilir
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formati nasil nasil degistirlir?
        //"HH" 24'luk saat sisteminde, "hh" 12'lik saat sisteminde kullanilir.
        //"hh:mm a" ifadesindeki " a" 12'lik saat sisteminde "AM", "PM" yazilmasini saglar
        //"ss" saniyeyi gosterir.
        //"mm" "minute" demektir. "MM" "month" demketir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime); //21:20

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate); //2022-08-25

        //Tarihi Ay/Gun/Yil sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate); // 08/25/2022

        //Tarihi Gun/Ay isminin ilkk 3 harfi/Yil sekline ceviriniz. 25/Aug/22
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2); //25/Aug/22

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3); //25/August/2022

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2023-03-17

        //Tashkent'de ayin kaci?
        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent); //2023-03-16

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); //03:46:45.607946800

        //Berlin'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin); //19:49:11.090911900








    }//main

}//class
