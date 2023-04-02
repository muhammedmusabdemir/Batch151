package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // If it rains; I will cancel the picnic.
        // Eger yagmur yagarsa; piknigi iptal edecegim

        // Ex: Verilen bir karakterin buyuk harf ise ekarana "Buyuk Harf" yazdiran kodu yaziniz

        char ch = 'G';

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        // Ex: Verilen sayı cift sayi ise ekrana "Cift Sayi" yazan kodu yaziniz

        byte sayi = -8;

        /*
        Karsilastirma Operatorleri : == Esit mi?   != Esit Degil mi?   >= Buyuk Esit   <= Kucuk Esit
         */

        //Kodun dinamik olarak yazilmasi icin variable'in ismi yazilir.
        //Direk deger yazilirsa hurd coding yani tek datalik kod olur

        if(sayi %2 == 0){
            System.out.println("Cift Sayi");
        }

        // Ex: Verilen bir sayi 300'den kuyuk veya 1200'den bucuk ise "Harika Sayi" yazdiran kodu yaziniz

        int number = 299;

        if(number<300 || number>1200){
            System.out.println("Harika Sayi");
        }

        // Ex: Kullanicidan alinan Datanin Tek mi; Cift mi? oldugunu yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi3 = input.nextInt();
        if(sayi3 %2 == 0){
            System.out.println("Sayi Cifttir");
        }
        if(sayi3 %2 != 0){
            System.out.println("Sayi Tektir");
        }

        // 2.yol If Else  //Eger num icerisindeki datanin 2 ye bolumunden kalan 0'a esitse "Cift Sayidir" yazdirir
        if(sayi3 %2 == 0){
            System.out.println("Cift Sayidir");
        }else {           //else = degilse demektir. Geriye kalan tum ihtimaller icin burasi calisir
            System.out.println("Tek Sayidir");
        }

        // Ex: Verilen bir sayinin negatif mi, pozitif mi, notr mu oldugunu soyleyen kodu yaziniz

        int numara = 7;

        if(numara<0){
            System.out.println("3'lu Kontrol Negatif Sayi");
        }else if(numara == 0){
            System.out.println("3'lu Kontrol Notr Sayi");
        }else{
            System.out.println("3'lu Kontrol Pozitif Sayi");
        }










    }//main
}//class
