package teoria;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setAlto(10);
        rectangulo1.setAncho(10);
        mostrarCaracteristicas(rectangulo1);
    }
    public static void mostrarCaracteristicas(Rectangulo rectangulo1){
        for (int i = 0; i < rectangulo1(); i++) {
            System.out.printf("%d.- %s%n", i + 1, rectangulo1.get(i));
        }
    }
}
