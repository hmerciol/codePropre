package ex3;

/**
 * Classe représentant la zone affricaine du zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class SavaneAfricaine extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * 10;
	}

	@Override
	public boolean accepte(Animal animal) {
		return (animal.getType().equals(AnimalType.MAMMIFERE)
				&& animal.getComportement().equals(AnimalComportement.HERBIVORE));
	}
}
