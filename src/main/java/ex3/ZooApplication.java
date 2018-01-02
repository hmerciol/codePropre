package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Z�bre", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Panth�re", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dor�e", AnimalType.POISSON, AnimalComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Python", AnimalType.REPTILE, AnimalComportement.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}
