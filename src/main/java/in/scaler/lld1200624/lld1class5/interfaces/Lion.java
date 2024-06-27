package in.scaler.lld1200624.lld1class5.interfaces;

public class Lion implements Animal {

    @Override
    public void move() {
        System.out.println("Lion moves");
    }
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    //if not overrided, it will take default void fly()
//    @Override
//    public  void fly() {
//        System.out.println("Lion can't flies!!");
//    }

}
