package view;

import controller.VetorPar;

public class Principal {

	public static void main(String[] args) {
		VetorPar vetp = new VetorPar();
		int[] vet = {1,2,3,3,5,4,6,7,9,8};
		int tamanho = vet.length;
		int resultado = vetp.vetorPar(vet, tamanho);
		System.out.println(resultado);
	}

}
