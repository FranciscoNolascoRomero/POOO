package Ejercicios.EcuacionSegundoGrado;

public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public EcuacionSegundoGrado() {
    }

    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}

    public void setA(double a) {this.a = a;}
    public void setB(double b) {this.b = b;}
    public void setC(double c) {this.c = c;}

    public double getX1(){
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2*a);
    }
    public double getX2(){
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2*a);
    }
    public boolean esResoluble(){
        return b * b - 4 * a * c >= 0;
    }
    public boolean tienenUnaSolucion(){
        return getX1() == getX2();
    }
    @Override
    public String toString() {
        return String.format("x1 = %.2f x2 = %.2f",getX1(),getX2());
    }
}
