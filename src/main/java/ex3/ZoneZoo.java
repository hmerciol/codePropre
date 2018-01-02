package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant les différentes zones du zoo.
 * 
 * @author hmerciol
 *
 */
public abstract class ZoneZoo {

	/**
	 * Liste des animaux dans la zone.
	 */
	private List<Animal> animaux = new ArrayList<>();

	/**
	 * Ajoute un animal dans la zone.
	 * 
	 * @param animal
	 *            l'animal à ajouter
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche tous les animaux dans la zone.
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal.getNom());
		}
	}

	/**
	 * Compte les animaux dans la zone.
	 * 
	 * @return le nombre d'animaux dans la zone
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Calcul la quantité (en kgs) de nourriture nécessaire pour nourrir les animaux
	 * de la zone.
	 * 
	 * @return la quantité de nourriture
	 */
	public abstract double calculerKgsNourritureParJour();

	/**
	 * Détermine si un animal est recevable dans la zone.
	 * 
	 * @param animal
	 *            l'animal à caser
	 * @return boolean true s'il est recevable
	 */
	public abstract boolean accepte(Animal animal);

}
