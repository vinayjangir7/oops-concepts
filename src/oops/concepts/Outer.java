package oops.concepts;

public class Outer {

    int x=5;
    static int y=5;
    class Inner {
        void print() {
            System.out.println("print from Inner"+ x + y);
        }
    }

    static class StaticInner {
        void print() {
            System.out.println("print from StaticInner"+y);
        }
    }

    public static void main(String[] args) {
        StaticInner staticInner = new StaticInner();
        staticInner.print();

        Outer outer = new Outer();

        Inner inner = outer.new Inner();
        inner.print();
    }
}
