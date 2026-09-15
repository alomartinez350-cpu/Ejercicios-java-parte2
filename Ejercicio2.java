import java.util.Scanner;
//Calcular el perímetro y el área de un rectángulo dada su base y su altura.

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de la base del rectángulo: ");
        int base = sc.nextInt();

        System.out.print("Ingresa el valor de la altura del rectángulo: ");
        int altura = sc.nextInt();

        int perimetro = 2 * (base + altura);
        int area = base * altura;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

    }
}