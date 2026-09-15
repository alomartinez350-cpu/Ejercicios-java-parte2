import java.util.Scanner;
//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa. Fórmula:c = √(a² + b²)

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor del cateto a: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el valor del cateto b: ");
        int b = sc.nextInt();

         double c = Math.sqrt((a * a) + (b * b));

        
        System.out.println("La hipotenusa del triángulo rectángulo es: " + c);

        
    }
}
