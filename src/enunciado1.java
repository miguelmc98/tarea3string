import java.util.Scanner;

public class enunciado1 {
	/*
	 * Invertir cadena. Crea un programa en Java que solicite al
usuario la introducción de una cadena de caracteres y
devuelva esta cadena invertida.
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		//solicitar cadena ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir cadena de caracteres: ");
		String palabra = sc.nextLine();
		
		//devolver cadena 
		StringBuilder aux =new StringBuilder(palabra);
		//da la vuelta a la variable aux
		aux.reverse();
		//darv el valor a aux2 de aux
		String aux2 = aux.toString();
		
		//devolver cadena 
		System.out.print("Devolver cadena: " +aux2);
	}

}
