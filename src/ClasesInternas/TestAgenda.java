package ClasesInternas;


import javax.swing.*;
import java.awt.*;
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
//        List<String> lineas = Files.readAllLines(
//                Paths.get("datos/contactos.csv"));
//        for (String linea : lineas) {
//            String[] tokens = linea.split(",");
//            String nombreContacto = tokens[0];
//            String apellidos = tokens[1];
//            String telefono = tokens[2];
//            String sFechaNacimiento =  tokens[3];
//            LocalDate fechaNacimiento = LocalDate.parse(sFechaNacimiento);
//            Contacto contacto = new Contacto(
//                    nombreContacto, apellidos, telefono, fechaNacimiento);
//            contactos.add(contacto);
//        }
        //comprobación de los contactos:
        // contactos.forEach(System.out::println);
//        System.out.printf("%nNº contactos %d%n", contactos.size());
//        String[] nombresAgenda = { "TRABAJO", "AMIGOS", "GIMNASIO", "FAMILIA" };
//        Object selectedValue = JOptionPane.showInputDialog(null,
//                "Choose one", "Input",
//                JOptionPane.INFORMATION_MESSAGE, null,
//                nombresAgenda, nombresAgenda[0]);
//        String sValor = (String) selectedValue;
//        NombreAgenda nombreAgenda = NombreAgenda.valueOf(sValor);
//        Agenda agenda = new Agenda(nombreAgenda, contactos);


        //Usando JOption menú con dos opciones:
        String salir = "";
        do {
            String inputValue =
                    JOptionPane.showInputDialog("Please input a value\n1. añadir contacto.\n2. mostrar contacto\n3.Salir");
            salir = inputValue;
            if (inputValue.matches("1")){
                String nombre = JOptionPane.showInputDialog("ESCRIBA EL NOMBRE");
                String apellido = JOptionPane.showInputDialog("ESCRIBA EL APELLIDO");
                String telefono = JOptionPane.showInputDialog("ESCRIBA EL TELEFONO");
                String fechaDeNacimiento="";
                do {
                    fechaDeNacimiento = JOptionPane.showInputDialog("ESCRIBA LA FECHA DE NACIMIENTO (2000-21-21)");
                    if (! fechaDeNacimiento.matches("[12][0-9]{3}-([1-9]|0[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])")){
                        Object[] options = {"CONTINUAR"};
                        JOptionPane.showOptionDialog(null, "Por favor ponga el formato 0000-00-00", "FORMATO INCORRECTO",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                                null, options, options[0]);
                    }
                }while (! fechaDeNacimiento.matches("[0-9][0-9][0-9][0-9]-[0-9]?[0-9]-[0-9]?[0-9]"));

                Contacto contacto = new Contacto(nombre,apellido,telefono,LocalDate.parse(fechaDeNacimiento));
                contactos.add(contacto);
                continue;
            }
            if (inputValue.matches("2"))
                mostrarContactos(contactos);
        }while (!salir.matches("3"));

        //para cada un un método, ejemplo mostrarContacto(Contacto contacto)
        //usando JOptionPane mostramos el contacto
        //añadir contacto, pedimos cuatro datos
    }
    public static void mostrarContactos(List<Contacto> contactos){
        contactos.forEach(System.out::println);
    }
}

