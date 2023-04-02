package javaders.day02printmethodcreation;

public class MethodCreation {

    public static void main(String[] args) {

        // static ==> protokol tribunu vip class

        //Karenin alanini veren kodu yaziniz
        kereninAlani(7);
        /*
        return type void oldugunda dondurdugu her hangi bir deger olmadigi icin
        sadece ekranda bastirdigi icin; ekleme cikarma ya da method kullanma vs.
        hic bir islem yapamayiz.
        Method sonucunda ortaya cikan datayi kullanamayiz. Sadece ekranda goruruz.
        TV ekraninda elmalari gorup elmali pasta yapamamiz gibi...
        */

        //Diktorgenin alanini veren kodu yaziniz
        System.out.println( "Diktortgenin Alani "+ (diktorgeninAlani(10, 20)+2));
        /*
        return type'i int oldugu icin bir deger dondurur.Ve bu degeri biz kullanabiliriz.
        Method kullanabiliriz.
        Ekleme cikarma carpma bolme istedigimiz gibi elde edilen datayi kullanabiliriz
        */

    }//main

    private static int diktorgeninAlani(int a, int b) {

        return a*b;//carpmanin sonucunu kullaniciya verdim
    }

    private static void kereninAlani(int a) {

        System.out.println("Karenin Alani :"+(a*a));//Karenin Alani :49
    }
}//class
