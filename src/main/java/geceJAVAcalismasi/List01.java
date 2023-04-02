package geceJAVAcalismasi;

import java.util.ArrayList;
import java.util.List;


public class List01 {

    public static void main(String[] args) {

        //B!r l!stedek! ögeler!n azalan sırada olup olmadıgını kontrol ed!n!z.
        //Örnek: (Sarı, Mav!, Kırmızı, Yes!l) ==> Çıktı: Azalan sırada deg!l
        //(Sarı, Kırmızı, Yes!l, Mav!) ==> Çıktı: Azalan sıradadır


        List<String> list = new ArrayList<>();
        List<String> e = new ArrayList<>();
        list.add("Yellow");
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        int uzunluk = 0;

        for (int i = 0 ; i<list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).length()>list.get(j).length()){

                }else{
                    uzunluk=1;
                }
            }
        }






    }//main
}//class
