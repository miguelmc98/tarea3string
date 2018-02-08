import java.util.Scanner;
import java.util.StringTokenizer;

public class enunciado3 {
	/*
	 * Realiza una función que reciba una frase e imprima cada
una de las palabras en una línea independiente.
Se considera que las palabras se separan únicamente
por espacios.
	 */

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir frase : ");
		 String frase = sc.nextLine();

		 
		 StringTokenizer str ;
	str = new StringTokenizer (frase);
	System.out.println("la cadena str tiene " + str.countTokens() + " elementos: ");
	while (str.hasMoreTokens())
		 		System.out.println(str.nextToken());
	}

}
