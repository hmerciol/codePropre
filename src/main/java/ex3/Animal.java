package ex3;

/**
 * Classe représentant un animal dans le zoo.
 * 
 * @author hmerciol
 *
 */
public class Animal {

	/**
	 * Le nom de l'animal.
	 */
	private String nom;
	/**
	 * Le type de l'animal.
	 */
	private AnimalType type;
	/**
	 * Le comportement alimentaire de l'animal.
	 */
	private AnimalComportement comportement;

	/**
	 * Constructeur de la classe Animal.
	 * 
	 * @param nom
	 *            le nom de l'animal
	 * @param type
	 *            le type de l'animal
	 * @param comportement
	 *            le comportement alimentaire de l'animal
	 */
	public Animal(String nom, AnimalType type, AnimalComportement comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * Récupère le nom de l'animal.
	 * 
	 * @return le nom de l'animal
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Récupère le type de l'animal.
	 * 
	 * @return le type de l'animal
	 */
	public AnimalType getType() {
		return type;
	}

	/**
	 * Récupère le comportement alimentaire de l'animal.
	 * 
	 * @return le comportement alimentaire de l'animal
	 */
	public AnimalComportement getComportement() {
		return comportement;
	}

}
