import java.util.Scanner;
//Realizar un programa que reciba una cantidad de minutos y muestre por pantalla a cuántas horas y minutos corresponde.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;      
        int restoMinutos = minutos % 60; 
        System.out.println(minutos + " minutos son equivalentes a " + horas + " horas y " + restoMinutos + " minutos.");

        
    }
}
