package main;

import sansoptional.Arbre;

public class MainSansOptional {

	public static void main(String[] args) {
		Arbre<String> arbre = new Arbre("n");
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter("a");
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter("d");
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter("r");
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter("b");
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter("k");
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		System.out.println(arbre.existe("a"));
		System.out.println(arbre.existe("o"));
		System.out.println(arbre.existe("n"));
		System.out.println(arbre.existe("k"));
	}

}
