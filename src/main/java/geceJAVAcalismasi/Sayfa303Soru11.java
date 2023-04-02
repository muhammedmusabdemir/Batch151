package geceJAVAcalismasi;

import java.util.Arrays;

public class Sayfa303Soru11 {

    public static void main(String[] args) {

        /*
           Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
           Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
         */
        Integer[] arr = new Integer[]{5, 0, 2, 0, 3};
        Integer[] brr = new Integer[arr.length];
        int firstIdx = 0;
        int lastIdx = arr.length-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                brr[firstIdx] = arr[i];
                firstIdx++;
            }else{
                brr[lastIdx]=0;
                lastIdx--;
            }
        }
        System.out.println(Arrays.toString(brr));




    }//main

}//class
