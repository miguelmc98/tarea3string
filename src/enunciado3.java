import java.util.Scanner;
import java.util.StringTokenizer;

public class enunciado3 {
	/*
	 * Realiza una funci�n que reciba una frase e imprima cada
una de las palabras en una l�nea independiente.
Se considera que las palabras se separan �nicamente
por espacios.
	 */

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
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
