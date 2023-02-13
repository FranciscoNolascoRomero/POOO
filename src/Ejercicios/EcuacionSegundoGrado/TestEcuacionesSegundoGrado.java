package Ejercicios.EcuacionSegundoGrado;

import java.util.ArrayList;
import java.util.List;

public class TestEcuacionesSegundoGrado {
    public static void main(String[] args) {
        List<EcuacionSegundoGrado> ecuacuaciones= new ArrayList<>();

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(3,-1,7);
        ecuacuaciones.add(ecuacion);

        EcuacionSegundoGrado ecuacion1 = new EcuacionSegundoGrado(1,-2,1);
        ecuacuaciones.add(ecuacion);

        mostrarLista(ecuacuaciones);
    }
    /**
     * Metodo que recorre una lista de objetos y muestra el mensaje no es resoluble si es falso y si es resoluble
     * muestra el contenido del objeto
     * @param ecuacuaciones Lista con objetos de ecuaciones de segundo grado.
     * */
    private static void mostrarLista(List<EcuacionSegundoGrado> ecuacuaciones) {
        for (EcuacionSegundoGrado ecuacion:ecuacuaciones){
            if (ecuacion.esResoluble() == false) {
                System.out.println("No es resoluble");
                continue;
            }
            System.out.println(ecuacion);
        }
    }
}
