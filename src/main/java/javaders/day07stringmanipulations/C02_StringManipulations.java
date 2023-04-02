package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {

    public static void main(String[] args) {

        /*
        Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

                   i) En az 8 karakterden olussun
                  ii) Password space icermesin
                 iii) En az 1 tane buyuk harf olsun
                  iv) En az 1 tane kucuk harf olsun
                   v) En az 1 tane sembol olsun
                  vi) En az 1 tane de rakam olsun

              Pozitif Seneryo ==> Ac123?d.    true
              Negatif Seneryo ==> Ac123? sd   false

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...." +
                "  i) En az 8 karakterden olussun\n" +
                " ii) Password space icermesin\n" +
                "iii) En az 1 tane buyuk harf olsun\n" +
                " iv) En az 1 tane kucuk harf olsun\n" +
                "  v) En az 1 tane sembol olsun\n" +
                " vi) En az 1 tane de rakam olsun");

        String pwd = input.nextLine();


        //i) En az 8 karakterden olussun
        boolean krktrSys = pwd.length()>7;
        // boolean krktrSys2 = pwd.length()>=8; Makbul olani >7 dir. Cunku javaya daha az is yaptirilir


        //ii) Password space icermesin
        boolean spaceOlmamali = !pwd.contains(" ");
        // contains " " == space karakteri icersin   ! == icermesin


        //iii) En az 1 tane buyuk harf olsun

        boolean bykHrfOlmali = pwd.replaceAll("[^A-Z]","").length()>0;

        //Methodlari ayni satirda yan yana yazabiliriz. Buna method chain (method zinciri) denir.


        //iv) En az 1 tane kucuk harf olsun
        boolean kckHarfOlmali = pwd.replaceAll("[^a-z]","").length()>0;

        //v) En az 1 tane sembol olsun (tum harfler ve tum rakamlar disindaki hersey)
        boolean sembolOlmali = pwd.replaceAll("[a-zA-z0-9]","").length()>0;

        //vi) En az bir tane de rakam olsun
        boolean rakamOlmali = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("Password Gecerli Mi : "+(krktrSys && spaceOlmamali
                && bykHrfOlmali && kckHarfOlmali && sembolOlmali && rakamOlmali));





    }//main
}//class
