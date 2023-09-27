package programacion23;
import java.util.Scanner;
public class ejercicio8 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 8
		        System.out.print("Introduce una letra: ");
		        char letra = scanner.next().charAt(0);
		        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
		            System.out.println("La letra es vocal");
		        } else {
		            System.out.println("La letra no es vocal");
		        }

		    }
		
	}


