package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        
        String a = "Tek Rakibim Dunku Ben*.";
        
        // ***************** toUpperCase() ****************** \\
        
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper); //aUpper = TEK RAKİBİM DUNKU BEN .
        
        // ***************** toLowerCase() ******************* \\
        
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower); //aLower = tek rakibim dunku ben .

        // *****************     charAt()    ****************** \\

        System.out.println("a.charAt(0) = " + a.charAt(0)); //T
        System.out.println("a.charAt(10) = " + a.charAt(10)); //m

        //a Stringindeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.
        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(21);
        System.out.println("firstChar+lastSecondChar = "+firstChar+lastSecondChar);
        System.out.println(firstChar+" "+lastSecondChar);

        //Eger bu iki sekilde yazdirmazsan ascii degerini yazdirir


        // *****************    lenght()   ****************** \\
        // a String'inde bulunan karakter sayisini bulunuz.

        System.out.println(a.length()); //24


        // *****************   substring()  ****************** \\
        // a String'indeki ilk dort karakteri aliniz

        String sub1 = a.substring(0,4); //0 dahil 4 haric [0,4) ==> 0.index, 1.index, 2.index, 3.index
        //4.indexten itibaren alinmaz

        System.out.println("sub1 = " + sub1); //Tek
        
        //a String'indeki 4.index dahil 7.index haric
        String sub2 = a.substring(4,7);
        System.out.println("sub2 = " + sub2); //Rak
        
        //a String'indeki "Rakib" kelimesini aliniz
        String sub3 = a.substring(4,9);
        System.out.println("sub3 = " + sub3); //Rakib


        System.out.println(a.substring(10)); //m Dunku Ben*.


        // *****************   contains()  ****************** \\
        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz

        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi); //true


        // *****************  startsWith() ****************** \\

        //a String'inin "T" harfi ile baslayip baslamadigini kontrol ediniz

        System.out.println(a.startsWith("T")); //true
        System.out.println(a.startsWith("Rak", 4)); //true
        // ilk 4 karakteri at sonrasi "Rak" kelimesiyle basliyor mu ?
        //prefix: baslangic , offset: at gitsin

        // Universite numaralari yil + bolumKodu + girisSirasi olarak duzenlenen bir okulda
        // ogrenci Umran'in hukuk fakultesinde okuyup okumadigini gosteren kodu yaziniz

        /*
        sinf 22 hukuk 33 bilgisayar 44 eczacilik 55 maliye 66 kimyaMuhendisligi 77 olsun
         */

        String str = "20105501";
        System.out.println(str.startsWith("33", 4)); //false


    }//main
}//class
