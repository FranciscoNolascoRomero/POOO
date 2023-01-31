package teoria;

public class Rectangulo {
    private int alto=1;
    private int ancho=2;

    public int getArea() {
        return alto * ancho;
    }
    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public double getLongitud(){
        return alto+alto+ancho+ancho;
    }
    public String toString(){
        return String.format("Ancho: %d Alto: %d ,%d ,%d",ancho,alto,getLongitud(),getArea());
    }


}
