package Nivell1_Ex1;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Introcude un numero si quieres que el programa funcione,");
			System.out.println("Introduce otro tipo de dato si quieres generar una Excepcion :");
			double numero = Double.parseDouble(s.nextLine());
			System.out.println("Numero "+ numero +" es un número válido");
									
		}catch(Exception e) {
			
			System.out.println("Excepcion generada de tipo: " + e.getClass());
			System.out.println("Error generado: " + e.getMessage() );
		}
		finally {
			System.out.println("Programa terminado.");
		}

	}

}
