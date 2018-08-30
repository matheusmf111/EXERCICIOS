public class Treino2 {
	public static void main(String[] args) {
		int vetor[] = {0, 1, 3, 5, 17, 11, 8, 9, 17, 0, 1, 3, 5, 9};
		boolean repetidos = temRepetidos(vetor);
		//System.out.println(repetidos);
		imprimirElementosNaoRepetidosVetor(vetor);
	}
	private static int retornarQtdVezesElementoAparecenoVetor(int[] vetor, int elemento) {
		int cont = 0;
		//verificar se tem algum elemento repetido a partir de j+1
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				cont++;
			}
		}//for
		return cont;
	}
	// EXERCICIO 1: Altere o código  abaixo para só imprimir os elementos repetidos apenas 
	// UMA VEZ
	private static void imprimirElementosNaoRepetidosVetor(int[] vetor) {
		int elemento, cont;
		for(int j= 0; j < vetor.length; j++) {
			elemento = vetor[j];
			cont = retornarQtdVezesElementoAparecenoVetor(vetor, elemento);
			if (cont > 1) {
				System.out.print(elemento + " ");
			}
		}
	}
	// EXERCICIO 2: Implementar um método para retornar o elemento que mais se repete no vetor
	private static int elementoMaisRepetenoVetor(int[] vetor) {
		return 0;
	}
	private static boolean temRepetidos(int[] vetor) {
		int elemento;
		for(int j= 0; j < vetor.length-1; j++) {
			elemento = vetor[j];
			//verificar se tem algum elemento repetido a partir de j+1
			for(int i = j+1; i < vetor.length; i++) {
				if (vetor[i] == elemento) {
					return true;
				}
			}
		}
		return false;
	}
}