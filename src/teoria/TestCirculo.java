package teoria;

import java.util.ArrayList;
import java.util.List;

public class TestCirculo {
    public static void main(String[] args) {
        //creamos una coleccion de objetos circulo
        List<Circulo> objetos = new ArrayList<>();
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(9);
        System.out.println("1º circulo radio " + circulo1.getRadio());
        objetos.add(circulo1);

        Circulo circulo2 = new Circulo();
        circulo2.setRadio(12);
        System.out.printf("Circulo 2 de radio " + circulo2.getRadio());
        System.out.printf("%nArea del circulo 2 es %f%n",circulo2.getArea());
        objetos.add(circulo2);
        caracteristicaCirculo(objetos);
        //mostramos perimetro
    }
    //creamos un metodo que le pasemos la coleccion y que muestre para cada objeto:
    public static void caracteristicaCirculo(List<Circulo> objetos){
        for (int i = 0; i < objetos.size(); i++) {
            System.out.printf("CIRCULO %d , de radio %d , de longitud %.2f y area %f  %n",i+1, objetos.get(i).getRadio(), objetos.get(i).getLongitud(),objetos.get(i).getArea());
        }

    }
    //CIRCULO x DE RADIO XXX CON longitud xxx y area xxx
}
