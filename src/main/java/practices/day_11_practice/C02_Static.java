package practices.day_11_practice;

public class C02_Static {

    static String okulIsmi = "Yildiz Koleji";

    static int okulNo;

    static boolean okulAcikMi;

    /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/

    public static void main(String[] args) {

        //static variable'lara class icerisindeki tum methodlardan direkt ulasabiliriz.

        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo); // 0
        System.out.println(okulAcikMi); // false

        /////////////////////////////////////////////////////////////

        //static variable'lar gokteki ay gibidir
        //static variablar'in degeri bir kisi tarafindan degistirilirse, herkes icin degisiklige ugrar

        okulNo=102;

        System.out.println(okulNo);  // 102

        staticMethod();

        System.out.println(okulNo); // 200




    }//main

    private static void staticMethod(){

        okulNo=200;

        System.out.println(okulNo); // 200

    }//method


}//class
