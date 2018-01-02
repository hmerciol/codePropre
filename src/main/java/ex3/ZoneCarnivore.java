package ex3;

/**
 * Classe représentant la zone des carnivores du zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class ZoneCarnivore extends ZoneZoo {

	/**
	 * Constructeur de la zone.
	 */
	public ZoneCarnivore() {
		super(10);
	}

	@Override
	public boolean accepte(Animal animal) {
		return (animal.getType().equals(AnimalType.MAMMIFERE)
				&& animal.getComportement().equals(AnimalComportement.CARNIVORE));
	}
}
