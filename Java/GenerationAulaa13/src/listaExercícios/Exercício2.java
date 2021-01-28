package listaExercícios;

import java.util.Scanner;

//2. Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Exercício2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float numero, contador, numeroPar = 0, numeroImpar = 0;

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("\nDigite um número: ");
			numero = ler.nextFloat();
			if (numero % 2 == 0) {
				numeroPar++;
			} else {
				numeroImpar++;
			}

		}
		System.out.println("\nExistem " + numeroPar + " número(s) Par(es) e " + numeroImpar + " número(s) Ímpar(es).");
	}

}
