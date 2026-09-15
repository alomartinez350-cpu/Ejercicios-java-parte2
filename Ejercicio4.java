import java.util.Scanner;
//Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division1 = num1 / num2; 
        double division2 = num2 / num1; 

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división " + num1 + " / " + num2 + " = " + division1);
        System.out.println("La división " + num2 + " / " + num1 + " = " + division2);

        
    }
}
