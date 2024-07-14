package in.scaler.lld1200624.lld1class12.functionalinterface;

import java.util.function.BiConsumer;

public class Client {
    public static void main(String[] args) {
        demoFunctionalInterface();

    }

    private static void demoFunctionalInterface() {
        //anonymous class
        SampleFunctionalInterface obj = new SampleFunctionalInterface() {
            @Override
            public void fun() {
                System.out.println("Called fun");
            }
            public void fun2() {
                System.out.println("Called fun2");
            }
        };    //end of interface
        obj.fun();
        obj.fun2();

        XYZ xyz = new XYZ();
        xyz.fun();

        BiConsumer<String, Integer> biConsumer = new BiConsumer<>() {
            public void accept(String s, Integer i) {
                System.out.println(s + " " + i);
            }
        };

        biConsumer.accept("Scaler", 90);
    }
}