package javaders.day13incrementdecrementloops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

               for (int i = 21 ; i<181 ; i++ ){

                   if(i%4==0 && i%6==0 ){
                       System.out.print(i+" ");
                   }//if body

               }//for body
        System.out.println();


        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //  ankara ==> AKR

        //Note : Bir String'de son index her zaman length()-1
        //Note : Yazdiginiz kod belli seneryolar icin calisiyor ancak tum seneryolar icin calismiyorsa;
        //bu tarz koda ==> hard-code denir ==> ve mutlaka duzeltilmelidir

        String s = "ankara";
                    //   i<=length()-1
        for (int i = 0 ; i<s.length() ; i++){

           String ch = s.substring(i,i+1);
           if(i%2==0){
               System.out.print(ch.toUpperCase());
           }//if body

        }//for body





    }//main
}//class
