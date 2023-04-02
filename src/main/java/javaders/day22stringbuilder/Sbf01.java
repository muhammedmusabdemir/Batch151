package javaders.day22stringbuilder;

public class Sbf01 {

    /*
       1) StringBuffer Java'da String ureten bir Class'tir.
       2) StringBuffer, StringBuilder'a cok benzer, yani ikiside mutable String uretir.
       3) StringBuffer "Multy-thread" dir ama StringBuilder "multi-thread" degildir.
       4) Java StringBuffer'i, StringBuilder'dan once olusturdu.
       5) StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir.
       6) Multi-thread yapilirken yapilan islerin siralamasi onem arz eder, yapilan isleri
          mantikli bir siraya koymak "syncronization" olarak adlandirlir.
          StringBUffer "multi-thread" oldugu icin ayni zamanda "syncronization" dir.

       3 tane String olusturan Class ogrendik;
       1)immutable string lazimsa; String Class
       2)mutable String lazimsa; StringBuilder veya StringBuffer
                                i) StringBuilder'i multi-thread gerekmezse kullaniriz
                                ii) StringBuffer'i multi-thread gerekirse kullaniriz
     */

    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");









    }//main

}//class
