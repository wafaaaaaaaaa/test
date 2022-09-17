package main;

import avecoptional.ArbreBinaireAvecOptional;

public class MainAvecOptional {

	public static void main(String[] args) {
		ArbreBinaireAvecOptional<Integer> arbre = new ArbreBinaireAvecOptional(12);
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter(6);
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter(6);
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter(8);
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter(16);
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		arbre.ajouter(20);
		System.out.println(arbre);
		System.out.println(arbre.nombreFeuilles());
		System.out.println(arbre.existe(20));
		System.out.println(arbre.existe(22));
		System.out.println(arbre.existe(4));
		System.out.println(arbre.existe(6));
	}

}
