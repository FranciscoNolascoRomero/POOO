package Ejercicios;

public class Cilindro {
    private double radio;
    private double altura;
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public Cilindro() {
    }

    public double getRadio() {

        return radio;
    }
    public void setRadio(double radio) {

        this.radio = radio;
    }
    public double getAltura() {

        return altura;
    }
    public void setAltura(double altura) {

        this.altura = altura;
    }
    public double getSuperficie(){

        return 2.0*Math.PI*radio*altura + 2.0*Math.PI*(radio*radio);
    }
    public double getVolumen(){

        return 3.14*altura*(radio*radio);
    }
    @Override
    public String toString() {
        return String.format( "Altura: %.2f Radio: %.2f Superficie: %.2f Volumen: %.2f ",altura,radio,getSuperficie(),getVolumen());
    }
}
