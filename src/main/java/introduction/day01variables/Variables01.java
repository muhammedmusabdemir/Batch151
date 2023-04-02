package introduction.day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskasina aciklamadir
        /*
         *java bu satirlari da okumaz
         */

        //variable olusturmak
        //data type + variable name + atama operatoru + data + noktali virgul
        int age = 13;


        /*java cumlesi = Statement
         *java'da "=" assigment operator. Sagdaki degeri alir soldaki kutya koyar.
         * java'da esittir demek "==", Matematikte "=" ==> java'da "=="
         * Eger variable declaration yapar, assignment yapmazsaniz java kendi Default degerlerini yukler
         * Default deger SAYILAR icin SIFIRDIR
         *
         * Data Type + variable name ==> Variable declaration
         * Assignment operator (atama operatoru) + variable degeri ==> Assignment
         */

            /*javada temelde iki tip data vardir
                1)primitive data type :
                char, boolean, byte, short, int, long, float, double
                2)non-primitive data type
                String
             */

        //Ornek 1 : Ogrenci ismi icin variable olusturunuz ve deger olarak Ali Can atayiniz
        //String'lere verilen degerler daima cift tirnak icinde olmalidir.

        String studentName = "Ali Can";

        //Stringler icin "default value" "null" dir
        //null demek sifir demek degildir. cünkü 0 da coding te bir degerdir.
        //null ici bos obje demektir
        // {}

        //char data type:
        //Tek karakterler icin kullanilir. ornegin ==> A, x, 5, ?
        //Ornek 2 : char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note: char data type'inda degerler tek tirnak icie konulmalidir
        char isminIlkHarfi = 'A';

        //boolean data type:
        //boolena lar iki farkli deger alabilirler true (dogru) veya false (yanlis)
        //Ornek 3: boolean data type'inda emekli misin surusu icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;

        //byte data type:
        //tam sayılar icindir. hafizada 1 byte yer kaplar
        //byte: -128 den +127 ye (dahil) kadar tamsayi degerleri icin kullanilabilir
        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve bir deger atayiniz
        byte studentAge = 23;

        //short data type:
        //tam sayilar icindir ve haifzada 2 byte yer kaplar
        //short : -32768 ile 32767 arasindaki tam sayilar icin kullanilir
        short okuldakiOgrenciSayisi = 1300;

        //int data type:
        //tam sayilar icindir. hafizada 4 byte yer kaplar
        //int : -2,147,483,648 ile 2,147,483,647 arasındaki sayilar icindir
        //Ornek 5:ulke nufusu icin bir variable olusturunuz ve deger atamasi yapiniz.
        int countryPopulation = 1500000;

        //long data type:
        //tam sayılar icindir hafizada 8 byte yer kaplar
        //long :-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        //Ornek 6: Insan vucundaki hucre sayısı icin variable olsuturup deger atamasi yapiniz
        //Note:Bir deger long ise sonuna 'L' (tercih edilir) yada 'l' konulur.
        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna 'L' koymaya gerek yok
        //Long dememize ragmen sonuna eger L koymazsak java onu int araliginda ise int olarak kabul eder
        long cellNumberInHumanBody = 412374912091L;
        long weight = 31726378126L;//int'lerin araliginda ise sonuna 'L' koymaya gerek yok

        //float data type
        //float virgullu sayilar (Decimal numbers ==> ondalikli sayilar) icin kullanilir
        //fiyatlandirmalar icin tercih edilir (12.99)
        //Ornek 7: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyatı ekrana yazdiriniz.
        //Note: java ondalikli sayilari yani "Decimal Numbers" i otomatik olarak "double" kabul eder
        //      siz data type'ini float yazarsaniz hata verir.
        //      float olmasinda israr ediyorsaniz sonuna "F" yada "f" koymalisiniz
        //      float memory de 4 byte yer kaplar, double 8 byte yer kaplar

        float gomlekFiyati = 12.99F;
        float ayakkabiFiyati = 15.99F;

        System.out.println(gomlekFiyati + ayakkabiFiyati);


        //     System.out.println(); kodu parantez icine yazdiklarimizi ekrana yazdirir.
        int a = 12;
        int b = 13;
        System.out.println(a+b);
        //System.out.println(); ekrana yazdirir ve "pointer" i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve "pointer" i ayni satirda tutar.
        int c = 313;
        int d = 314;
        System.out.print(c);
        System.out.print(d);

        //double data type:
        //double memory de daha fazla yer kaplar, ama virgulden sonraki rakam daha fazla alir
        //double virgullu sayilar (Decimal numbers ==> ondalikli sayilar) icin kullanilir
        //Ornek 8: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturunuz ve agirliklari farkini ekrana yazdiriniz
        double weightCell = 0.0000000000000112;
        double weightAmip = 0.0000000000000023;
        //System.out.println(); yazdirmanin kisa yolu sout yazin enter a basin
        System.out.println(weightCell - weightAmip);



    }


}
