/*	1) Imprimir todas as ocorrências de elementos repetidos de um vetor. 
	2) Dado dois vetores comparar a diferença de do vetor A - B. Os elementos que estão em A e não estão em B. 
	3) Verificar se um vetor estar ordenado. 
	4) Ordenar um vetor.	*/

package lifes;

public class life2 {

	public static void main(String[] args) {

		int v1[] = { 1, 2, 3, 4, 5, 5, 5, 5, 6, 7 };
		int v2[] = { 12, 6, 11, 1, 5, 9 };

		imprimirIntersecao(v1, v2);
	}

	private static int qtdRepeticoes(int elem, int[] v1) {
		int cont = 0;
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] == elem) {
				cont++;
			}
		}
		return cont;

	}

	private static void imprimirIntersecao(int[] v1, int[] v2) {
		for (int eleV1 : v1) {
			for (int eleV2 : v2) {
				if (eleV1 == eleV2) {
					System.out.println(eleV1 + " ");
					break;
				}
			}
		}
	}

}
