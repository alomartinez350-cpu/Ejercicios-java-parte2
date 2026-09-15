import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la primera calificación parcial: ");
        double parcial1 = sc.nextDouble();

        System.out.print("Ingresa la segunda calificación parcial: ");
        double parcial2 = sc.nextDouble();

        System.out.print("Ingresa la tercera calificación parcial: ");
        double parcial3 = sc.nextDouble();

        System.out.print("Ingresa la calificación del examen final: ");
        double examenFinal = sc.nextDouble();

        System.out.print("Ingresa la calificación del trabajo final: ");
        double trabajoFinal = sc.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

  
        System.out.println("Promedio de parciales: " + promedioParciales);
        System.out.println("Calificación final: " + calificacionFinal);

       
    }
}
