package javaders.day18constructorsstatickeyword;

     /*
        1) "static block"lar "static variable"lara "ilk degerini atamak" (initialize) icin kullanilir.
        2) "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
        3)"static" bir variable'a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama
          "static block" icine yazilan kod "main method" icine yazilan kod'dan once calistirilir.
        4) Bir class'da birden fazla static block varsa ustteki once calistirilir.
      */

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {

    //static variable'lar "static block" kullanilmadan da "initialize" edilbilirler.
    public static double pi = 3.14;

    //static variable'lar "static block" kullanilarak da "initialize" edilebilirler.
    //Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
    public static double price;

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }

    }

    static{
        System.out.println("Hey I am a static block 2");

    }

    static {
        System.out.println("Hey I am a static block");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }

    }









}//class
