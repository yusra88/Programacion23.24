package programacion23;
import java.util.Scanner;
public class Ej7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Calcular el área de un cuadrado
        System.out.println("Introduce el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es " + area);
    }

	}


