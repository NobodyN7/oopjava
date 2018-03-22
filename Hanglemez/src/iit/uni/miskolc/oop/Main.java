package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			MusicDisc[] songs = new MusicDisc[scanner.nextInt()];
			for(int i = 0; i < songs.length; i++){
				System.out.println("Kerem az " + (i+1) + "-edik zene adatait(eloado, cim, hossz) külön külön");
				songs[i] = new MusicDisc(scanner.next(), scanner.next(), scanner.nextInt());
			}
			
			MusicDisc longestDisc = songs[0];
			for(int i = 1; i < songs.length; i++){
				if(longestDisc.LSE(songs[i]) == -1){
					longestDisc = songs[i];
				}
			}
			System.out.println("Leghosszabb zene: " + longestDisc);
			
			String performerin = scanner.next();
			for(MusicDisc song : songs){
				if(song.getPerformer().equalsIgnoreCase(performerin))
					song.toString();
				break;
			}
			scanner.close();
			
		}
}
