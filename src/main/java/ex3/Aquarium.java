package ex3;

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
