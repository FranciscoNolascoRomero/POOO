package Ejercicios.Ecuaciones;

import Ejercicios.Ecuaciones.Ecuacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEcuaciones {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ecuacion> lista = new ArrayList<>();
        Ecuacion ecuacion= new Ecuacion();

        System.out.println("PRIMERA ECUACIÓN");
        System.out.println("Introduce el valor de a");
        double a = sc.nextDouble();
        ecuacion.setA(a);
        System.out.println("Introduce el valor de b");
        double b = sc.nextDouble();
        ecuacion.setB(b);
        System.out.println("Introduce el valor de e");
        double e = sc.nextDouble();
        ecuacion.setE(e);

        System.out.println("SEGUNDA ECUACIÓN");
        System.out.println("Introduce el valor de c");
        double c = sc.nextDouble();
        ecuacion.setC(c);
        System.out.println("Introduce el valor de d");
        double d = sc.nextDouble();
        ecuacion.setD(d);
        System.out.println("Introduce el valor de f");
        double f = sc.nextDouble();
        ecuacion.setF(f);
        lista.add(ecuacion);

        System.out.printf(lista.toString());
    }
}
