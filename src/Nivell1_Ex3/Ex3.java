package Nivell1_Ex3;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {
	
	static ArrayList<Integer> ListaHasta9 = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		for(int i=0; i<10;i++) {
			ListaHasta9.add(i);
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el índice del array de 10 elemenos que quieres ver (0-9):");
		System.out.println("Indice menor que 0 o mayor que 9 generará una Excepcion");
		
		try {
			Integer indice = Integer.parseInt(s.nextLine());
			System.out.println("El índice "+indice+" contiene un "+ListaHasta9.get(indice));
		}catch(IndexOutOfBoundsException ioobe){
			System.out.println(ioobe.getClass());
			System.out.println(ioobe.getMessage());
			System.out.println("El índice introducido es mayor que el tamaño del array");
		}
	}

}
