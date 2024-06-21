package in.scaler.lld1200624.lld1class3.village;

public class Family {
    private String privateAttribute;
    Integer defaultAttribute;
    protected boolean protectedAttribute;
    public String publicAttribute;

    private void checkAccess() {
        System.out.println(privateAttribute);
        System.out.println(defaultAttribute);
        System.out.println(protectedAttribute);
        System.out.println(publicAttribute);
    }

    //Sub Class

    class SubFamily {
        private void checkAccess() {
            System.out.println(privateAttribute);
        }
    }
}
