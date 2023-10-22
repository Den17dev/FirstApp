package org.example;

public class AnotherClass {

    private String text;
    
   private String text4;

    private TestClass testClass;

    public AnotherClass(TestClass testClass) {
        this.testClass = testClass;
    }

    public TestClass getTestClass() {
        return testClass;
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }

    AnotherClass(){

    }
    AnotherClass(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
