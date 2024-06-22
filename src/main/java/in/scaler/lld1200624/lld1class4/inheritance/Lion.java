package in.scaler.lld1200624.lld1class4.inheritance;

public class Lion extends Cat{
    Lion(String name) {
        super(name);
        System.out.println("Lion constructor " + name);
    }


    public void whoAmI() {
        System.out.println("I am a Lion.");
    }

    void fun() {
        System.out.println("Lion fun");
    }

   void fun(int x) {
        System.out.println("Lion fun with int " + x);
    }
}
