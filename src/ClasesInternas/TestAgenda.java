package ClasesInternas;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) throws IOException {
        List<Contacto> contactos = new ArrayList<>();
        List<String> lineas = Files.readAllLines(Paths.get("Datos/contactoscsv.csv"));
        System.out.printf("Leidas %d lineas%n",lineas.size());
        for (String linea:lineas) {
            String[] tokens = linea.split(",");
            //el token 0 = nombre

            LocalDate.parse(tokens[3]);
            //Creamos objeto Contacto
            Contacto contacto = new Contacto(tokens[0],tokens[1],tokens[2],LocalDate.parse(tokens[3]));
            //LO añladimos a la lista contactos
            contactos.add(contacto);

        }
        String[] nombresAgenda = { "TRABAJO", "AMIGOS", "GIMNASIO","FAMILIA" };

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                nombresAgenda, nombresAgenda[0]);
        String sValor = (String) selectedValue;
        NombreAgenda nombreAgenda =NombreAgenda.valueOf(sValor);
        Agenda agenda =new Agenda(nombreAgenda,contactos);
        //usando jh point usamos con dos opciones añadir contacto y mostrar contacto
    }
}
