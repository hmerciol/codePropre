package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavaneAfricaineTest {

	@Test
	public void testAccepte() {
		SavaneAfricaine zone = new SavaneAfricaine();

		assertTrue(zone.accepte(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE)));
		assertFalse(zone.accepte(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE)));
		assertFalse(zone.accepte(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE)));
		assertFalse(zone.accepte(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE)));
	}

	@Test
	public void testAddAnimal() {
		SavaneAfricaine zone = new SavaneAfricaine();

		zone.addAnimal(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE));

		assertEquals(1, zone.compterAnimaux());
	}

	@Test
	public void testCalculerKgsNourritureParJour() {
		SavaneAfricaine zone = new SavaneAfricaine();

		zone.addAnimal(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE));

		assertTrue(zone.calculerKgsNourritureParJour() == 10);
	}

}
