package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    /*
       1)Application'larda "data" ile bu "data"lari isleyen kod'lar (Logic) birbirinden ayrilir.
       Yani; logic data'ya bagimli olmamalidir.
       data'ya bagimli olarak yazilan kodlara "hard code" denir.
       "hard code" hatalı kod demektir.

       Asagidaki grades array'inde son elemani almak icin "4" veya "grades.lenght-1" kullanilabilir.
       "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.lenght-1"
       kullanirsaniz hep dogru sonucu alirsiniz
     */

    public static void main(String[] args) {

        //Array'leri kisa yoldan nasil olusturabiliriz?
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades)); //[67, 98, 100, 34, 76]

        //Example 1: grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz
        Arrays.sort(grades);  //sort methodu elemanlari kucukten buyuge siralar
        System.out.println(Arrays.toString(grades)); //[34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]); //134

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleri console'a yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w : stdNames) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimlerden onceki isimleri console'a yazdiriniz

        String stdNames2[] = new String[5];
        stdNames2[0] = "Ajda";
        stdNames2[3] = "Cuneyt";
        stdNames2[2] = "Tom";
        stdNames2[1] = "Ayhan";
        stdNames2[4] = "Filiz";

        Arrays.sort(stdNames2);  // [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames2) {
            if (w.startsWith("F")) {
                break;
            }
            System.out.println(w);
        }


        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimlerden onceki isimleri ve F ile baslayanlari console'a yazdiriniz

        Arrays.sort(stdNames2);  // [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames2) {

            System.out.println(w);

            if (w.startsWith("F")) {
                break;
            }
        }

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames2);  //sort methodu numeric data'lari kucukten buyuge(ascending) dizer,
                                 //String'leri ise alfabetik sirada(alphabetically) dizer
                                 //ascending + alphabetically ==> Natural Order

        for(String w : stdNames2) {

            if (w.startsWith("F")) {
                continue;
            }else{
                System.out.println(w);
            }
        }











    }//main
}//class
