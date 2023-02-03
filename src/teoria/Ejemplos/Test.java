package teoria.Ejemplos;

import teoria.Circulo;
import teoria.Rectangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> persona = new ArrayList<>();
        int numeroPersona;
       do {
           System.out.println("Nº De personas a crear (1-10)");
           String numeroPersonas = scanner.nextLine();
           numeroPersona =Integer.parseInt(numeroPersonas);
       }while (!(numeroPersona<10 && numeroPersona>0));


        for (int i = 0; i < numeroPersona; i++) {
            Persona peersona = new Persona();
            String nombre;
            do {
                System.out.println("Escriba el nombre");
                nombre= scanner.nextLine();
                peersona.setNombre(nombre);
            }while (!nombre.matches("[A-Z-a-zñÑ]+"));


            String telefono;
            do {
                System.out.println("Escriba el telefono");
                telefono = scanner.nextLine();
                peersona.setTelefono(1
                        telefono);
            }while (!checkPhoneNumber(telefono));


            String sEdad;
            int iEdad;
            do {
                System.out.println("Escriba la edad");
                sEdad = scanner.nextLine();
                iEdad = Integer.parseInt(sEdad);
                peersona.setEdad(iEdad);
            }while (iEdad >99 && iEdad<6);
            persona.add(peersona);
        }
        mostrarPersona(persona);

    }
    public static void mostrarPersona(List<Persona> persona){
        for (int i = 0; i < persona.size(); i++) {
            System.out.printf("%d.- %s%n", i + 1, persona.get(i));
        }
    }
    public static void personaMasJoven(List<Persona> persona){
        for (int i = 0; i < persona.size(); i++) {
        }
    }


    public static boolean checkPhoneNumber(String number){
//        if (number.length()<9||number.length()>9) {
//            return false;
//        }
//        //6,7,9
//        if (!number.matches("[6,7,9][0-9]{8}")){
//            return false;
//        }


        return number.matches("[679][0-9]{8}");
    }
}