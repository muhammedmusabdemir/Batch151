package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar
        //ii) Cevresini hesaplayiiz ==> 2 * ( Kisa kenar + Uzun kenar)

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen Diktorgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        double alan = shortSide*longSide;
        System.out.println("Alan = " +alan); //tavsiye edilen

        System.out.println("Cevre = " +(2 * (shortSide + longSide)));



    }
}
