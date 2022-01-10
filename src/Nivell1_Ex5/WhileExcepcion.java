package Nivell1_Ex5;

import java.util.Scanner;

public class WhileExcepcion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean correcto = false;
		double numero=0;
		
		do {
		
			try {
				
				System.out.println("Introduce un número, otro caracter producirá una Excepcion: ");
				numero = Double.parseDouble(s.nextLine());
				correcto = true;
				
			}catch (Exception e) {
				
				System.out.println("No has introducido un número, vuelve a intentarlo");
				System.out.println("Exception: "+ e.getClass());
				System.out.println("Error "+ e.getMessage());
				
			}
			
					
		}while (correcto == false);
			
		System.out.println("Número correcto");
	}

}
