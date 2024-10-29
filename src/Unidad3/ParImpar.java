package Unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Codificar un programa que solicite al usuario un número e indica si es par o impar
		
		Scanner teclado = new Scanner(System.in);
		
		
		//Aquí declaramos la variable
		int numero = teclado.nextInt();
		
		//Buscamos los números pares e impares
		if(numero  % 2 == 0) {
			
		// Mostramos por pantalla dicho número
			System.out.println("Este es un número es par: ");
		}else {
			System.out.println("Este número es impar: ");
			teclado.close();
		}
		

	}

}
