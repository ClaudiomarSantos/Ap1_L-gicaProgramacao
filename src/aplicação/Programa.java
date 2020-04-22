package aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um numero de Cpf sem os digitos verificadores: (somente os nove primeiros numeros)");
		String cpf = sc.nextLine();

		while (cpf.length() != 9) {
			System.out.println("codigo Inválido");
			System.out.println(
					"digite um numero de Cpf sem os digitos verificadores: (somente os nove primeiros numeros)");
			cpf = sc.nextLine();

		}

		for (int i = 0; i < cpf.length(); i++) {
			if (cpf.charAt(i) != '0' && cpf.charAt(i) != '1' && cpf.charAt(i) != '2' && cpf.charAt(i) != '3'
					&& cpf.charAt(i) != '4' && cpf.charAt(i) != '5' && cpf.charAt(i) != '6' && cpf.charAt(i) != '7'
					&& cpf.charAt(i) != '8' && cpf.charAt(i) != '9') {
				System.out.println("codigo Inválido");
				System.out.println(
						"digite um numero de Cpf sem os digitos verificadores: (somente os nove primeiros numeros)");
				cpf = sc.nextLine();

			}
		}
		System.out.println("menu: ");
		System.out.println("a -  Verificar os digitos verificadores do cpf;" + "\n"
				+ "b - Informações do Desenvolvedor;" + "\n" + "c - sair do algoritimo");
		char escolhaUsuario = sc.next().charAt(0);

		switch (escolhaUsuario) {

		case 'a':

			int digVerificador1 = 0;
			int digVerificador2 = 0;
			int soma1 = 0;
			int soma2 = 0;
			int aux1 = 2;
			int aux2 = 3;

			int[] cpf3 = new int[9];
			cpf3[0] = Integer.parseInt(cpf.substring(0, 1));
			cpf3[1] = Integer.parseInt(cpf.substring(1, 2));
			cpf3[2] = Integer.parseInt(cpf.substring(2, 3));
			cpf3[3] = Integer.parseInt(cpf.substring(3, 4));
			cpf3[4] = Integer.parseInt(cpf.substring(4, 5));
			cpf3[5] = Integer.parseInt(cpf.substring(5, 6));
			cpf3[6] = Integer.parseInt(cpf.substring(6, 7));
			cpf3[7] = Integer.parseInt(cpf.substring(7, 8));
			cpf3[8] = Integer.parseInt(cpf.substring(8, 9));

			for (int i = cpf3.length - 1; i >= 0; i--) {

				soma1 += cpf3[i] * aux1;
				aux1 += 1;

			}
			soma1 = soma1 * 10;

			if (soma1 % 11 == 10) {
				digVerificador1 = 0;
			} else {
				digVerificador1 = soma1 % 11;
			}

			for (int i = cpf3.length - 1; i >= 0; i--) {

				soma2 += cpf3[i] * aux2;
				aux2 += 1;
			}
			soma2 = (soma2 + (digVerificador1 * 2)) * 10;

			if (soma2 % 11 == 10) {
				digVerificador2 = 0;
			} else {
				digVerificador2 = soma2 % 11;
			}

			int digitosFinal = (digVerificador1 * 10) + digVerificador2;

			System.out.println("O número do CPF completo: " + cpf + digitosFinal);

			break;
		case 'b':
			System.out.println("Matricula: 1-2019113434 " + "\n" + "Claudiomar dos Santos Junior");
			break;
		case 'c':
			System.out.println("Fim do Algoritimo!!!!!!!");
			break;

		default:
			break;
		}

	}
}
