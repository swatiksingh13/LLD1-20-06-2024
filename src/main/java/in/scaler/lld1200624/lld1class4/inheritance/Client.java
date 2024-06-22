package in.scaler.lld1200624.lld1class4.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInheritance();
    }

    private static void demoInheritance() {
        Lion lion = new Lion("Leo");
        lion.fun();
        lion.fun(5);
        lion.whoAmI();
        System.out.println("Debug");

        Animal a =new Cat("Leo");
        a.whoAmI();
        a = new Mammal("Horse");
        a.whoAmI();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Goldy"));
        animalList.add(new Mammal("Bird"));
        animalList.add(new Lion("White"));
        animalList.add(new Dog("Dog"));

        for(Animal animal : animalList) {
            animal.whoAmI();
        }
    }
}
