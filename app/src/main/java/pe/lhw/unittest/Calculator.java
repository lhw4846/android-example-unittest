package pe.lhw.unittest;

/**
 * Created by lhw48 on 2016-05-10.
 */
public class Calculator {
    int a, b;

    public Calculator() {

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean equalTo(int a, int b) {
        return a == b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
