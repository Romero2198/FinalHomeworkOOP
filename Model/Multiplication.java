package Model;

public class Multiplication implements Operate {
    @Override
    public double[] operate(ComplexNumber a, ComplexNumber b) {
        double[] temp = new double[2];
        temp[0] = a.getA() * b.getA() + a.getI() * b.getI() * (-1);
        temp[1] = a.getA() * b.getI() + b.getA() * a.getI();
        return temp;
    }
}
