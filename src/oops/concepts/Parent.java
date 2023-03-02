package oops.concepts;

public class Parent extends AbstractClass implements Interface, InterfaceA {

    Parent() {
        super();
    }

    void show(){

    }

    static void run() {
        System.out.println("run from parent");
    }

    public void def() {
        Interface.super.def();
        InterfaceA.super.def();
    }

    public static void main(String[] args) {

        Interface anInterface = new Parent();
        /*anInterface.def();*/

        InterfaceA interfaceA = new Parent();
        /*interfaceA.def();*/

        Parent parent = new Parent();
        /*parent.def();*/

        AbstractClass abstractClass = new Parent();
        abstractClass.run();

        FunInterface p = ((Object s, Object t) -> "abc");


    }
}
