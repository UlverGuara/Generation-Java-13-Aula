package listaExercícios;

import java.util.Scanner;

/*5. Crie um programa que leia um número do teclado até que encontre um número igual a zero.
*No final, mostre a soma dos números digitados.(DO...WHILE)*/

public class Exercício5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;

		do {
			System.out.println("Digite um número inteiro: ");
			numero = ler.nextInt();

			soma = soma + numero;

		} while (numero != 0);

		System.out.println("\nA soma desses números é: " + soma + ".");

	}

}
