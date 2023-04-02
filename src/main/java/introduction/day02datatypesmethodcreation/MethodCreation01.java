package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    javada method nasil olusturulur

    1)main method'un disinda olsuturulur class'in icinde olusturulur
    2)Access Modifier + return type + Method ismi + () + {}

    Olusturulan methodlar nasil kullanilir?
    1)main method'un icinden kullanılır
    2)methodun ismi + () yazin
    3)islem yapacaginiz parametreler parantezin icine koyulur
    ==>main method static oldugu icin main method icerisinde kullanacaginiz her sey static olmalidir.
     */
    public static void main(String[] args) {

      int sonuc =  toplamaYap(30,60);
       System.out.println(sonuc);

       long carpmaSonuc = multiply(3,5);
       System.out.println(carpmaSonuc);

       int sonuc2 = firstMultiplyThenPlus(5,7,8);
       System.out.println(sonuc2);

       double kup = usAlma(3.5);
       System.out.println(kup);

       print("Hello World");

    }
    //Ornek1:toplama islemi yapan bir method olusturunuz.
    public static int toplamaYap (int a, int b){
       return a+b;
    }

    //Ornek2: 2 sayiyi carpma islemi yapan bir method olsuturunuz.
    protected static int multiply (int a, int b){
        return a*b;
    }

    //Ornek 3: Verilen 3 sayidan ilk ikisini çarpan ve sonuncu sayi ile toplayan bir method olusturunuz.
    private static int firstMultiplyThenPlus (int a, int b, int c) {
        return ((a*b)+c);
    }
    //Ornek 4: Verilen bir ondalık sayinin kupunu hesaplayan method olusturup kullaniniz.
    //Note: Access Modifier'i default yapmak isterseniz access modifier yazmayınız. bos birakiniz.
    static double usAlma (double d){
        return d*d*d;
    };

    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    //return type void oldugunda return keyword kullanilmaz
    private static void print(String str){
        System.out.println(str);
    }




}
