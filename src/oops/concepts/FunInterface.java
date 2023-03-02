package oops.concepts;

@FunctionalInterface
public interface FunInterface<T, U, V> {

    int x = 5;

    V apply(T t, U u);

    default void count() {
    }

    default void count1() {
    }

    static void hello(){

    }

    static void hello1(){

    }

}
