package introduction.day02datatypesmethodcreation;

public class MethodCreation01TEKRAR {

    //  method nasil olusturulur
    // 1) main method'un disinda , class'in icinde olusturulur
    // 2) Access Modifier + return type + methodIsmi + () + {}

    //  Olusturulan method'lar nasil kullanilir
    // 1) main method'un icinden kullanilir
    // 2) methodun ismi + () yazin
    // 3) islem yapacaginiz parametreler parantezin icine koyulur
    //==> main method static oldugu icin main method icerisnde kullanilacak her sey static olmalidir

    public static void main(String[] args) {

        int dunBugun = toplamaYap(14,15);
        System.out.println(dunBugun); //29

        double gomlekPantolon = multiply(35.99,68.87);
        System.out.println(gomlekPantolon); //2478.6313000000005

        int borc = firstMultiplyThanPlus(78,32,90);
        System.out.println(borc); //2586

        double kuplereBin = kupAl(45.7);
        System.out.println(kuplereBin); //95443.99300000002

        ekranaYaz("Dikkats Etmeks Lazims"); //Dikkats Etmeks Lazims

    }//main

    //Ornek 1: toplama islemi yapan bir method olusturunuz
    public  static int toplamaYap (int a, int b) {
        return a+b;
    }

    //Ornek 2: carpma islemi yapan bir method olusturunuz
    private static double multiply (double a, double b) {
        return a*b;
    }

    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz
    protected static int firstMultiplyThanPlus (int a, int b, int c) {
        return((a*b)+c);
    }

    //Ornek 4: verilen bir sayinin kupunu alan method olusturunuz, access modifier'i default yapiniz
    //NOTE: access modifier'i default yapmak icin access modifier yazilmaz bos biraklir

    static double kupAl (double a){
        return a*a*a;
    }

    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran kodu bir method olusturunuz
    //NOTE: return tyoe void oldugunda return keyword kullanilmaz
    private static void ekranaYaz (String str) {
        System.out.println(str);
    }


}//class
