package programacion23;
import java.util.Scanner;


public class Ej4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario dos números y visualizar la suma de ellos en pantalla
	        System.out.println("Introduce dos números para sumar: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int suma = num1 + num2;
	        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);

	}

}
