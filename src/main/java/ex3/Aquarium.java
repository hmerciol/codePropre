package ex3;

/**
 * Classe représentant l'aquarium du zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class Aquarium extends ZoneZoo {

	/**
	 * Constructeur de la zone.
	 */
	public Aquarium() {
		super(0.2);
	}

	@Override
	public boolean accepte(Animal animal) {
		return animal.getType().equals(AnimalType.POISSON);
	}
}
