package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	@Test
	public void testZoo() {
		Zoo zoo = new Zoo("untel");
		
		assertSame("untel", zoo.getNom());
		assertNotNull(zoo.getZonesZoo());
		assertEquals(4, zoo.getZonesZoo().size());
	}

	@Test
	public void testAddAnimal() {
		Zoo zoo = new Zoo("untel");
		
		zoo.addAnimal(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE));
		
		assertEquals(1, zoo.getZonesZoo().get(0).compterAnimaux());
		assertEquals(1, zoo.getZonesZoo().get(1).compterAnimaux());
		assertEquals(1, zoo.getZonesZoo().get(2).compterAnimaux());
		assertEquals(1, zoo.getZonesZoo().get(3).compterAnimaux());
	}
	
	@Test
	public void testAddAnimalNull() {
		Zoo zoo = new Zoo("untel");
		
		zoo.addAnimal(null);
		
		assertEquals(0, zoo.compterAnimaux());
	}

}
