package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AquariumTest {

	@Test
	public void testAccepte() {
		Aquarium zone = new Aquarium();
		
		assertFalse(zone.accepte(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE)));
		assertFalse(zone.accepte(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE)));
		assertTrue(zone.accepte(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE)));
		assertFalse(zone.accepte(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE)));
	}

	@Test
	public void testAddAnimal() {
		Aquarium zone = new Aquarium();
		
		zone.addAnimal(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE));
		
		assertEquals(1, zone.compterAnimaux());
	}

	@Test
	public void testCalculerKgsNourritureParJour() {
		Aquarium zone = new Aquarium();
		
		zone.addAnimal(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE));

		assertTrue(zone.calculerKgsNourritureParJour()==0.2);
	}

}
