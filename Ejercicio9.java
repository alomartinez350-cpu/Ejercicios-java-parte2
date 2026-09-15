import java.util.Scanner;

public class Ejercicio9 {
    //Una tienda ofrece un descuento del 15% sobre el total de una compra. Escribir un programa que permita calcular cuánto deberá pagar finalmente el cliente.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de la compra: ");
        double totalCompra = sc.nextDouble();

        double descuento = totalCompra * 0.15;
        double totalFinal = totalCompra - descuento;

      
        System.out.println("El descuento aplicado es: $" + descuento);
        System.out.println("El total a pagar con el descuento incluido es: $" + totalFinal);

        
    }
}
