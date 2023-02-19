package ClasesInternas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        List<Contacto> contactos = new ArrayList<>();
        List<String> lineas = Files.readAllLines(Paths.get("Datos/contactoscsv.csv"));
        System.out.printf("Leidas %d lineas%n",lineas.size());
        for (String linea:lineas) {
            String[] tokens = linea.split(",");
            //el token 0 = nombre
            System.out.printf("Nombre: %s ",tokens[0]);
            //el token 1 = apellidos
            System.out.printf("Apellidos: %s ",tokens[1]);
            //el token 2 = telefono
            System.out.printf("Telefono: %s ",tokens[2]);
            //el token 3 = fechaNacimiento
            //localDate.parse(tokenn3) y obtenemo un objeto LocalDate
            System.out.printf("Fecha Nacimiento: %s ",tokens[3]);
            LocalDate.parse(tokens[3]);
            //Creamos objeto Contacto
            Contacto contacto = new Contacto(tokens[0],tokens[1],tokens[2],LocalDate.parse(tokens[3]));
            //LO añladimos a la lista contactos
            contactos.add(contacto);

        }
        //Con un scanner pedimos el nombre de la agenda
        String nombreAgenda = scanner.nextLine();
        // con contactos y el nombre de la agenda creamos un objeto agenda
        Agenda agenda=new Agenda(nombreAgenda);
    }
}
