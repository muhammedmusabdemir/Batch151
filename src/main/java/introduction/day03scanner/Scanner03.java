package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");
        //next() methodu kullanicidan tek kelimeli String'i almak icin kullanilir
        //nextLine() methodu ise kullanicidan cok kelimeli String'i almak icin kullanilir

        String address = input.nextLine();

        System.out.println(address);





    }

}
