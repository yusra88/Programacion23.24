package programacion23;
import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   // Pedir al usuario tres números y visualizar la multiplicación de ellos en pantalla
        System.out.println("Introduce tres números para multiplicar: ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int multiplicacion = num3 * num4 * num5;
        System.out.println("La multiplicación de " + num3 + ", " + num4 + " y " + num5 + " es " + multiplicacion);


	}

}
