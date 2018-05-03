package tartalyos.fut; // 1
import java.util.Scanner;

import tartalyos.Tarolo;
import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) {
		Tartaly[] tartalyok = new Tartaly[5];  // 1
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < tartalyok.length; i++){
			tartalyok[i] = new Tartaly(scan.nextInt(), scan.nextDouble());
		}
		
		for(Tartaly tartaly : tartalyok){  // 1
			System.out.println(tartaly.toString());
		}
		
		int max = 0;
		for(int i = 1; i < tartalyok.length; i++)  // 1
		{
			if(tartalyok[max].nagyobbNyomas(tartalyok[i])){
				max = i;
			}
		}
		System.out.println(tartalyok[max].toString());
		Tartaly maxTartaly;
		
		

	}

}
