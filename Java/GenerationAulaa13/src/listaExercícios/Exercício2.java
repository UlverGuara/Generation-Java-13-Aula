package listaExerc�cios;

import java.util.Scanner;

//2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Exerc�cio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float numero, contador, numeroPar = 0, numeroImpar = 0;

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("\nDigite um n�mero: ");
			numero = ler.nextFloat();
			if (numero % 2 == 0) {
				numeroPar++;
			} else {
				numeroImpar++;
			}

		}
		System.out.println("\nExistem " + numeroPar + " n�mero(s) Par(es) e " + numeroImpar + " n�mero(s) �mpar(es).");
	}

}
