package javaders.day04memorykullanimiwrapperclass;


public class Araba {


    public String model = "v60";  // ==>Variable'lar pasif ozellirler
    public String renk = "Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {


    /*
    Class ==> Variable  (Pasif Ozellikler) ==>Object
          ==> Methodlar (Aktif Ozellikler)


     */
        // Class ismi   Objenin ismi    = new    Classismi()==>Costructor;
        // Scanner input = new Scanner(System.in);

        Araba volvo = new Araba();

        hareket();
        dur();
        yakit();
        System.out.println(volvo.fiyat);
        System.out.println(volvo.model);
        System.out.println(volvo.renk);

    }//main
    private static void yakit() {
        System.out.println("Volvolar az yakit tuketir...");
    }
    static void dur() {
        System.out.println("Volvo Guvenle durur...");
    }
    public static void hareket(){   // Aktif Ozellikler
        System.out.println("volvo hizli gider...");

    }
}//class
