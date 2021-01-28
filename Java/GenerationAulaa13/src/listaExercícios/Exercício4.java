package listaExerc�cios;

import java.util.Scanner;

/*4. Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
*Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
*e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
*Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
*o n�mero de pessoas calmas; 
*o n�mero de mulheres nervosas; 
*o n�mero de homens agressivos; 
*o n�mero de outros calmos;
*o n�mero de pessoas nervosas com mais de 40 anos; 
*o n�mero de pessoas calmas com menos de 18 anos.*/

public class Exerc�cio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, genero, fatorPsico, totalPessoas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0,
				pessoasNervosas40 = 0, pessoasCalmas18 = 0;
		while (totalPessoas <= 3) {
			System.out.println("\nDigite Idade");
			idade = ler.nextInt();
			while (idade < 0 || idade > 150) {
				System.out.println("\nDigite idade novamente: ");
				idade = ler.nextInt();
			}
			System.out.println("\nEscolha g�nero:");
			System.out.println("\n1 - Feminino:");
			System.out.println("\n2 - Masculino:");
			System.out.println("\n3 - Outros:");
			genero = ler.nextInt();

			while (genero < 1 || genero > 3) {
				System.out.println("OP��O INV�LIDA!!!");
				genero = ler.nextInt();
			}
			System.out.println("\nEscolha fator psicologico:");
			System.out.println("\n1 - Calma(o):");
			System.out.println("\n2 - Nervosa(o):");
			System.out.println("\n3 - Agressiva(o):");
			fatorPsico = ler.nextInt();

			while (fatorPsico < 1 || fatorPsico > 3) {
				System.out.println("OP��O INV�LIDA!!!");
				fatorPsico = ler.nextInt();
			}
			if (fatorPsico == 1) {
				totalPessoas++;
			}
			if (genero == 1 && fatorPsico == 2) {
				mulheresNervosas++;
			}
			if (genero == 2 && fatorPsico == 3) {
				homensAgressivos++;
			}
			if (genero == 3 && fatorPsico == 1) {
				outrosCalmos++;
			}
			if (fatorPsico == 1 && idade < 18) {
				pessoasCalmas18++;
			}
			if (fatorPsico == 2 && idade > 40) {
				pessoasNervosas40++;
			}
		}
		System.out.println("\nTotal de pessoas Calmas: " + totalPessoas + ".");
		System.out.println("\nTotal de Mulheres Nervosas: " + mulheresNervosas + ".");
		System.out.println("\nTotal de Homens Agressivos: " + homensAgressivos + ".");
		System.out.println("\nTotal de Outros Calmes: " + outrosCalmos + ".");
		System.out.println("\nTotal de pessoas Nervosas com mais de 40 anos: " + pessoasNervosas40 + ".");
		System.out.println("\nTotal de pessoas Calmas com menos de 18 anos: " + pessoasCalmas18 + ".");

	}

}
