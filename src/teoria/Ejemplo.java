package teoria;

public class Ejemplo {
    public static void main(String[] args) {
        calcularmedia1(new int[]{1,2,3,4,5,6,7,8,9});
        calcularmedia2(new int[]{1,2,3,4,5,6,7,8,9});

    }
    public static void calcularmedia1 (int[] numeros){
        double suma =0;
        for (int numero :numeros){
            suma += numero;
        }
        System.out.println("El valor medio es " + suma/numeros.length);
    }
    public static void calcularmedia2 (int... numeros){
        double suma =0;
        for (int numero :numeros){
            suma += numero;
        }
        System.out.println("El valor medio es " + suma/numeros.length);
    }
}
