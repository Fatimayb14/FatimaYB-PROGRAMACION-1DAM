package Unidad3;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Imprimimos los primeros números pares
		
		Scanner teclado = new Scanner (System.in);
		
		
		
		int num=0;
		System.out.println("¿Dime cuántos números pares quieres?");
		
		int numpar = teclado.nextInt();

		
		for(int i=0; i<numpar; i++) {  i++ sería el contador
			
			System.out.print(num + " , ");
			num = num + 2; /*ESTE ES EL NÚMERO QUE SE MUESTRA
			teclado.close();
			
		}
		*/
		
		/*Cambiar bucle while por bucle for*/
		
		Scanner teclado = new Scanner(System.in);
		teclado.close();
		
		System.out.print("Número de fila: ");
		int altura = teclado.nextInt();

		//int anchura = 10;
		System.out.print("Número de columna: ");

		//int altura = 5;
		int anchura = teclado.nextInt();
		for(int contadorFila=0; contadorFila < altura; contadorFila++) {

		
		
		for(int contadorcolumn=0; contadorcolumn<anchura; contadorcolumn++) {
			
			
		System.out.print("@");
		
		
		}
		System.out.println();
		
				
		
			
			
			
		}
		
		

	}

}
