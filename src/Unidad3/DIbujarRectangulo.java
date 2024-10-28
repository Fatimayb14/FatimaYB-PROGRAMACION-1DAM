package Unidad3;

public class DIbujarRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int altura = 3;

		int anchura = 10; /*Por cada una de estas, es una vuelta*/

		int contadorColum = 0;

		int contadorFila = 0;

		while (contadorFila < altura) {

			contadorColum = 0;

			while (contadorColum < anchura) {  /*El que va dando vueltas al bucle hasta que se cumpla la condición*/

				System.out.print("@");

				contadorColum++;

			}

			System.out.println();

			contadorFila++;

		}

	}

}
