package ClasesInternas;
import strings.StringHelper;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAgenda2 {
    private static Agenda agenda;
    private static List<Contacto> contactos = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        List<String> lineas = Files.readAllLines(
                Paths.get("Datos/contactoscsv.csv"));
        // System.out.printf("Leidas %d líneas%n", lineas.size());
        for (String linea : lineas) {
            String[] tokens = linea.split(",");
            String nombreContacto = tokens[0];
            String apellidos = tokens[1];
            String telefono = tokens[2];
            String sFechaNacimiento = tokens[3];
            LocalDate fechaNacimiento = LocalDate.parse(sFechaNacimiento);
            Contacto contacto = new Contacto(
                    nombreContacto, apellidos, telefono, fechaNacimiento);
            contactos.add(contacto);
        }
        //comprobación de los contactos:
        // contactos.forEach(System.out::println);
        // System.out.printf("%nNº contactos %d%n", contactos.size());
        String[] nombresAgenda = {"TRABAJO", "AMIGOS", "GIMNASIO", "FAMILIA"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Elige tipo de agena", "AGENDA",
                JOptionPane.INFORMATION_MESSAGE, null,
                nombresAgenda, nombresAgenda[0]);
        String sValor = (String) selectedValue;
        NombreAgenda nombreAgenda = NombreAgenda.valueOf(sValor);

        agenda = new Agenda(nombreAgenda, contactos);
        desplegarMenu();
        //Usando JOption menú con dos opciones:
        //1. añadir contacto
        //2. mostrar contacto
        //para cada un un método, ejemplo mostrarContacto(Contacto contacto)
        //usando JOptionPane mostramos el contacto
        //añadir contacto, pedimos cuatro datos
    }

    private static void desplegarMenu() {
        String opcion = "";
        do {
            opcion =
                    JOptionPane.showInputDialog(
                            "Introduce una opción\n1. Añadir contacto.\n2. Mostrar contacto\n3. Actualizar COntacto\n4.Mostrar Agenda\n5.Salir");
        } while (!opcion.matches("[12345]"));
        //System.out.println("opción elegida " + opcion);
        do {
            switch (opcion) {
                case "1":
                    addContacto();
                    break;
                case "2":
                    mostrarContactoPorTelefono();
                    break;
                case "3":
                    actualizarContacto(contactos);
                    break;
                case "4":
                    mostrarAgenda();
                    break;
                case "5":
                    return;
                default:
                    break;
            }
        } while (!opcion.equals("5"));

    }

    private static void mostrarAgenda() {
        for(Contacto contacto:agenda.getContactos()){
            System.out.println(contacto);
        }
    }

    private static void actualizarContacto(List<Contacto> contactos) {
        for (Contacto contacto: contactos) {
            String contacto1 = "";
            do {
                contacto1 =
                        JOptionPane.showInputDialog(
                                "¿QUE CONTACTO DESEAS CAMBIAR?");
            } while (! contacto.getNombreContacto().equals(contacto1));

        }

    }

    private static void mostrarContactoPorTelefono() {
        String telefono = "";
        do {
            telefono =
                    JOptionPane.showInputDialog(
                            "Introduce nº teléfono del contacto a localizar");
        } while (!StringHelper.checkPhoneNumber(telefono));
        Contacto contacto = agenda.mostrarContacto(telefono);
        if (contacto != null)
            JOptionPane.showMessageDialog(
                    null, contacto, "CONTACTO",
                    JOptionPane.INFORMATION_MESSAGE);

        else
            JOptionPane.showMessageDialog(
                    null, "No existe el contacto", "CONTACTO",
                    JOptionPane.ERROR_MESSAGE);
        return;
    }

    private static void addContacto() {
        String nombre = JOptionPane.showInputDialog("ESCRIBA EL NOMBRE");
        String apellido = JOptionPane.showInputDialog("ESCRIBA EL APELLIDO");
        String telefono = JOptionPane.showInputDialog("ESCRIBA EL TELEFONO");
        String fechaDeNacimiento = "";
        do {
            fechaDeNacimiento = JOptionPane.showInputDialog("ESCRIBA LA FECHA DE NACIMIENTO (2000-21-21)");
            if (!fechaDeNacimiento.matches("[12][0-9]{3}-([1-9]|0[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                Object[] options = {"CONTINUAR"};
                JOptionPane.showOptionDialog(null, "Por favor ponga el formato 0000-00-00", "FORMATO INCORRECTO",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            }
        }while (! fechaDeNacimiento.matches("[0-9][0-9][0-9][0-9]-[0-9]?[0-9]-[0-9]?[0-9]"));
}
    //crear metodo actualizar contacto
    //
}