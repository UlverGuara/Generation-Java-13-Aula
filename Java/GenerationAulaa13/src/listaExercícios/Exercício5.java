package listaExerc�cios;

import java.util.Scanner;

/*5. Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
*No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

public class Exerc�cio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;

		do {
			System.out.println("Digite um n�mero inteiro: ");
			numero = ler.nextInt();

			soma = soma + numero;

		} while (numero != 0);

		System.out.println("\nA soma desses n�meros �: " + soma + ".");

	}

}
