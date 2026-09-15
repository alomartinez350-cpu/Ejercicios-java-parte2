import java.util.Scanner;
//Un vendedor recibe un sueldo base más un 10% de comisión por sus ventas. El vendedor desea saber: Cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes.Cuánto recibirá en total durante el mes, considerando su sueldo base y las comisiones.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el sueldo base: ");
        double sueldoBase = sc.nextDouble();

        System.out.print("Ingresa el monto de la primera venta: ");
        double venta1 = sc.nextDouble();

        System.out.print("Ingresa el monto de la segunda venta: ");
        double venta2 = sc.nextDouble();

        System.out.print("Ingresa el monto de la tercera venta: ");
        double venta3 = sc.nextDouble();


        double totalVentas = venta1 + venta2 + venta3;
        double comision = totalVentas * 0.10;

        double sueldoTotal = sueldoBase + comision;

      
        System.out.println("El vendedor recibirá por comisiones: $" + comision);
        System.out.println("El sueldo total del mes es: $" + sueldoTotal);

        
    }
}
