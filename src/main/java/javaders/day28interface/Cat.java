package javaders.day28interface;

public class Cat implements Mammal{

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        //interface'lerde varibale cagirirken "interface" adini kullarak cagirin.
        //Bu hem "static" variable olmanin geregidir, hem de okunurlugu artirir.
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(age);
    }



}
