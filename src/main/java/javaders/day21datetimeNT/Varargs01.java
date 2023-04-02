package javaders.day21datetimeNT;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add(5,2,3,4)); //14
        System.out.println(add(5,2)); //7
        System.out.println(add(5)); //5
        System.out.println(add()); //0

        getInitials("Ali Can", "Kemal Han", "Tuncay Cinar", "Ibrahim Cata;");





    }//main
    //Toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli method'lar olsuturarak is yapamayiz.
    //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir, her ihtimal icin bir method olusturmak mumkun degildir.
//    public int add (int a, int b) {
//        return a+b;
//    }
//
//    public int add (int a, int b, int c) {
//        return a+b+c;
//    }
//
//    public int add (int a, int b, int c, int d) {
//        return a+b+c+d;
//    }

    //Java farki sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir

    /*
       1) Bir method parantezinde birden fazla "Varargs" kullanilamaz.
       2) Bir method parantezinde birden fazla parametre kullanilacaksa "Varargs" en sonda olmalidir.
     */

    public static int add(int... a){

        int sum =0;
        for (int w : a){
            sum = sum +w;
        }
        return sum;
    }

    // Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //            Ali Can ==> AC    Kemal Han ==> KH

    public static void getInitials(String... s){

        String initials = "";

        for (String w : s) {

            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);

            System.out.println(initials);
            initials = "";
        }

    }


}//class
