package chapter1;

public class Outer {

    private class Inner {
        public String name = "inner-class";
        public void display(String name) {
            System.out.println("This is " + name);
        }
    }
    void print(){
        Inner inner = new Inner();
        System.out.println(inner.name);
        inner.display(inner.name);
    }

    static void printf(){
        // Không thể khai báo bên trong 1 static method hoặc fields
        Inner inner = new Inner(); // Does not compile
    }
    public static void main(String[] args) {

    }
}

class Outer2 {

    // Không thể gọi được ngoài class Outer
    Outer.Inner inner = new Outer.Inner(); // Does not compile
    public static void main(String[] args) {

    }
}
