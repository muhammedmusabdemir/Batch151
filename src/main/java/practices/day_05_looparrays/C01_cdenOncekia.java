package practices.day_05_looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {

    /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
      'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz");
        String str = input.next().toLowerCase();

        int counter = 0; //default deger + ve - islemlerinde sifirdir. * ve / icin default deger ==> 1    String datalar icin "";
//1.Yol
        for (int i = 0; i < str.indexOf("c"); i++) {

            if(str.charAt(i)=='a'){
                counter++;
            }

        }
        System.out.println("c'den once " + counter + " a vardir");

//2.Yol
        int sayac = 0;

        if (str.contains("c") && str.contains("a")){

            for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i)=='a'){

                    sayac++;

                }else if (str.charAt(i)=='c'){

                    break;
                }
            }
            System.out.println("C'den onceki a sayisi " + sayac);

        }else{
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");
        }




    }//main

}//class
