import java.util.Scanner;
//Escribir un programa que pregunte al usuario su nombre y luego lo salude.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in); 

        System.out.print("¿Cómo te llamas? "); 
        String nombre = t.nextLine();

        System.out.println("Hola " + nombre + ", ¿cómo estás?");

        
    }
}