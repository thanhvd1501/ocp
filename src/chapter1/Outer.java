package chapter1;

import java.util.List;

public class Outer {

    private class Inner {
        static void anInt(){

        }
        public String name = "inner-class";
        public void display(String name) {
            System.out.println("This is " + name);
        }
    }
    void print(){
        Outer outer = new Outer();
        Inner inner = new Outer.Inner(); // way 1 :  create the inner class
        Inner inner1 = outer.new Inner(); // way 2 :  create the inner class
        System.out.println(inner.name);
        System.out.println(inner.name);
        System.out.println(inner.name);
        System.out.println(inner.name);
        System.out.println(inner.name);
        inner.display(inner.name);
        Integer
    }

    static void printf(){
        // Không thể khai báo bên trong 1 static method hoặc fields
        Inner inner = new Inner(); // Does not compile
    }
    public static void main(String[] args) {
        Outer outer = new Outer();

        // We need an instance of Outer to create Inner
        Inner inner = outer.new Inner();
    }
}

class Outer2 {

    // Không thể gọi được ngoài class Outer
    Outer.Inner inner = new Outer.Inner(); // Does not compile
    public static void main(String[] args) {

    }
}
