import java.util.Scanner;

public class AreaCircunferencia {

	// Declaramos la variable PI.

	static double pi = 3.141592;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que calcule el área y la circunferencia de un círculo
		 * cuyo radio estará almacenado en una variable entera llamada r. Tal vez
		 * necesitas buscar las fórmulas para calcular ambas magnitudes. Comprueba que
		 * el programa funciona correctamente para cualquier valor de r.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserta el valor del radio: ");

		// Declaramos la variable del radio.
		int r = teclado.nextInt();

		// Aquí declaramos la variable del área del círculo y la circunferencia.
		double Ar = pi * (r * r);
		double C = 2 * pi * r;

		// Aquí nos muestra si el programa funciona correctamente para cualquier valor
		// de r.
		System.out.printf("%s%.2f","El área del círculo es: ", Ar);
		System.out.printf("%s%.2f"," La circunferencia del círculo es: ", C);
		teclado.close();

	}

}
