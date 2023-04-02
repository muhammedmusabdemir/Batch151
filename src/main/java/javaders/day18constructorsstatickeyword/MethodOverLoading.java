package javaders.day18constructorsstatickeyword;

public class MethodOverLoading {

    /*
           1)Bir method "ayni isim" ve "farkli parametre"lerle olusturlursa buna "Method Overloading" denir.
           2)"Method Overloading" Java da "iyi organizasyon" icin onemlidir.
           3)"Method Overloading" yaparken parametre 3 sekilde degistirilebilir
                  i)Parametrelerin sayilari degistirilebilir
                 ii)Parametrelerin data type'larini degistirebilirsiniz.
                iii)Parametrelerin data type'leri farkli ise yerleri degistirilebilir.
           4)"Method Overloading" bir klasin icinde olusur. Bu yuzden "private" method'lar da overload edilebilir.
             "Method Overloading" butun access modifier'larda kullanilabilir.
           5)"static" method'lar "overloading" edilebilirle.
         */

    public static void main(String[] args) {

       add(3,5);

    }//main

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a, int b){
        return a+b;
    }

    public static double add(int a, double b){
        return a+b;
    }





}//class
