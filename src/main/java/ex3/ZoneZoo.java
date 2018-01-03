package ex3;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe repr�sentant les diff�rentes zones du zoo.
 * 
 * @author hmerciol
 *
 */
public abstract class ZoneZoo {
	
	private static final Logger LOG = LoggerFactory.getLogger(ZoneZoo.class);

	/**
	 * Liste des animaux dans la zone.
	 */
	private List<Animal> animaux;

	/**
	 * Facteur multiplicateur pour le calcul de la nourriture consomm�e par les
	 * animaux dans la zone.
	 */
	private double MultiplicateurNourriture;

	/**
	 * Constructeur de la zone.
	 * 
	 * @param multiplicateurNourriture
	 *            pour le calcul de la nourriture consomm�e
	 */
	public ZoneZoo(double multiplicateurNourriture) {
		animaux = new ArrayList<>();
		this.MultiplicateurNourriture = multiplicateurNourriture;
	}

	/**
	 * Ajoute un animal dans la zone.
	 * 
	 * @param animal
	 *            l'animal � ajouter
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche tous les animaux dans la zone.
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			LOG.info(animal.getNom());
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
	 * Calcul la quantit� (en kgs) de nourriture n�cessaire pour nourrir les animaux
	 * de la zone.
	 * 
	 * @return la quantit� de nourriture
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * MultiplicateurNourriture;
	}

	/**
	 * D�termine si un animal est recevable dans la zone.
	 * 
	 * @param animal
	 *            l'animal � caser
	 * @return boolean true s'il est recevable
	 */
	public abstract boolean accepte(Animal animal);

}
