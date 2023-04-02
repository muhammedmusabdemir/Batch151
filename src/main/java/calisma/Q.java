package calisma;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q {
    public static void main(String[] args) {

        int n [] [] = {{1,3}, {2,4}};
        for(int i = n.length-1; i>= 0 ; i--){
            for (int y : n[i]){
                System.out.print(y);
            }
        }

    }



}//class
