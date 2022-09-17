package sansoptional;

/**
 * Implantation sommaire d'un arbre binaire de recherche.
 * @author mermetb
 *
 * @param <T>
 */
public class Arbre<T extends Comparable<T>> {
	private  T donnee;
	private Arbre<T> sousArbreGauche;
	private Arbre<T> sousArbreDroit;
	
	/**
	 * Constructeur pour un arbre contenant 1 donnée.
	 * @param valeur La donnée, qui ne peut être null
	 */
	public Arbre(T valeur) {
		assert valeur != null;
		donnee = valeur;
		sousArbreGauche = null;
		sousArbreDroit = null;
	}
	
	/**
	 * Ajout d'une donnée dans un ABR.
	 * @param valeur (non null) à ajouter dans l'arbre
	 */
	public void ajouter(T valeur) {
		assert valeur != null;
		if (donnee.equals(valeur)) {
			return;
		}
		if (valeur.compareTo(donnee) < 0) {
			if (sousArbreGauche != null) {
				sousArbreGauche.ajouter(valeur);
			}
			else {
				sousArbreGauche = new Arbre(valeur);
			}
		}
		else {
			if (sousArbreDroit != null) {
				sousArbreDroit.ajouter(valeur);
			}
			else {
				sousArbreDroit = new Arbre(valeur);
			}	
		}
	}
	
	/**
	 * Méthode permettant de savoir si une valeur est présente dans l'arbre.
	 * @param valeur La valeur recherchée
	 * @return si la valeur est présente dans l'arbre ou pas
	 */
	public boolean existe(T valeur) {
		assert valeur != null;
		boolean trouve;
		if (donnee.equals(valeur)) {
			trouve = true;
		}
		else if (valeur.compareTo(donnee) < 0) {
			if (sousArbreGauche == null) {
				trouve = false;
			} else {
				trouve = sousArbreGauche.existe(valeur);
			}
		} else {
			if (sousArbreDroit == null) {
				trouve = false;
			} else {
				trouve = sousArbreDroit.existe(valeur);
			}			
		}
		return trouve;
	}
	
	/**
	 * Méthode pour savoir si l'arbre est réduit à une feuille ou non.
	 * @return vrai si et seulement si l'arbre est réduit à une feuille
	 */
	public boolean isFeuille() {
		return sousArbreGauche == null && sousArbreDroit == null;
	}
	
	/**
	 * Méthode renvoyant le nombre de feuilles dans l'arbre.
	 * @return le nombre de feuilles
	 */
	public int nombreFeuilles() {
		int resultat = 0;
		if (isFeuille()) {
			resultat = 1;
		}
		else {
			if (sousArbreGauche != null) {
				resultat += sousArbreGauche.nombreFeuilles();
			}
			if (sousArbreDroit != null) {
				resultat += sousArbreDroit.nombreFeuilles();
			}
		}
		return resultat;
	}
	
	private StringBuilder representation(String decalage) {
		StringBuilder resultat = new StringBuilder(decalage);
		resultat.append(donnee.toString());
		resultat.append("\n");
		if (sousArbreGauche == null) {
			resultat.append(decalage + "----\n");
		} else {
			resultat.append(sousArbreGauche.representation(decalage + "  "));
		}
		if (sousArbreDroit == null) {
			resultat.append(decalage + "----\n");
		} else {
			resultat.append(sousArbreDroit.representation(decalage + "  "));
		}
		return resultat;
	}
	
	/**
	 * représentation de l'arbre sous la forme d'une chaîne de caractères. Les nœuds vides
	 * sont représentés par "----".
	 */
	@Override
	public String toString() {
		return representation("").toString();
		
	}
}
