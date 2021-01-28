package listaExercícios;

import java.util.Scanner;

//1. Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

public class Exercício1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, divisor;

		for (numero = 1000; numero <= 1999; numero++) {
			System.out.println("Número: " + numero + ".");
			divisor = numero % 11;

			if (divisor == 5) {
				System.out.println("\nO número " + numero + " dividido por 11 resta: " + divisor + "!");
			}
		}
	}

}
