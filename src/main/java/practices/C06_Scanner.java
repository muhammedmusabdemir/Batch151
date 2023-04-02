package practices;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi be Soyisminizi Giriniz");
        String isimSoyisim = scan.nextLine().toUpperCase();

        char isimIlkKarakter = isimSoyisim.charAt(0);

        char soyIsimIlkKarakter = isimSoyisim.charAt(isimSoyisim.indexOf(" ")+1);

        System.out.println("" + isimIlkKarakter + soyIsimIlkKarakter);









    }//main
}//class
