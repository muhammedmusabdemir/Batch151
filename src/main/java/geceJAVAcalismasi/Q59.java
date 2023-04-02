package geceJAVAcalismasi;

import java.util.ArrayList;
import java.util.List;

public class Q59 {
    public static void main(String[] args) {

        //L!stede eleman olarak 15 varsa, tüm 15'ler! 51 olarak deg!st!r!n!z.
        //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(11);
        nums.add(15);
        nums.add(34);
        nums.add(15);
        nums.add(43);



        int aranan = 15;
        int count = 0 ;
        for (Integer w : nums){
            if (w==aranan) {
                nums.set(count,51);
            }
            count++;
        }
        System.out.println();




    }//main
}//class
