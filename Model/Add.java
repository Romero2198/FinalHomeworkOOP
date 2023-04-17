package Model;

public class Add implements Operate {
    @Override
    public double[] operate(ComplexNumber a, ComplexNumber b) {
        double[] temp = new double[2];
        temp[0] = a.getA() + b.getA();
        temp[1] = a.getI() + b.getI();
        return temp;
    }
}
