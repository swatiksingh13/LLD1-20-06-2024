package in.scaler.lld1200624.lld1class10.generics;

public class GenericPair <F,S> {
    private F first;
    private S second;

    //constructor
//    public GenericPair(F first, S second) {
//        this.first = first;
//        this.second = second;
//    }


    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return this.first;
    }
    public S getSecond() {
        return this.second;
    }

    // static generic  method
    public static <T> void fun(T data) {
        System.out.println("Static Generic Pair Fun");
        System.out.println(data);
    }

}
