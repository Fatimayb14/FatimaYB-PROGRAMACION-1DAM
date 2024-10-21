package Unidad2;

import java.util.Scanner;

public class Suma {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número cualquiera: ");
		int numero = teclado.nextInt();
		System.out.print("Introduce otro número: ");
		int numero1 = teclado.nextInt();

		int suma = numero + numero1;
		System.out.println("Este es el resultado: " + suma);
		
		
		
		/*int numero2 = 30;
		int suma1 = 0;
		int numero3=20;
		suma1= numero1 + numero2;
		
		System.out.println("La suma es: " + suma1);
		suma1 = suma1 + numero3;
		System.out.println(suma);*/
		
		teclado.close();

	}
	

}
