import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("*******Bienvenido*******");

		System.out.print("Introduce el número de filas: ");
		int numero = teclado.nextInt();

		System.out.printf("%s%10s", "ID", "Nombre");

		
		int num = 1;
		for (int contador = 0; contador < numero; contador++) {
			
			
			
			System.out.printf("\n%d%8s", num, " Anacleto"  );
			num++;

		}
		teclado.close();
	}

}