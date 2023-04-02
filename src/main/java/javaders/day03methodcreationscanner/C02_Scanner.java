package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        /*
        Kullanicidan data almak icin scanner classindan scan/input/scanner objesi olustururuz.
        Bu sekilde kullaniciyi yonlendirerek gerekli datalari elde ederiz.


         */

        /*

        // 1.Adim Obje olusturma

        Scanner input = new Scanner(System.in);//Nur hanim ==> input objesi

        //2.Adim kullnaciya ne yapacagini soyluyoruz

        System.out.println("Lutfen cinsiyetinizi giriniz K/E seklinde");
        //3.Adim kullanicidan alinan data yapisina buyuklugune uygun bir variable'nin icine yerlestirilir.
        char cinsiyet = input.next().charAt(0);

        //4.Adim Ekranda gorebilmek icin ve kullanicininda verdigi bilgileri teyiy edebilmesi icin yazdiriyoruz
        System.out.println("cinsiyet = " + cinsiyet);

         */


        //Kullaniciya cinsiyetini, adini, memleketini, yasini, boyunu, ulkesini sevip sevmedigini, maasini soran bir program yaziniz
        Scanner input2 = new Scanner(System.in);//input2 Gonul hanim
        System.out.println("Lutfen cinsiyetinizi giriniz Kadin ise K Erkek ise E harfi giriniz");//Gonul hanim yonlendirmeyi gordu
        char gender = input2.next().charAt(0);//gender == cinsiyet

        /*
        System.out.println("Lutfen adinizi giriniz");
        String isim = input2.next();//next tek kelime, nextLine birden fazla kelime
        */

        System.out.println("Lutfen adinizi giriniz");
        // String isim = input.next();
        input2.nextLine();//dummy atildi Satir atlamasi yapmamasi icin
        String name = input2.nextLine();//Tolgahan Metehan

        System.out.println("Lutfen nereli oldugunuzu giriniz");
        String memleket = input2.next();


        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input2.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy = input2.nextShort();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi yaziniz True / False olarak");
        boolean seviyorMu = input2.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz");
        long maas = input2.nextLong();

        System.out.println("*********************** Gonul Hanim ************************");
        System.out.println("gender : " + gender + "\nname = " + name + "\nmemleket : " + memleket + "\nyas : "

                + yas + "\nboy : " + boy + "\nseviyorMu : " + seviyorMu + "\nmaas : " + maas);


    }//main
}//class
