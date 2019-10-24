package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> parana = new ArrayList();
		ArrayList<String> santaCatarina = new ArrayList();
		ArrayList<String> rioGrandeDoSul = new ArrayList();
		ArrayList<String> capitais = new ArrayList();
		
		parana.add("Curitiba");
		parana.add("Maringá");
		parana.add("Londrina");
		parana.add("Pinhais");
		santaCatarina.add("Chapecó");
		santaCatarina.add("Joinvile");
		santaCatarina.add("Blumenau");
		santaCatarina.add("Florianópolis");
		capitais.add("Curitiba");
		capitais.add("Florianópolis");
		capitais.add("Porto Alegre");
		
		String cidade = sc.nextLine();
		
		String estado;
		String capital;
		if (parana.contains(cidade))
			estado = "\"Pertence ao PR\"";
		else if (santaCatarina.contains(cidade))
			estado = "\"Pertence a SC\"";
		else
			estado = "\"Pertence a RS\"";
		
		if (capitais.contains(cidade))
			capital = "\"É capital\"";
		else 
			capital = "\"Não é capital\"";
		
		System.out.print(estado + ", " + capital);
	}

}
