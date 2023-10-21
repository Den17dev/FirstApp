package org.example;

public class TestClass {

    private int value;

    private byte step;

    public TestClass(int value, byte step) {
        this.value = value;
        this.step = step;
    }

    TestClass() {

    }

    public byte getStep() {
        return step;
    }

    public void setStep(byte step) {
        this.step = step;
    }

    public int getValue(int value) {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private String someMethod(){
        return String.valueOf(getValue(value));
    }
}
