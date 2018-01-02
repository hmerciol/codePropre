package ex3;

/**
 * Classe représentant la ferme aux reptiles du zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class FermeReptile extends ZoneZoo {

	/**
	 * Constructeur de la zone.
	 */
	public FermeReptile() {
		super(0.1);
	}

	@Override
	public boolean accepte(Animal animal) {
		return animal.getType().equals(AnimalType.REPTILE);
	}
}
