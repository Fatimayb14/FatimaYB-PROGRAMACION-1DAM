package Unidad2;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Escribir un programa que pida tres notas y calcule el promedio y lo muestre por pantalla.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce una nota1: ");
		double nota1 = teclado.nextDouble();
		System.out.print("Introduce otra nota2: ");
		double nota2 = teclado.nextDouble();

		System.out.print("Introduce otra nota3: ");
		double nota3 = teclado.nextDouble();
		double promedio = (nota1 + nota2 + nota3)/3; //Puede ser también un entero.
		System.out.printf("Este es el resultado: %.20f", promedio);

		teclado.close();
	}

}
