package programacion23;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre: ");
        //  se almacena lo que el usuario ingrese en una variable nombre
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}


