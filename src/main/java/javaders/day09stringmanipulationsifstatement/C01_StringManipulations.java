package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {
        
        //Ex: Bir string'in hic karakter icerip icermedigi kontrol eden kodu yaziniz
        
        String str =" "; //hiclik
        
        //1.yol
        boolean result1 = str.length()==0; //Javaya 2 islem yaptirdim 1. lenght() kullandim 2. ==0 kullandim
        System.out.println("String bos mu = " + result1); //true

        //2.yol
        //*************************** isEmpty() **************************\\

        /*
        isEmpty methodu String datanin icerisinde hicbir sey yoksa True dondurur
        Java da space de bir karakter oldugu icin space varsa False dondurur
         */

        boolean result2 = str.isEmpty();
        System.out.println("String Bos mu = " + result2); //true

        //Ex: Bir String datanin space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz

        String t = " ";
        
        //1.Yol
        boolean result3 = t.replace(" ","").length()==0; //javaya 3 islem yaptirdik
        System.out.println("result3 = " + result3); //true
        
        //2.Yol
        boolean result4 = t.replace(" ","").isEmpty(); //javaya 2 islem yaptirdik
        System.out.println("result4 = " + result4);
        
        //3.yol
        //*********************** isBlank ***************************\\
        
        /*
        isBlank() methodu ==> space+hiclik ise True dondurur
        String bir datanin bos mu dolu mu olduguna bakar 
        isEmpty den farki space varsa yine True dondurur
         */
        
        boolean result5 = t.isBlank(); //javaya 1 islem yaptirdik
        System.out.println("result5 = " + result5); //true


        //************************ indexOf() **************************\\

        /*
        indexOf() verilen karakter ya da karakterlerin ilk gorunumunun indexini verir
                  int deger dondurur
                  Coklu data icin kullanildiginda ilk gordugu datanin ilk karakterinin indexini verir
                  Olmayan bir karakterin indexi sorulursa bize -1 dondurur
         */

        //Ex: Bir String'de a,i,e karkaterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz

        String s = "Java is easy"; //1 + 5 + 8 = 14 ?
        int aIdx = s.indexOf('a');
        System.out.println("aIdx = " + aIdx); //aIdx = 1

        int iIdx = s.indexOf('i');
        System.out.println("iIdx = " + iIdx); //iIdx = 5

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx); //eIdx = 8

        System.out.println("indexler Toplami :" + (aIdx + iIdx + eIdx)); //indexler Toplami :14


        int pIdx = s.indexOf('p'); //olmayan karakter sorgulanirsa -1 dondurur
        System.out.println("pIdx = " + pIdx); //pIdx = -1

        String s2 = "Java is easy to learn to easy to";
        int idx = s2.indexOf("to"); //ilk gordugu kelimenin ilk karakterinin indexini yazdırır
        System.out.println("idx = " + idx); //13

        //Ex: Bir String'de "Java" kelimesinin ilk olarak kacinci indexde oldugunu gosteren
        //    kodu yaziniz

        String cumle = "Ah Java vah Java sen ne guzel seysin Java";

        int indexJava = cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava); //indexJava = 3
        
        int indexQYX = cumle.indexOf("QYX");
        System.out.println("indexQYX = " + indexQYX); //indexQYX = -1


        //*********************** lastIndexOf() **********************\\

        /*
        lastIndexOf() Verilen String bir datada istenilen degerin son gorunumun indexini verir.
        Olmayan bir karakter sorgulanirsa -1 dondurur
         */

        //Ex: Bir String'de a,i,e karkaterlerinin son gorunumunun indexleri toplamini ekrana yazdiriniz

        String c = "Java is easy to learn";

        int aLast = c.lastIndexOf('a');
        System.out.println("aLast = " + aLast); //aLast = 18

        int iLast = c.lastIndexOf('i');
        System.out.println("iLast = " + iLast); //iLast = 5

        int eLast = c.lastIndexOf('e');
        System.out.println("eLast = " + eLast); //eLast = 17

        System.out.println("indexler Toplami :" + (aLast + iLast + eLast)); //indexler Toplami :40











        
        
        
        
    }//main
}//class
