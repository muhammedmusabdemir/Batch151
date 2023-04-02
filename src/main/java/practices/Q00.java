package practices;

public class Q00 {
    public static void main(String[] args) {

        int sonuc = toplamaYap(17, 39);
        System.out.println("sonuc = " + sonuc);

        double answer = doDivide(12.39, 94.81);
        System.out.println("answer = " + answer);

        double sonuc2 = karekokAl(121);
        System.out.println("sonuc2 = " + sonuc2);

        print("Selamlar");

        String isim = "Musab";

        int month = 5;
        System.out.println(month);

        month = 7;
        System.out.println(month);

        month = 11;
        System.out.println(month);

        int x;

        int y = 9;

        int z = 17;

        x = y;

        x = 1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


        float firstNumber = 3.7f;
        float secondNumber = 7.9f;
        float product = firstNumber * secondNumber;
        System.out.println("The product is: " + product);

        int first = 10;
        int second = 20;

        int sum = first + second;
        System.out.println("Enter two numbers \n"+ first + " "+ second + "\nthe sum is = " + sum);


    }

    public static int toplamaYap(int a, int b) {
        return a + b;
    }

    protected static double doDivide(double c, double d) {
        return c / d;
    }

    static double karekokAl(int e) {
        return Math.sqrt(e);
    }

    public static void print(String str) {
        System.out.println(str);
    }


}
