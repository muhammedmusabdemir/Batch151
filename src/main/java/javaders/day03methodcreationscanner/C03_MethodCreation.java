package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {
        //Dikdortgenin alanini hesaplatan bir method olusturunuz
        dikdortgenAlani(10,20);
        //dikdortgenAlani(10,20)+2; void kullandim

        //Karenin alanini hesaplatan methodu yaziniz
        System.out.println(kareAlani(6)+2);

    }//main

    private static int kareAlani(int mehmet) {

        return mehmet*mehmet;
    }

    private static void dikdortgenAlani(int a, int b) {

        System.out.println(a*b);
    }
}//class
