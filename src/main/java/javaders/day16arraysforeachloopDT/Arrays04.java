package javaders.day16arraysforeachloopDT;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        //ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length); //7


        //ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz
        s.replaceAll("[^a-zA-Z]","").split("");




    }//main
}//class
