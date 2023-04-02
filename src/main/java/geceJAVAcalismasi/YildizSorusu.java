package geceJAVAcalismasi;

import java.util.Scanner;

public class YildizSorusu {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.println("lutfen satir sayisini giriniz:");
        int satirSayisi= inp.nextInt();

        for (int i=1; i<=satirSayisi; i++){
            for (int k= 1; k<=(satirSayisi-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println(" ");

        } for (int i = satirSayisi - 1; i> 0; i--) {
            for (int k = 1; k<= (satirSayisi - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }//main
}//class
