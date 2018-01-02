package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe repr�sentant le zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class Zoo {

	/**
	 * Nom du zoo.
	 */
	private String nom;
	/**
	 * Les diff�rentes zones pr�sentes dans le zoo.
	 */
	private List<ZoneZoo> zonesZoo;

	/**
	 * Constructeur de la classe zoo.
	 * 
	 * @param nom
	 *            nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		zonesZoo = new ArrayList<>();
		zonesZoo.add(new SavaneAfricaine());
		zonesZoo.add(new ZoneCarnivore());
		zonesZoo.add(new FermeReptile());
		zonesZoo.add(new Aquarium());
	}

	/**
	 * Ajoute un animal dans le zoo.
	 * 
	 * @param animal
	 *            animal � ajouter
	 */
	public void addAnimal(Animal animal) {
		for (ZoneZoo zone : zonesZoo) {
			if (zone.accepte(animal)) {
				zone.addAnimal(animal);
				break;
			}
		}
	}

	/**
	 * Affiche tous les animaux pr�sents dans le zoo.
	 */
	public void afficherListeAnimaux() {
		for (ZoneZoo zone : zonesZoo) {
			zone.afficherListeAnimaux();
		}
	}

	/**
	 * R�cup�re le nom du zoo
	 * 
	 * @return le nom du zoo
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * change le nom du zoo
	 * 
	 * @param nom
	 *            le nouveau nom du zoo
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
