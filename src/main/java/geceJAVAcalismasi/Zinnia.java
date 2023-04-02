package geceJAVAcalismasi;

import java.util.Arrays;

public class Zinnia {

    public static void main(String[] args) {

        String s = "The Promise of Web3 Mava Tie suchis new pThe";
        String words [] = s.split(" ");


        for (String w: words) {

            if(w.toLowerCase().contains("c")){
                System.out.println(w);
            }


        }





    }//main
}//class
