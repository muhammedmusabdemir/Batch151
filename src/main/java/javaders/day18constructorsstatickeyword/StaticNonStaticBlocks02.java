package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){

        System.out.println("Constructor 1");
    }//constructor

    public StaticNonStaticBlocks02(int price){

        System.out.println("Constructor 2");
    }//constructor

    public StaticNonStaticBlocks02(String name){

        System.out.println("Constructor 3");
    }//constructor

    public StaticNonStaticBlocks02(boolean isOld){

        System.out.println("Constructor 4");
    }//constructor


    //non-static block constructor'larda ortak calistirilmasi gereken ortak kodlari icerir
    //non-static block icindeki kodlar her constructor icin calistirilir.
    //Birden fazla non-static block varsa ustteki once calistirilir.
    {
        System.out.println("I am constructor - ilk");
    }//non-static constructor

    {
        System.out.println("I am constructor - ikinci ");
    }//non-static constructor

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);


    }//main



}//class

