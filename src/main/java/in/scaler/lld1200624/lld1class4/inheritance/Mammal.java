package in.scaler.lld1200624.lld1class4.inheritance;

public class Mammal extends Animal {
    Mammal(String name ) {
        super(name);
        System.out.println("Mammal constructor " + name);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a Mammal");
    }
}
