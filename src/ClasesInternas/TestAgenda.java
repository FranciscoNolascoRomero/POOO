package ClasesInternas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestAgenda {
    public static void main(String[] args) throws IOException {
        List<Contacto> contactos = new ArrayList<>();
        List<String> lineas = Files.readAllLines(Paths.get("Datos/contactoscsv.csv"));
        System.out.printf("Leidas %d lineas%n",lineas.size());
        for (String linea:lineas) {
            String[] tokens = linea.split(",");
            //el token 0 = nombre
            //el token 1 = apellidos
            //el token 2 = telefono
            //el token 3 = fechaNacimiento
            //localDate.parse(tokenn3) y obtenemo un objeto LocalDate
            //Creamos objeto Contacto
            //LO añladimos a la lista contactos

        }
        //Con un scanner pedimos el nombre de la agenda
        // con contactos y el nombre de la agenda creamos un objeto agenda
    }
}
