package practices;

public class C03_Ascii {

    public static void main(String[] args) {

        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız


        /* ASCII

           B ==>                    C ==>
           D ==>                    E ==>
           L ==>                    M ==>

         */

        char ilkKarakter = 'B' + 1; //C

        char ikinciKarakter = 'D' + 1; //E

        char ucuncuKarakter = 'L' + 1; //M

        System.out.println("" + ilkKarakter + ikinciKarakter + ucuncuKarakter);






    }//main
}//class
