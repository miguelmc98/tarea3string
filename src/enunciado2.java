import java.util.Scanner;
import java.util.StringTokenizer;

public class enunciado2 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		/*Encuentra palabra. Dise�a un programa en Java que
		solicite al usuario una cadena en la que buscar� y otra
		que ser� la palabra buscada. El programa indicar�
		cu�ntas veces aparece la segunda cadena en la primera.*/
				
		//Pedir cadena "grande" -> str1
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una cadena");
		String cadena = sc.nextLine();		
		
		//Pedir cadena "peque�a" -> str2
		System.out.println("Introduce una palabra a buscar en la cadena");
		String cadena2 = sc.nextLine();		
		
		//Separa la cadena grande en palabras
		// Comprueba SI cada palabra de str1 es igual a str2
		// Si son iguales contador++
		int contador = 0;
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		while (str.hasMoreTokens()) {
			if(cadena2.equals(str.nextToken()) == true)
				contador++;
		}
	}
}