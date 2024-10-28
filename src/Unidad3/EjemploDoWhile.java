package Unidad3;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		int edad;
		
		do {
			System.out.println("Introduce tu edad: ");
			edad = teclado.nextInt();
		
		}while((edad>120));
		System.out.println("Tu edad es: "+edad+" años.");
		
		
		
		

	}

}
