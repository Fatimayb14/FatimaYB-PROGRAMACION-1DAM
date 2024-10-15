
public class EntradaDemo {

	import java.util.Scanner; // Cargamos la clase Scanner para poder hacer uso de ella

	public static void main(String[ ] args) {

	      	Scanner input = new Scanner(System.in); // Declaramos un objeto llamado input de la clase Scanner.

	         System.out.print("Introduzca tu edad en años: ");

	 

	    	double edad= input.nextDouble( );

	        System.out.print("Introduce tu frecuencia cardíaca máxima: ");

	   	double frecuencia = input.nextDouble( );

	   	double fquemar = (frecuencia-edad)*0.65;

	  	

	        System.out.println("Tu frecuencia cardíaca ideal para quemar grasa es " + fquemar );

		}

}


