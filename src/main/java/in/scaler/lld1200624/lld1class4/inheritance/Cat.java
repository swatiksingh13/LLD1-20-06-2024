package in.scaler.lld1200624.lld1class4.inheritance;

public class Cat extends Mammal{
    Cat(String name) {
        super(name);
        System.out.println("Cat constructor " + name);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a Cat");
    }
}
