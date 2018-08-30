/*	(1) VERIFICAR SE NO VETOR TEM ELEMENTOS REPETIDOS 
	(2) IMPRIMIR OS ELEMENTOS DO VETOR SEM REPETIÇÃO. 
	(3) ENCONTRAR E VERIFICAR O ELEMENTO QUE MAIS SE REPETE NO VETOR. OBS: (Ver exemplo: 20182_Ex1_Vetor_Maikol.txt. Aba Material Didático -- artigos.)
*/

package lifes;

import java.util.Scanner;

public class life1 {

	// 1ª questao
	public static void main(String[] args) {
		int v[] = new int[10];
		System.out.println("Passe os parametros do vetor: ");
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 10; i++) {
			v[i] = sc.nextInt();
		}

		System.out.println("Vetor tem números repetidos? " + temRepetidos(v));
	}

	private static boolean temRepetidos(int[] v) {
		for (int j = 0; j < v.length - 1; j++) {
			int jelemento = v[j];
			for (int i = j + 1; i < v.length; i++) {
				if (jelemento == v[i])
					return true;
			}
		}
		return false;

	}

	// 2ª questao

	public static void EliminarRepetidos(int[] v) {
		int[] t = new int[v.length];
		int qtd = 0;
		for (int i = 0; i < v.length; i++) {
			boolean existerepetidos = false;
			for (int j = 0; j < qtd; j++) {
				if (t[j] == v[i]) {
					existerepetidos = true;
					break;
				}
			}
			if (!existerepetidos) {
				t[qtd++] = v[i];
			}
		}
		for (int i = 0; i < t.length; i++) {
		System.out.println("Vetor sem repetição: " + "" + i + " = " + t[i]);
		}
	}
}
