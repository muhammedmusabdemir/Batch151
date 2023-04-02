package practices.day_06_practice_DT;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("1-4 Arasi Islem Numaranizi Giriniz" + "\n" +
                "Islem 1: Bakiye Sorgulama" + "\n" +
                "Islem 2: Para Cekme" + "\n" +
                "Islem 3: Para Yatırma" + "\n" +
                "Islem 4: İşlemi Sonlandır");
        int islemNo = scan.nextInt();

        int bakiye = 1000;

        switch (islemNo){

            case 1: // Bakiye Sorgulama
                System.out.println("Bakiyeniz: " + bakiye + "TL");
                break;


            case 2: // Para Cekme
                System.out.println("Cekmek Istediginiz Parayi Giriniz");
                int cekilcekPara = scan.nextInt();

                if(cekilcekPara <= bakiye){
                    bakiye = bakiye-cekilcekPara;
                    System.out.println("Para Cekme Isleminden Sonraki Mevcut Bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("Bakiyeniz Yetersiz");
                }
                break;


            case 3: // Para Yatirma
                System.out.println("Yatirmak Istediginiz Parayi Giriniz");
                int yatirilacakPara = scan.nextInt();

                if(yatirilacakPara <= 2000){
                    bakiye = bakiye + yatirilacakPara;
                    System.out.println("Para Yatirma Isleminden Sonraki Mevcut Bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("ATM'de Gunluk Para Yatirma Limiti 2000TL");
                }
                break;


            case 4: // Islemi Sonlandir
                System.out.println("Techpro Bank'i Kullandiginiz Icin Tesekkur Ederiz");
                break;


            default:
                System.out.println("Gecerli Bir Numara Giriniz");



        }





    }//main

}//class
