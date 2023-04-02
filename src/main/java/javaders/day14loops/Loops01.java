package javaders.day14loops;

import java.util.Scanner;

public class Loops01 {

    public static void main(String[] args) {

        //Kullanicidan alinan bir tam sayinin tekrarsiz rakamlarinin toplamini bulunuz
        //1838 ==> 1 + 3 = 4
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        String s = input.next();

        int sum = 0;

        for ( int i = 0 ; i < s.length() ; i++ ){
            String d = s.substring(i,i+1);
            if (s.indexOf(d) == s.lastIndexOf(d)){
                sum = sum + Integer.valueOf(d); //String ile int toplanmaz, bu yuzden Integer.valueOf() methodunu kullandik
            }
        }
        System.out.println(sum);

        //Bir String'deki tekrarli character'leri bir kere ekrana yazdiran kodu yaziniz
        //Alabala ==> la
        String t = "Alala";
        String result = "";
        for (int i = 0 ; i<t.length(); i++){

            char ch = t.charAt(i);

            if((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" + ch)){

                result = result + ch;
            }
        }
        System.out.println(result);





    }//main
}//class
