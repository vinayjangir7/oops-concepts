package oops.concepts;

public class Child {

    static void show() {
        System.out.println("show from child");
    }

    public static void main(String[] args) throws Throwable {
        Parent parent = new Parent();
        /*Parent parent1 = new Child();*/
        /*parent.show();*/
        /*parent1.show();*/
    }
}
