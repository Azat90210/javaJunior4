package lesson9.fig;

public class Triangle extends Figura implements iObem, iPloschad {
    private int a;
    private int b;
    private int c;
    public final double pi = 3.14596;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double obem() {
        return a*b*c;
    }

    @Override
    public double ploschad() {
        return a+b+c;
    }


}
