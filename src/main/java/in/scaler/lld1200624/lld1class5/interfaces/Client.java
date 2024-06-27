package in.scaler.lld1200624.lld1class5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInterface();
    }
    public static void demoInterface() {
        Lion lion = new Lion();
        lion.move();
        lion.eat();
        lion.fly();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(lion);
        animals.add(new Eagle());

        for(Animal animal : animals) {
            animal.fly();
            animal.eat();
        }

    }
}
