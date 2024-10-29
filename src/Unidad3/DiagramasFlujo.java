package Unidad3;

import java.util.Scanner;

public class DiagramasFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*   //Primer intento
		//Con un for
		
		for(int cont = 0; cont<=5; cont++) {
			System.out.println(cont);
		}
		
		// Con un while
		int cont=0;
		while (cont<=5) {
			
			System.out.println("cont");
			cont++;
		}*/
		/* Con un do-While
		int cont=0;
		do {
			System.out.println(cont);
			cont++;
			
		}while(cont<=5);

	}*/
	
	/////////////////////////////////////////
	
	
/* Segundo diagrama*/
	
	/*No se puede y hacer con un for porque no sabemos el número de vueltas que va a dar el bucle*/
	
	/*Scanner teclado = new Scanner (System.in);
	
	int numero;
	do {
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		
	} while(numero!=0); // != significa distinto de", "numero<>0"
	System.out.println("Fin del programa.");
	teclado.close();
		
	}

////////////////////////////////////////////////////

/* Tercer diagrama*/
		
	int suma= 0;
	
	for(int numero=1; numero<=3; numero++) {
	suma= suma + numero;
	}
	System.out.println("La suma: " + suma);
	}
}


	


