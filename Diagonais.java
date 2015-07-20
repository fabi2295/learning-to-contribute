import java.util.Scanner;

public class diagonais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[5][5];
		int somaDiagonalP, somaDiagonalS, aux,i,j;
		Scanner ler = new Scanner(System.in); 
		
		aux = 4;
		somaDiagonalP = 0;
		somaDiagonalS = 0;
		
		for(i = 0; i < 5; i++){
			for(j = 0; j < 5; j++){
				System.out.printf("Digite um número : ");
				matriz[i][j] = ler.nextInt();
				
				if(i == j){  
					somaDiagonalP += matriz[i][j]; //soma a diagonal principal 
				}
				if(j == aux){
					somaDiagonalS += matriz[i][j]; //soma a diagonal secundaria
					aux = aux - 1;
				}
			}
		}

		//Mostra a matriz 
		for(i = 0; i < 5; i++){
			for(j = 0; j < 5; j++){
				System.out.printf(""+matriz[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("Diagonal principal : "+somaDiagonalP);
		System.out.println("Diagonal secundaria : "+somaDiagonalS);
		
	}

}
