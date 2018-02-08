import java.util.Scanner;

public class enunciado5 {
	/*
	 * Escriba un programa que lea un NIF(largo == 9) y compruebe que su letra
es correcta, es decir, la letra introducida por el usuario se corresponde con
la calculada. Algoritmo para el cálculo del NIF:
	 */

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		//pedir dni 
		System.out.print("introducir dni : ");
		 String dni = sc.nextLine();
		
		//separas la parte numerica de la ultima letra
		//String cadena2= DNI.substring(0,DNI:length()-1)
		 String[] letrausuario = {"T", "R","W","A","G", "M", "Y","F","P","D","X","B","N",
					"J","Z","S","Q","V","H","L","C","K","E"}; 
		 String cadena2=dni.substring(0, dni.length()-1);
		
		//convertir cadena2 a int 
		 
		 int num =Integer.parseInt(cadena2);
		
		//obtienela letra del DNI calculandk el resto de ese numero dividido por 23 
		//numero%23 
		
		 num = num % 23;
		
		//comprueba letra calculada con la letra introducida DNi.charAT(DNI.length()-1)
		
		if (dni.substring(dni.length()-1).equals(letrausuario[num])) {
			System.out.println("el dni es correcto: ");
		}
		else {
			System.out.println("el dni es incorrecto: ");
		}
		
		
	}

}
