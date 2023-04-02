package javaders.day19passbyvaluemethodoverloadingDT;

public class PassByValue01 {

    /* Pass by value
        1) Java Pass by Value kullanir.
        2) Yan; java method'larin orjninal degeri degistirmesine musaade etmez
        3) Java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi method'a yollar
           Method kopya deger uzerinden degisklik yapar, boylece orjinal deger korunmus olur
        4) Java esnek bir dildir, Istersek yazdigimiz kod ile orjinal degerin degismesini temin edebiliriz
        bakiniz line 24:

       Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir

     */

    public static void main(String[] args) {

        int shirtPrice = 100;
        //buraya pass by value sayesinde shirtprice degeri koruma altina alinir
        int studentShirtPrice = discout("student",shirtPrice);
        //methoda gonderirken degeri degil kopyasini gonderir ve degisken deger kopyasi olur orjinal degil.
        System.out.println("studentShirtPrice = " + studentShirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);

        shirtPrice = discout("senior",shirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);

    }//main
    public static int discout(String type, int price){

        switch (type){
            case "student" :
                price = price -10;
                break;
            case  "veteran" :
                price = price -20;
                break;
            case "senior" :
                price = price -5;
                break;
            default :
                price = price;
        }
        return price;
    }

}//class
