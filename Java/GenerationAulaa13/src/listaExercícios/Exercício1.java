package listaExerc�cios;

import java.util.Scanner;

//1. Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

public class Exerc�cio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, divisor;

		for (numero = 1000; numero <= 1999; numero++) {
			System.out.println("N�mero: " + numero + ".");
			divisor = numero % 11;

			if (divisor == 5) {
				System.out.println("\nO n�mero " + numero + " dividido por 11 resta: " + divisor + "!");
			}
		}
	}

}
