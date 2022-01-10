package Nivell1_Ex4;

import javax.swing.JOptionPane;

public class MiPropiaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = JOptionPane.showInputDialog("Introduce algo (si no introduces nada generas una excepción): ");
		try {
			examinaPalabra(palabra);
		}catch(LongitudPalabraError e){
			System.out.println("Error. Palabra de 0 letras");
			e.printStackTrace();
		}
	}
	static void examinaPalabra(String palabra) throws LongitudPalabraError{ 
				
		if(palabra.length()==0) {
		
			throw new LongitudPalabraError("La palabra debe contener algún caracter");
			
		}else {		
			
			System.out.println("Correcto");
			
		}
	}
}

class LongitudPalabraError extends Exception{
	
	public LongitudPalabraError(String msj_error) {
		super(msj_error); 
	}
}