package javaders.day21datetimeNT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); //2023-03-16T22:03:30.228749800

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formattedLdt = dtf1.format(ldt);

        System.out.println(formattedLdt); //3/16/2023 - 10:07 PM




    }//main

}//class

