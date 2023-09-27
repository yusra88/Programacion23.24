package programacion23;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

        // Convertir temperatura de Celsius a Fahrenheit
        System.out.println("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.");

	}

}
