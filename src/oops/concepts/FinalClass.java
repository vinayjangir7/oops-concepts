package oops.concepts;

public final class FinalClass {

    FinalClass() {
        System.out.println("Final Class");
    }

    void hello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.hello();
    }
}
