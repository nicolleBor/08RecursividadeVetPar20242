package controller;

public class VetorPar {

	public VetorPar() {
		super();
	}
	
	public int vetorPar(int[] vet, int tam) {
		//Condição de Parada
		if(tam == 0) {
			return 0;
		} else {
			//Chamada da Função
			if(vet[tam - 1] %2 == 0) {
				return 1 + vetorPar(vet, tam-1);	
			} else {
				return 0 + vetorPar(vet, tam-1);
			}
		}
	}

}
