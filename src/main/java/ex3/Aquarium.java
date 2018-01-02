package ex3;

/**
 * Classe représentant l'aquarium du zoo.
 * 
 * @author DIGINAMIC
 *
 */
public class Aquarium extends ZoneZoo {
	
	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 0.2;
	}

	@Override
	public boolean accepte(Animal animal) {
		return animal.getType().equals(AnimalType.POISSON);
	}
}
