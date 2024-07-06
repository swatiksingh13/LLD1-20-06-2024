package in.scaler.lld1200624.lld1class10.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //demoPair();
        //demoGenericPair();
        demoGenericMethod();
    }

    private static void demoGenericMethod() {
        Pair p1 = new Pair();
        int x = p1.fun("India", 140);
        System.out.println(x);

        // Static generic method
        // Type Inference
        GenericPair.fun("India");
        GenericPair.fun(140);
        GenericPair.fun(5.0);
        GenericPair.fun(true);

        GenericPair.<Boolean>fun(false);
        GenericPair.<String>fun("USA");

        // Map<String, Integer> map = new HashMap<>();
    }

    private static void demoPair() {
        Pair p1 = new Pair();
        p1.first = 140;
        p1.second = "India";

        // problem while compile time no error, now in
        // runtime error comes up:Integer cannot be cast to class java.lang.String
        String name = (String) p1.first;
        double x = (double) p1.second;
        System.out.println(name);
        System.out.println(x);
    }

    private static void demoGenericPair() {
        GenericPair<String, Integer> pair = new GenericPair<>();
        pair.setFirst("India");
        pair.setSecond(140);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        GenericPair<Double,Double> pair2 = new GenericPair<>();
        pair2.setFirst(20.456);
        pair2.setSecond(23.678);

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());

        List<String> strings = new ArrayList<>();
    }
}
