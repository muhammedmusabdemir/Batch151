package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");

        int number = input.nextInt();
        //bir sayinin son rakamini alabilmek icin 10'a bolup kalani almaliyiz
        //% ==> modulus operator ; solunda bulunan sayinin saginda bulunan sayinin bolumundan kalani verir
        //dolayisiyle %10 her zaman birler basamaginda bulunan sayiyi verir.
        //bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle bir tam sayi yapar
        //java bu durumda yuvarlama yapmaz ondalikli kismi iptal eder
        //dolayisiyle bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz

        //son rakami al
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int secondDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println(lastDigit+secondDigit+lastFourthDigit+lastFifthDigit);





    }


}
