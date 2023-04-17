package Model;

public class ComplexNumber {
    private double a;
    private double i;
    private String v;

    public double getA() {
        return a;
    }

    public double getI() {
        return i;
    }

    public String getV() {
        return v;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setI(double i) {
        this.i = i;
    }

    public void setV(String v) {
        this.v = v;
    }

    public ComplexNumber(double a, double i) {
        this.a = a;
        this.i = i;
    }

    @Override
    public String toString() {
        String temp = "";
        if (i > 0) {
            temp = "ComplexNumber " + a + " + " + i + "i";
        }
        if (i == 0) {
            temp = "ComplexNumber " + a;
        }
        if (i < 0) {
            temp = "ComplexNumber " + a + " " + i + "i";
        }
        return temp;
    }
}
