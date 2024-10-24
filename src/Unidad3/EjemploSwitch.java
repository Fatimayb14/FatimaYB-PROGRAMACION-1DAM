package Unidad3;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿¿Dime qué deseas hacer??");
		
		System.out.println("Introduce un numero: ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Introduce otro numero: ");
		int numero2 = teclado.nextInt();
		
		int resultado = numero1+numero2;
		System.out.printf("%d %s %d %s %d", numero1, "+", numero2, "=", resultado);
		
		/*System.out.println("Introduce un numero:");
		int numero1= teclado.nextInt();
		System.out.println("Introduce otro numero:");
		int numero2=teclado.nextInt();
		
	
		int  resultado= numero1 + numero2;
		System.out.println("EL resultado de la suma es : ");
		
		
	
		int opcion1;teclado.nextInt();
		switch(opcion1) {
		case 1: System.out.println("Has elegido sumar.");
			int resultado = numero1+numero2;
			System.out.println("La suma es: "+resultado);
			break;*/

			
			
		}
		

	}


