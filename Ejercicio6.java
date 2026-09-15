import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("La media de los tres números es: " + media);

        
    }
}
