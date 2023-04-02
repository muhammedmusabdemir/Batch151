package introduction.day01variables;

public class Variables01TEKRAR {

    public static void main(String[] args) {

        //variable olusturmak
        // data type + variable name + atama operatoru + noktali
        int age = 14;

        // = >> assignment operator

        /*
        Javada temelde iki data type vardir
          1) primitive data type: char, boolean, byte, short, int, long, float, double

          2) non-primitive data type: String
        */
        //String
        String studentName = "Ali Can";

        //Char
        //Tek character'ler icin kullanilir
        char isminIlkHarfi = 'A';

        //boolean
        //iki farkli deger alabilir: true and false
        boolean emekliMisin = false ;

        //byte
        //tam sayilar icindir, hafizada 1 byte yer kaplar, -128 ile 127 arasinda deger alabilir
        byte studenAge = 23;

        //short
        //tam sayilar icindir, hafizada 2 byte yer kaplar, -32768 ile 32767 arasinda deger alabilir
        short okuldakiOgrenciSayisi = 1300;

        //int
        //tam sayilar icindir, hafizada 4 byte yer kaplar, -2,147,483,648 ile 2,147,483,647 arasinda deger alabilir
        int countryPopulation = 1500000;

        //long
        //tam sayilar icindir, hafizada 8 byte yer kaplar, -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasinda deger alabilir
        long cellNumberInHumanBody = 412374912091L;
        long weight = 31726378126L; // int'lerin araliginda ise sonuna 'L' koymaya gerek yok

        //float
        //virgullu sayilar icindir, 4 byte yer kaplar, kullannirken oncelik double'dir, eger float olmasinda israr ediyorsan sonuna "f" veya "F" koymalisin
        float gomlekFiyati = 12.99F;

        //double
        //virgullu sayilar icindir, 8 byte yer kaplar, kullanirken onceliklidir, daha fazla yer kaplar fakar virgulden sonra daha fazla basamak alir
        double weightCell = 0.0000000000000112;





    }//main
}//class
