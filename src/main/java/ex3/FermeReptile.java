package ex3;

/**
 * Classe représentant la ferme aux reptiles du zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class FermeReptile extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * 0.1;
	}

	@Override
	public boolean accepte(Animal animal) {
		return animal.getType().equals(AnimalType.REPTILE);
	}
}
