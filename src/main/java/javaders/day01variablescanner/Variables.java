package javaders.day01variablescanner;

public class Variables {

    //byte, short, integer,long, double, float
    // veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMax : "+byteMax);//byteMaz : 127
        System.out.println("byteMin = " + byteMin);//soutv byteMin = -128
//ctrl+z ==> geri al
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);//32767
        System.out.println("shortMin = " + shortMin);//-32768

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);//2147483647
        System.out.println("intMin = " + intMin);//-2147483648



    }//main body
}//class body
