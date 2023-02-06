package Ejercicios;

import teoria.Circulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cilindro> cilindros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            //leemos altura chequeamos que esa altura este entre 0,2 y 25,9
            String sAltura;
            double dAltura;
            do {
                System.out.printf("INTRODUCE EL ALTURA%n");
                sAltura = scanner.nextLine();
                dAltura = Double.parseDouble(sAltura);
            }while (!(dAltura > 0.2 && dAltura < 25.9));
            //leemos radio chequeamos que ese radio este entre 0,1 y 9.9
            String sradio;
            double dradio;
            do {
                System.out.printf("INTRODUCE EL RADIO%n");
                sradio = scanner.nextLine();
                dradio = Double.parseDouble(sradio);
            }while (!(dradio > 0.1 && dradio < 9.9));
            Cilindro cilindro= new Cilindro(dradio,dAltura);
            cilindros.add(cilindro);
        }
        //mostramos datos
        cilindros.forEach(System.out::println);
        //mostramos cilindro de mayor volumen
        System.out.println("MAYOR VOLUMEN");
        obtenerCilindroMayorVolumen(cilindros).forEach(System.out::println);
        //mostramos cilindro de menor superficie
        System.out.println("MENOR SUPERFICIE");
        obtenerCilindroMenorSuperficie(cilindros).forEach(System.out::println);

    }
    private static List<Cilindro> obtenerCilindroMayorVolumen(List<Cilindro> cilindros) {
        List<Cilindro> cilindroconMayorVolumen= new ArrayList<>();
        double mayorVolumen = 0;
        for (Cilindro cilindro : cilindros){
            if (cilindro.getVolumen() == mayorVolumen){
                cilindroconMayorVolumen.add(cilindro);
                continue;
            }
            if (cilindro.getVolumen() > mayorVolumen){
                cilindroconMayorVolumen.clear();
                cilindroconMayorVolumen.add(cilindro);
                mayorVolumen = cilindro.getVolumen();
            }
        }
        return cilindroconMayorVolumen;

    }
    private static List<Cilindro> obtenerCilindroMenorSuperficie(List<Cilindro> cilindros) {
        List<Cilindro> cilindroConMenorSuperficie= new ArrayList<>();
        double menorSuperficie = 100;
        for (Cilindro cilindro : cilindros){
            if (cilindro.getSuperficie() == menorSuperficie){
                cilindroConMenorSuperficie.add(cilindro);
                continue;
            }
            if (cilindro.getSuperficie() < menorSuperficie){
                cilindroConMenorSuperficie.clear();
                cilindroConMenorSuperficie.add(cilindro);
                menorSuperficie = cilindro.getSuperficie();
            }
        }
        return cilindroConMenorSuperficie;

    }
}
