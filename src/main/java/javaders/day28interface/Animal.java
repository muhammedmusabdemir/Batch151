package javaders.day28interface;

public interface Animal {

    void eat();
    void drink();

    //1)interface'lerdeki tum variable'lar otomatik olarak "final"dir.
    //  Bu yuzden interface icindeki variable'i olusturdugunuzda mutlaka deger atamasi yapmalisiniz.
    //  Bilindigi gibi final variable'larin degerleri degistirilemez.
    //2)interface'deki tum variable'lar otomatik olarak "public"dir.
    //3)interface'deki tum variable'lar otomatik olarak "static"dir.
    int age =4;



}
