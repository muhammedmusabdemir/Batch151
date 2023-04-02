package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
      ArrayList'ler eleman silme ve eklemede  tekrar indexlemee yapmak zorunda olduklarindan
      eleman ekleme ve silmede basarisizdirlar.

      ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
      LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
      ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

      LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
      oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
      ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
      Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.

      1) LinkedList’ler index kullanmazlar bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
      2)LinkedList’lerde node ekleme ve silme islemleri yaparken sadece pointer’lari degistirir.

      NOTE:ArrayList'ler eleman bulmada cok basarilidir , LinkedList'ler ise node bulmada basarisizdir ekleme ve cikarmada ise LinkedList'ler daha basarilidir.
    */

    /*
      1)LinkedList'ler node ilme ve eklmede cok basarili olduklari icin,
        silme ve ekleme islemelerini coklukla yapacaginiz zaman LinkedList kullaniniz.
      2)ArrayList'ler index'leri adres gibi kullanir, bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
        Note: Ihtiyaciniz olan collection cogunlukla silme ve ekleme yapacaksa(muze ziyaretcileri gibi) LinkedList,
              "search" islemleri yapacaksa(amerika eyaletleri gibi) ArrayList kullaniniz.

     */

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");


        System.out.println(s); // [Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove(2);
        System.out.println(s); // [Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove("Ajdar");
        System.out.println(s); // [Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        //s.remove();
        System.out.println(s); // [Steve, Esen, Muge, Cuneyt, Esra]

        //s.removeFirstOccurrence("Esra");
        System.out.println(s); // [Kemal, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        //s.removeLastOccurrence("Esra");
        System.out.println(s); // [Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Ajdar]

        /*
           Retrieves, but does not remove, the first element of this list.
           Throws: NoSuchElementException – if this list is empty
         */
        String r1 = s.peek(); // Ilk node'u  silmeden size verir. (copy+paste)
        System.out.println(r1); // Kemal
        System.out.println(s); // [Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
          Retrieves and removes the head (first element) of this list.
          Returns: the head of this list, or null if this list is empty
         */
        String r2 = s.poll(); // Ilk node'u size verir ve List'ten siler. (cut+paste)
        System.out.println(r2); // Kemal
        System.out.println(s); // [Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
           Retrieves, but does not remove, first element of this list.
           Throws: NoSuchElementException – if this list is empty
           Note: peek() ile element() ikisi de ilk elemani silmeden size verir.
                 Ama peek() list bos oldugunda size "null" verir element() ise "hata" verir.
         */
        String r3 = s.element(); // Ilk elemani silmeden size verir (copy+paste)
        System.out.println(r3); // Esra
        System.out.println(s); // [Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
           Removes and returns the first element of this list.
           Throws: NoSuchElementException – if this list is empty
           Note: poll() ile pop() ikisi de ilk elemani siler ve size verir.
                 Ama poll() list bos oldugunda size "null" verir pop() ise "hata" verir.
         */
        String r4 = s.pop();
        System.out.println(r4); // Esra
        System.out.println(s); // [Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        //hash set setlerin en hizlisidir hiz ihtiyaci
        //link hash set elemanlari sizin girdiginiz siraya gore dizer
        //treeset elemanlari natural order'a gore dizer












    }//main

}//class
