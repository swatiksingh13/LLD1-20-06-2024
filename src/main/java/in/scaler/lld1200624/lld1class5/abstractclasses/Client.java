package in.scaler.lld1200624.lld1class5.abstractclasses;

public class Client {
    public static void main(String[] args) {
        demoAbstractClass();
    }
    public static void demoAbstractClass() {
        Tiger tiger = new Tiger();
        tiger.move();

       // Mammal mammal = new Mammal();  //wrong as Mammal is abstract; cannot be instantiated
        Mammal mammal = new Tiger();
        mammal.move();

        Whale whale = new BlueWhale();
        whale.move();
    }
}
