package listaExerc�cios;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
*E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
*Para sair digitar 0(zero).(DO...WHILE)*/

public class Exerc�cio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, contador = 0;
		double media, soma = 0;

		do {
			System.out.println("Digite um n�mero inteiro: ");
			numero = ler.nextInt();

			if (numero != 0) {
				if (numero % 3 == 0) {
					contador++;
					soma = soma + numero;
				}
			}

		} while (numero != 0);
		media = soma / contador;
		System.out.println("\nOs numeros multiplo de 3 s�o: " + contador + ", a soma deles � " + soma
				+ " com a m�dia de " + media + ".");

	}

}
