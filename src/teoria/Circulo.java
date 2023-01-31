package teoria;

public class Circulo {
    //ATRIBUTOS
    private int radio = 5;
   // private double py=3.14;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {

        this.radio = radio;
    }
    public double getArea(){
        //double area = (py * Math.pow(radio,2));
       // return area;
        return Math.PI * Math.pow(radio,2);

    }
    //metodo que calcule la longitudq
    public double getLongitud(){
        return 2.0 * Math.PI * radio;
    }
    //metodo que de
}
