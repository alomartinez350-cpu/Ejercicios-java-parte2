import java.util.Scanner;
//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.Fórmula:C = (F - 32) × 5 / 9

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese  el valor de la temperatura en grados Fahrenheit: ");
        double F = sc.nextDouble();

        double celsius = (F - 32) * 5 / 9;

        System.out.println(F + " grados Fahrenheit son equivalentes a " + celsius + " grados Celsius.");

    }
}

