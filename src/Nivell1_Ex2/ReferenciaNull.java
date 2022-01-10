package Nivell1_Ex2;

public class ReferenciaNull {
	public static void main(String[] args) {
		Objeto obj1 = new Objeto("pepe");
		System.out.println(obj1);
		obj1.muestraNombre();
		obj1=null;
		
		
		
		try {
			System.out.println(obj1);
			obj1.muestraNombre();
									
		}catch(Exception e) {
			
			System.out.println("Excepcion generada de tipo: " + e.getClass());
			System.out.println("Error generado: " + e.getMessage() );
		}
		finally {
			System.out.println("Programa terminado.");
		}
	}
	
	

}
class Objeto{
	
	private String name= "Objeto";

	public Objeto(String name) {
		
		this.name = name;
	}
	public void muestraNombre() {
		System.out.println("soy "+ this.name);
	}
	
}