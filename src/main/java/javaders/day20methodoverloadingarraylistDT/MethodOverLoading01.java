package javaders.day20methodoverloadingarraylistDT;

public class MethodOverLoading01 {

    public static void main(String[] args) {

        String s = "Java";
        //1) Method Overloading ne demek?
        // Ayni isimde farkli isler yapabilen methodlar olsuturmak demek
        //2) Ne icin var?
        // Daha derli toplu bir yapi olsun diye, her parametreye gore yeni method olusturmamak adina var
        //Ornek substring methodu a) tek parametre b) iki parametre


        add(3,5);

        /*
          1) Method Overloading yaparken method ismi degistirilmez
          2) Method Overloading yaparken parametreler degistirilir
              i) Parametre degistirirken, parametrelerin data type'lari degistirilebilir
              ii) Parametre degistirirken, parametrelerin data type'lari farkli ise yerleri degistirilebilir
              iii) Parametre degistirirken, parametrelerin sayisi degistirlebilir
          3) Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
             Bu yuzden ismi ve parametre ==> "method signature" olarak adlandirilir
          4) Method Overloading olustururken return type'i degistirmenin hic bir etkisi yoktur
             Method Overloading olustururken access modifier'i degistirmenin hic bir etkisi yoktur
             Method Overloading olustururken method'u static veya non-static yapmanin hic bir etkisi yoktur
             Method Overloading olustururken method body'i degistirmenin hic bir etkisi yoktur
          5) "private" method'lar overload edilebilir. Cunku method overloading sadce bir class'in icinde olur
             "private" olmak ise baska class'lara gidildiginde problem olusturur
          6) "static" method'lar overload edilebilirler

         */

    }//main

    public static void add (int a, int b) {
        System.out.println(a+b);
    }

    public static void add (double a, double b) {
        System.out.println(a+b);
    }

    public static void add (double a, int b) {
        System.out.println(a+b);
    }

    public static void add (int a, double b) {
        System.out.println(a+b);
    }

    public static void add (int a, int b, int c) {
        System.out.println(a+b);
    }


}//class
