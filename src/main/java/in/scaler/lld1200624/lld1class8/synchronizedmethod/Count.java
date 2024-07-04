package in.scaler.lld1200624.lld1class8.synchronizedmethod;

public class Count  extends Object {
    int value = 0;

    public synchronized void incrementValue(int offset) {
        //
        //
        this.value += offset;
        //

        //
    }

    public int getValue() {
        return this.value;
    }
}