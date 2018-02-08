import java.util.Scanner;
/*
 * Cadena espejo. Crea un programa que reciba una
cadena de caracteres y la devuelva invertida con efecto
espejo, esto es, se concatena a la palabra original su
inversa, compartiendo la última letra, que hará de
espejo, por lo que la palabra obtenida se lee igual hacia
adelante que hacia atrás. Por ejemplo, al introducir
“teclado” devolverá “tecladodalcet” y al introducir “goma”
devolverá “gomamog”
 */
public class enunciado4 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		
		//pedir cadena
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir cadena : ");
		 String cadena = sc.nextLine();
		
		//darle la vuelta -->cadena2
		 StringBuilder cadena2 =new StringBuilder(cadena);
			cadena2.reverse();
			String inversa = cadena2.toString();
	
		//concatenar cadena1 y cadena2(desde la posicion 1 no la 0)
		
			
			System.out.println( cadena + cadena2.substring(1, cadena2.length()));
		//recordar cadena2.substring(1,cadena2.length();
	}

}
