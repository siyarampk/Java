package com.srstech.app;

public class AccessModifiersDemo {

    protected int protectedVariable;
    int defaultVariable;
    private int privateVariable;

    public void publicMethod() {
        int num = 9;
        System.out.println("Hello from public method");
    }

    private void privateMethod() {
        System.out.println("Hello from private method");
    }

    protected void protectedMethod() {
        System.out.println("Hello from protected method");
    }

    void defaultMethod() {
        System.out.println("Hello from default method");
    }
}
