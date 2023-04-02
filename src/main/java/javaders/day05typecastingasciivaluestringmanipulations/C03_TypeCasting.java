package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {


        /*

        Numeric Data Type'larinin birbirine donusturulmesine Type Casting denir
        Numeric Data Type'lari byte<short<int<long<float<double

        Kucuk Date Type'larinin Buyuk Data Type'larina donusturlmesine
        "Auto Widening" (Otomatik Genisletme) denir ==> Kucuk Kutunun Buyuk Kutu icerisine yerlestirilmesi.

        Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
        Data kaybi olabilecegi icin kodu yazanlara birakir. Buna "Explicit Norrowing" (Aciktan Daraltma) denir.


         */

        byte age = 13;
        int ageInt= age; //Auto Widening ==> Otomatik Genisletme

        //long data type'inishort'a cevirelim
        long population =1234L;
        short populationShort = (short) population; //Explicit Norrowing ==> Aciktan Daraltma

        //int data type'inin float data type'ina ceviriniz
        int boy =170;
        float boyFloat = boy;

        //short data type'ini byte data type'ina cevirelim
        short numberShort = 115;
        byte numberByte = (byte) numberShort;




    }//main
}//class
