package calisma;

public class calisma {

    public static void main(String[] args) {

        int rows =5;

        for (int i = 0; i<rows; i++) {

            for (int k=rows; k>i; k--) {

                System.out.print(" ");

            }

            for (int j=0; j<=i ; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }



        int rows1=7;
        int columns =7;

        for (int i=0;i<rows1;i++){
            for (int k=0;k<columns;k++){
                if (k==i){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }



    }//main

}//class
