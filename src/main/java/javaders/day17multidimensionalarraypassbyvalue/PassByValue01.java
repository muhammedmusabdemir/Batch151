package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    /*
       Method olusturmak icin asagidaki 5 adimi takip ediniz
       1)Access Modifier
       2)Return Type
       3)Method Ismi
       4)( ) Method Parantez
       5){ } Method Body'si

       Note: "main method" un icindeki tum method'lar static olmalidir.
       Bir methodu static yapmak icin access modifier ile return type in arasina
       static yazmak yeterlidir.

       Pass by Value:
       1)Java "Pass by Value" kullanir.
       2)Yani; Java method'larin orjinal degeri degistirmesine musaade etmez
       3)Java method'lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyasini method'a yollar
         Method kopya deger uzerinden degisiklik yapar, boylece orjinal deger korunmus olur.
       4)Java esnek bir dil'dir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.
       Bakiniz line 35

       Pass by Refeernce:
       1)Pass by Refeernce da method'a reference yollani.
       2)Reference adres demektir. Adres yollaninca method adresi kullanarakojinal degere ulasi ve
         ojinal degeri degistirir. Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable'nin orjinal
         degerini degistirir.
     */



    public static void main(String[] args) {

        int shirtPrice = 200;

        System.out.println(discount("student",shirtPrice));
        System.out.println(shirtPrice);

        shirtPrice = discount("veteran",shirtPrice);
        System.out.println(shirtPrice);

    }//main

    //Discount Method'u olusturunuz
    public static int discount (String type, int price){

        switch (type){

            case "student":
                price = price -20;
                break;
            case "veteran":
                price = price -40;
                break;
            case "senior":
                price = price -30;
                break;
            default:
                price = price;
        }
        return price;
    }


}//class
