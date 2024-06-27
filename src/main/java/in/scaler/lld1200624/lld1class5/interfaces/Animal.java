package in.scaler.lld1200624.lld1class5.interfaces;

public interface Animal {
    void move();

    void eat();

    default void fly() {
        System.out.println("Oops can't fly!");
    }
}
