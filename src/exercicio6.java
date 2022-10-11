
//

public class exercicio6 {
	public static void main(String[] args) {

//	  tipo[] nome.vetor = new tipo [quant.de.posições]
		int[] vetorA = new int[10];// Construtor do vetorA
		int[] vetorB = new int[10];// Construtor do vetorA
		int[] vetorC = new int[10];// Construtor do vetorA

		// Armazenando os valores em cada uma das posições do VetorA

		vetorA[0] = 10;// O número de declarações deve ser o mesmo do da
		vetorA[1] = 20;// quantidade de posições
		vetorA[2] = 30;
		vetorA[3] = 40;// VDA = Primeira variável declarada
		vetorA[4] = 50;// (i+1) = O i representa as posições existentes no 
		vetorA[5] = 60;//vetor, e acrescenta 1 a cada execução					
		vetorA[6] = 70;	
		vetorA[7] = 80;//O TAMANHO de cada vetor é determinado pela quantidade
		vetorA[8] = 90;//de elementos de um vetor
		vetorA[9] = 100;//

		// Armazenando os valores em cada uma das posições do VetorB

		// O número de declarações deve ser o mesmo do da
		// quantidade de posições
		
		vetorB[0] = 10;
		vetorB[1] = 20;
		vetorB[2] = 30; 
		vetorB[3] = 40; 
		vetorB[4] = 50;
		vetorB[5] = 60; // VDB = Segunda variável declarada
		vetorB[6] = 70;
		vetorB[7] = 80;
		vetorB[8] = 90;
		vetorB[9] = 100;

//	for(tipo var=0;i<nomeVDA.length;var++) 
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("O " + (i + 1) + "° valor do vetor A é:");
		}
		System.out.println();

//	for(tipo var=0;i<nomeVDB.length;var++) 
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("O " + (i + 1) + "° valor do vetor B é:");
		}
		System.out.println();

//for(tipo var=V.inicial;i<nomeVDA.length;var++) 

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("O " + (i + 1) + "° valor do vetor C é:");
		}
		System.out.println();
	}

}
