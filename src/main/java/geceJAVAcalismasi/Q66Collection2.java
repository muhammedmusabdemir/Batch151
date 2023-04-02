package geceJAVAcalismasi;

import java.util.ArrayList;
import java.util.List;

public class Q66Collection2 {

    public static void main(String[] args) {

        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

                Array List:  siyah,mavi,kirmizi,beyaz

        en başa: **pembe**

        mavi-kirmizi arasına **yesil**  renk eklenecek.

         */

        int index = 0;

        List<String> colour = new ArrayList<>(List.of("siyah", "mavi", "kirmizi", "beyaz"));
        colour.add(0,"pembe");
        colour.add(1,"kahverengi");
        colour.add(colour.indexOf("mavi")+1,("yesil"));
        System.out.println(colour);



    }//main
}//class
