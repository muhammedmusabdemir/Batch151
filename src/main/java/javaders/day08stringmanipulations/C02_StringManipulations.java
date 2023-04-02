package javaders.day08stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {
        
        //*********************** replaceFirst() ************************\\
        
        /*
        replace() ile ayni isi yapiyor ancak ilk gordugu datayi degistiriyor

         */
        
        String str = "Hayirli Olsunda ";
        
        //Ex : str Stirng'indeki ilk gorunen "a" harfini "e" harfi ile degistiriniz
        
        String str1 = str.replaceFirst("a","e");
        System.out.println("str1 = " + str1); //Heyirli Olsunda

        //***********************    trim()    ***********************\\

        /*
        trim() bir String'deki basinda ve sonundaki space karakterlerini siler
        Aradaki spacelere dokunmaz. Saclar icin uclarindaki kiriklarain aldirilmasi gibi
        Cumledi spacelerin silinmesi

         */

        //Ex : str Stringindeki bas ve sonda vars space karakterlerini siliniz

        String str2 = "       Ali Can   ";
        System.out.print("*********");
        System.out.print(str2);
        System.out.println("*********");
        
        String strTrim = str2.trim();
        System.out.print("*********");
        System.out.print(strTrim);
        System.out.println("*********");
        
        //Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = 599.99$             String laptop = 299.99$
        String tv = "599.99$";
        String laptop = "299.99$";
        
        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2); //tv2 = "599.99"
        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2); //laptop2 = "299.99"

        System.out.println(tv2+laptop2); //599.99299.99 //Burada datalar String oldugu icin concatination yapti
        
        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        /*
        valueof() methodu String olan datayi bize sayi haline getirir
         */
        System.out.println("totalPrice = " + totalPrice); //totalPrice = 899.98


        //Ex : Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz

        String tamIsim = "     mehmet fatih    "; //==> MF
        char first = tamIsim.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first); //M

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second = " + second); //F

        System.out.println("Ilk Harf Son Harf : " + first + second);


        String tamIsim2 = "     mehmet fatih yildirim    ";
        char first1 = tamIsim2.trim().toUpperCase().charAt(0);
        System.out.println("first1 = " + first1);

        char second2 = tamIsim2.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second2 = " + second2);

        char third3 = tamIsim2.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println("third3 = " + third3);

        System.out.println("Ilk Harf  Orta Harf Son Harf : " + first1 + second2 + third3);





        
        
        
        
        

        
        
        
    }//main
}//class
