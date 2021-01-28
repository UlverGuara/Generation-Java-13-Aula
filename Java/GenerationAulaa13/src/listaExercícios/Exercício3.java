package listaExercícios;

import java.util.Scanner;

/*3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
*O programa termina quando idade for =-99. (WHILE)*/

public class Exercício3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, contador = 0, jovem = 0, adulto = 0;

		do {
			System.out.println("\nDigite a sua idade: ");
			idade = ler.nextInt();

			if (idade <= 21) {
				jovem++;
			} else if (idade > 50) {
				adulto++;
			}

			contador++;

		} while (idade != -99);
		{
			System.out.println("\nExistem " + jovem + " pesso(as) com menos de 21 anos e " + adulto
					+ " pessoas com mais de 50 anos.");
		}
	}

}
