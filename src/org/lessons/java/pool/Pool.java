package org.lessons.java.pool;

import java.util.Scanner;

public class Pool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int students;
		int linux;
		int windows;
		int mac;
		int totalVotes;
		boolean abstain = false;

		Scanner s = new Scanner(System.in);

		// intro
		System.out.println("Questo è un semplice sondaggio.\n"
				+ "Vogliamo sapere le prefereze dei tuoi studenti sui tre sistemi operativi più famosi.\n"
				+ "Un voto a studente tra Linux, Windows e Mac OS.");
		// inserire il numero di studenti
		do {
			System.out.print("Quanti studenti hai? ");
			students = s.nextInt();

			// inserire il numero di studenti che usano Linux
			System.out.print("Quanti studenti usano Linux? ");
			linux = s.nextInt();

			// inserire il numero di studenti che usano windows
			System.out.print("Quanti studenti usano Windows? ");
			windows = s.nextInt();

			// inserire il numero di studenti che usano mac
			System.out.print("Quanti studenti usano Mac OS? ");
			mac = s.nextInt();
			totalVotes = linux + windows + mac;

			// controllo voti <= agli studenti
			if (students < totalVotes) {
				System.out.println("ATTENZIONE!!! Hai il numero di voti è superiore al numero di studenti");
			
			}

		} while (students < totalVotes); // ripete se hai troppi voti
		s.close();

		// avviso se i voti sono inferiori agli studenti
		if (totalVotes < students) {
			System.out.println("ATTENZIONE NON TUTTI HANNO VOTATO");
			abstain = true;
		}

		System.out.println("Ecco i risultati, i tuoi studenti sono: " + students + ", i votanti sono " + totalVotes);
		System.out.println("Di " + totalVotes + " voti " + linux + " sono per Linux, prescisamente il "
				+ ((linux * 1.0 / totalVotes) * 100) + "% dei votanti, o il "+((linux * 1.0 / students) * 100)+"% degli studenti");
		System.out.println("Di " + totalVotes + " voti " + windows + " sono per Windows, prescisamente il "
				+ ((windows * 1.0 / totalVotes) * 100) + "% dei votanti, o il "+((windows * 1.0 / students) * 100)+"% degli studenti");
		System.out.println("Di " + totalVotes + " voti " + mac + " sono per Mac OS, prescisamente il "
				+ ((mac * 1.0 / totalVotes) * 100) + "% dei votanti, o il "+((mac * 1.0 / students) * 100)+"% degli studenti");
	
		if (abstain) {
			System.out.println("Di " + students + " studenti " + (students - totalVotes)
					+ " non hanno votato!!!Prescisamente il " + (((students - totalVotes) * 1.0 / students) * 100) + "% degli studenti");
		}
	}

}
