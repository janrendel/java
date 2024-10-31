package chp10.ex10_6;

public class Circle extends Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double area() {
        double result = Math.PI * r * r;
        return result;
    }

}
