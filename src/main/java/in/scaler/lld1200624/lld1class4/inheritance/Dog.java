package in.scaler.lld1200624.lld1class4.inheritance;

public class Dog extends Mammal{

     Dog(String name) {
         super(name);
         System.out.println("Dog constructor"+ name);
    }


    public void whoAmI() {
        System.out.println("I am a Dog");
    }
}
