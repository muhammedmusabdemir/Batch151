package javaders.day07stringmanipulations;

public class C01_StringManipulations {
    
    public static void main(String[] args) {
        
        String s = "Learn Java earn money";


        //******************** endsith ******************\\
        
        /*
        endsWith() Metnin belirli bir datayla bitip bitmedigini verir.
                   Bize boolean bir sonuc dondurur
                   Tek karakter de coklu karakter de kullanılabilir.
        
         */

        //Ex: s String'inin "money" ile bitip bitmedigini kontol ediniz.  
        
        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd); //true


        //******************** replace ******************\\

        /*
       replace() Metnin icerisindeki belirli bir datanin yerine verilen diger bir datayi yerlestirir
                 String bir data dondurur
                 tekli karakterler ile de coklu karakterler ile de calisir
                 Ancak her iki tarafda da "" ya da her iki tarafda da '' kullanilmalidir.

         */
        
        //Ex: s String'indeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz
        
        String s1 = s.replace("money","dolar");
        System.out.println("s1 = " + s1); //Learn Java earn dolar


        //Ex: s String'indeki "earn" kelimesini "win" kelimesine ceviriniz

        String s2 = s.replace("earn","win");
        System.out.println("s2 = " + s2); //Lwin Java win money
        
        //Ex: s String'indeki "a" harflerini "*" ile degistiriniz

        String s3 = s.replace("a","*"); 
        String s4 = s.replace('a','*'); 

        System.out.println("s3 = " + s3); //Le*rn J*v* e*rn money
        System.out.println("s4 = " + s4); //Le*rn J*v* e*rn money

        //Ex: s String'indeki "n" harflerini "***" ile degistiriniz
        
        String s5 = s.replace("n","***");
        System.out.println("s5 = " + s5); //Lear*** Java ear*** mo***ey

        //Ex: s String'indeki tum "e" harflerini siliniz

        String s6 = s.replace("e","");
        //String s7 = s.replace('e','');
        System.out.println("s6 = " + s6); //Larn Java arn mony
        /*
        cahr data type'inin icerisine mutlaka bir karakter yerlestirilmelidir
        space bir karakterdir. char'in icine yerlestirilebilir. Ancak hiclik 
        javada char icin kullanilmaz. Bu nedenle silme islemi yaparken mutlaka
        String kullanmaliyiz
         */

        //******************** replaceALL ******************\\

        /*
        replaceAll() Bir grup datayi degistirmek icin kullanilir.
        Bir grup datayi ifade edebilmek icin Regular Expression (Regex) kullanilir.
         */



        String t = "Yucel 25 ya$indadir sandik ama 30'mis!.";
        
        //Ex: t String'indeki tum rakamlari "*"'a ceviriniz
        
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1); //Yucel ** ya$indadir sandik ama **'mis!.


        /*
        En cok Kullanilan Regexler
        1) Tum Rakamlar ==> [0-9]
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Buyuk Harfler ==> [A-Z]
        4) Tum Harfler ==> [a-zA-Z]
        5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tum Noktalama Isaretleri ==> \\p{Punct}
        7) Tum Sesli Harfeler ==> [aeiouAEIOU]


        ^ ==> den farkli, haricinde

        1) Tum Rakamlar Haric==> [^0-9]
        2) Tum Kucuk Harfler Haric ==> [^a-z]
        3) Tum Buyuk Harfler Haric ==> [^A-Z]
        4) Tum Harfler Haric ==> [^a-zA-Z]
        5) Tum Harfler ve Rakamlar Haric ==> [^a-zA-Z0-9]
        6) Tum Noktalama Isaretleri Haric ==> ^\\P{P} ***** ornekte var (day08 C01)
        7) Tum Sesli Harfeler Haric ==> [^aeiouAEIOU]

         */

        // Ex : t String'indeki tum harfleri ve tum rakamlari ! ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2 = " + t2);//t2 = !!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!.

        // Ex : t String'indeki tum space'ler disindaki karakterleri "+" 'ya donusturunuz.
        String t3 = t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3); //t3 = +++++ ++ ++++++++++ ++++++ +++ ++++++++

        // Ex : t String'deki tum kucuk harfler disindaki karakterleri "?" 'ne donusturunuz
        String t4 = t.replaceAll("[^a-z]","?");
        System.out.println("t4 = " + t4); //t4 = ?ucel????ya?indadir?sandik?ama????mis??
        
        // Ex : t String'indeki tum sesli harfler disindaki karakterleri & 'ne donusturunuz
        String t5 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5); //t5 = &u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&i&&&

        


        
        
        
        
        
        
        
        
        
        
        
        
        
    }//main
}//class
