package Ejercicios.Triangulo;

public class Ejercicio2 {
    private double cateto1 = 0.0;
    private double cateto2=0.0;

    public Ejercicio2(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public Ejercicio2() {
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    public double getArea(){
        return (cateto1*cateto2)/2;
    }
    public double getPerimetro(){
        return cateto1+cateto2+getHipotenusa();
    }
    public double getHipotenusa(){
        return Math.hypot(cateto1,cateto2);
    }

    @Override
    public String toString() {
        return String.format("%.2f,%.2f,%.2f,%.2f,%.2f",cateto1,cateto2,getHipotenusa(),getPerimetro(),getArea());
    }
}
