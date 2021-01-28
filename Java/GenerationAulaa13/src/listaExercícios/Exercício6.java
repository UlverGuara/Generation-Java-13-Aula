package listaExercícios;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado.
*E no final imprimir a média dos números múltiplos de 3.
*Para sair digitar 0(zero).(DO...WHILE)*/

public class Exercício6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, contador = 0;
		double media, soma = 0;

		do {
			System.out.println("Digite um número inteiro: ");
			numero = ler.nextInt();

			if (numero != 0) {
				if (numero % 3 == 0) {
					contador++;
					soma = soma + numero;
				}
			}

		} while (numero != 0);
		media = soma / contador;
		System.out.println("\nOs numeros multiplo de 3 são: " + contador + ", a soma deles é " + soma
				+ " com a média de " + media + ".");

	}

}
