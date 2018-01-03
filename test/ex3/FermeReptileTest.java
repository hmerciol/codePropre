package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FermeReptileTest {

	@Test
	public void testAccepte() {
		FermeReptile zone = new FermeReptile();
		
		assertFalse(zone.accepte(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE)));
		assertFalse(zone.accepte(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE)));
		assertFalse(zone.accepte(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE)));
		assertTrue(zone.accepte(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE)));
	}

	@Test
	public void testAddAnimal() {
		FermeReptile zone = new FermeReptile();
		
		zone.addAnimal(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE));
		
		assertEquals(1, zone.compterAnimaux());
	}

	@Test
	public void testCalculerKgsNourritureParJour() {
		FermeReptile zone = new FermeReptile();

		zone.addAnimal(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE));

		assertTrue(zone.calculerKgsNourritureParJour() == 0.1);
	}

}
