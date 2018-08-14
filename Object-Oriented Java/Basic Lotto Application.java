//Dette programmet simulerer en Lottotrekning der brukeren har valg mellom å velge Lotto eller Viking-Lotto

import java.util.*;

class Oblig3 {
	public static void main (String[]args) {
		Scanner inntast = new Scanner(System.in);
		
		System.out.print("Velkommen!\n \nVil du spille Lotto eller Viking-Lotto?\n \nTast inn 1 for Lotto, tast inn 2 for Viking-Lotto: \n");
		
		int lotto = 0;
		int max = 0;
		int input = 0;
		
		while (input==0){ // While-løkken kjører så lenge brukene IKKE taster inn 1 eller 2
			lotto = inntast.nextInt();
			if (lotto==1){
				lotto = 7; max=34; System.out.println ("Du har valgt Lotto\n"); //Velger man Lotto, får man senere 7 tall fra 1-34
				input=1;}
			else if (lotto==2){
				lotto = 6; max=48; System.out.println ("Du har valgt Viking-Lotto\n"); //Velger man Viking-Lotto, får man senere 6 tall fra 1-48
				input=2;}
			else System.out.println("Du må velge enten 1 for Lotto, eller 2 for Viking-Lotto; \n"); //Printes om brukeren taster feil tall
		} //While-løkke med if/else statement slutt. Løkken kjøres så lenge brukeren IKKE taster integers som er 1 eller 2
	
		int [] x = new int [lotto]; //x får verdien til lotto
		int rader = lesInn();
			System.out.println("Du trakk følgende tall:\n");
		for(int i=0;i < rader;i++){
			trekk(x, max); // Sender variabler til metoden trekk, sorter og skrivUt
			sorter(x);
			skrivUt(x);
		}
	}
		static int lesInn()	{ // Leser input fra brukeren og lager x antall rekker
			Scanner inntast=new Scanner(System.in);
			int lesInn;
			System.out.println ("Hvor mange rekker skal du ha?:");
			lesInn = inntast.nextInt();
			return lesInn;	
		}

		static void trekk ( int [] x, int max){ // Genererer tilfedige tall utifra betingelsene til x og max
			Random velg = new Random(); 
			int i,j;
		for(i=0;i < x.length;i++){ //Gjennomgår tabellen element for element
			x[i]=velg.nextInt(max)+1;
			for(j=0; j<i; j++)
				if(x[j]==x[i])
				{
					i--; break; //Gjør at det ikke genereres duplikater av samme tall i samme rekke
				}//if slutt
		}
	}
		
		static void skrivUt ( int [] x){ //Skriver ut de tilfeldige tallene
			
			for(int i=0; i < x.length;i++){
				System.out.print( x [i] + " " );
			}
				System.out.println();
			}
		
		static void sorter(int [] x){ //Sorterer de tilfedige tallene i stigende rekkefølge
			
			int pass, temp;

		    for ( pass=1; pass <= x.length-1; pass++ )
				for(int i=0; i <= x.length-2; i++ )
					if( x[i] > x[i+1] ){
						temp = x[i];
						x[i] = x[i+1];
						x[i+1] = temp;
		} //if slutter
	}		
}


		

		

	
					
			
		


