package teoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Rectangulo> rectangulos = new ArrayList<>();

        System.out.println("NUMERO DE RECTANGULOS QUE QUIERES CREAR");
        int numeroRectangulos = scanner.nextInt();


        for (int i = 0; i < numeroRectangulos; i++) {

            String nombreRectangulo="Rectangulo " + i;
            Rectangulo rectamgulo = new Rectangulo();

            System.out.println(i + 1 +"º RECTANGULO,DIME EL ANCHO ");
            int ancho = scanner.nextInt();
            rectamgulo.setAncho(ancho);

            System.out.println(i + 1 +"º RECTANGULO DIME EL ALTO  ");
            int alto = scanner.nextInt();
            rectamgulo.setAlto(alto);

            rectangulos.add(rectamgulo);

        }
        mostrarCaracteristicas(rectangulos);
    }
    public static void mostrarCaracteristicas(List<Rectangulo> rectangulos){
        for (int i = 0; i < rectangulos.size(); i++) {
        System.out.printf("%d.- %s%n", i + 1, rectangulos.get(i));
    }
    }
}
