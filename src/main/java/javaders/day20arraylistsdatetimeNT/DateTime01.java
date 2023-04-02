package javaders.day20arraylistsdatetimeNT;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //Icinde bulundugumuz zamna dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate); //2023-03-15

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue); //3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue); //2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue); //15

        //Asagidaki "Month" bir Enum'dir.
        //Enum, Java'da sabit degerleri(Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri, Samanyolu galaksisindeki gezegen isimleri)
        //depolamak icin kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName); //MARCH

        //Asagidaki "DayOfWeek" bir Enum'dir.
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName); //WEDNESDAY

        //Ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4)); //2027-05-20

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18)); //1992-12-28

        //Specific bir tarih objesi nasil olusturulur?
        LocalDate gokhanDob = LocalDate.of(1986,6,10);
        LocalDate fatihDob = LocalDate.of(1985,2,25);

        //Bir tarih'in bir tarih'ten sonra olup olmadigi nasil kontrol edilir?
        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println(r1); //true

        //Bir tarih'in bir tarih'ten once olup olmadigi nasil kontrol edilir?
        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2); //true

        //Bir tarih'in bir tarih'e esit olup olmadigi nasil kontrol edilir?
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3); //false

        //Example 1: Kullanicaidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicaidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }


        int lenghtOfMoth = myCurrentDate.lengthOfMonth();
        System.out.println(lenghtOfMoth); //31

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year, month and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek());




    }//main

}//class
