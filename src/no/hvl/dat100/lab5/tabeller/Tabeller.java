package no.hvl.dat100.lab5.tabeller;

import java.util.Iterator;

public class Tabeller {



	// a)
	public static void skrivUt(int[] tabell) {

		// TODO

		for (int j : tabell) {
			System.out.print(j);

		}
		System.out.println();


	}

	// b)
	public static String tilStreng(int[] tabell) {



		if ( tabell == null)
			return "null";
		StringBuilder tabellS = new StringBuilder("[");
		int iMax = tabell.length -1;
		System.out.println(tabell.length);
		if (iMax==-1)
			return "[]";
		for (int i = 0; i < tabell.length; i++) {
			tabellS.append(tabell[i]);
			if(iMax==i) {
				tabellS.append(']');
				return tabellS.toString();
			}

			tabellS.append(",");

		}
		return tabellS.toString();
	}


	// c)
	public static int summer(int[] tabell) {
int sum=0;
//		for (int i = 0; i < tabell.length; i++) {
//
//			sum+=tabell[i];
//		}
//		for (int j : tabell) {
//
//			sum += tabell[j];
//		}

		int i = 0;
		while(i < tabell.length){
			sum+=tabell[i];
			i++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i]==tall){
				return true;
			}
		}
		return false;
	}


	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if(tabell[i]==tall){
				return i;
			}

		}

		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int tmpTabell[]= new int[tabell.length];

		for (int i = tabell.length-1; i >= 0; i--) {
			tmpTabell[i]=tabell[tabell.length-1-i];
		}
	return tmpTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length-1; i++) {

			if (tabell[i]>tabell[i+1]) {
				return false;
			}
		}
		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int i = 0;
		int tabellTmp[] = new int [tabell1.length + tabell2.length];
		for (; i < tabell1.length; i++) {
			tabellTmp[i]=tabell1[i];
		}
		int j = 0;
		for (; i < (tabell1.length+tabell2.length); i++) {
			tabellTmp[i]=tabell2[j];
			j++;
		}
		return tabellTmp;
	}
}
