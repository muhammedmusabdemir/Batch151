package practices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q000 {
    public static void main(String[] args) {

       char ch = 'a';
       switch (ch){
           case 'a':
           case 'A':
               System.out.println(ch);
               break;
           case 'b':
           case 'B':
               System.out.println(ch);
               break;
           case 'c':
           case 'C':
               System.out.println(ch);
               break;
           case 'd':
           case 'D':
               System.out.println(ch);
               break;
       }

       int variable = 1;
       switch (variable){
           case 1 :
               System.out.print("P");

           case 2 :

           case 3 :
               System.out.print("Q");
               break;

           case 4 :
               System.out.print("R");
           default:
               System.out.print("S");


       }
        System.out.println();

       int i = 1;
       int j = 0;
       switch (i){
           case 2 :
               j += 6;
           case 4 :
               j += 1;
           case 1 :
               j += 4;
           default:
               j += 2;
       }
        System.out.println("j = " + j);

        System.out.println();

        String str ="Ayhan Beyhan";
        System.out.println(str.replace("h",""));

        String str1 = "Java ah java";
        System.out.println(str.contains("x"));

        String str3 = "ali";
        String str4 = "Ali";
        System.out.println((str3+str4).equals(str4+str3));

        String str6 = "seyhan yavuz";
        System.out.println(str6.replace("s","S"));
        System.out.println(str6.replace("y","Y"));

        System.out.println(str6.replaceAll("s","S"));
        System.out.println(str6.replaceAll("y","Y"));

        System.out.println(str6.replace('s','S'));
        System.out.println(str6.replace('y','Y'));

        String str7 = "Java Kolaydır";
        System.out.println(str7.endsWith("Java Kolaydır"));












    }
}
