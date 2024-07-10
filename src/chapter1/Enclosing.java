package chapter1;

public class Enclosing {
    static int b= 8;

    static class Nested{
        private int price = 6;
        static int a = 6;
        static void display(){
            System.out.println(a);
        }
    }
    void display(){
        static int k = 0;
        class LocalClass {
            static int anInt = 5;
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
