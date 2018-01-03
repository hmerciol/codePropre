package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZoneCarnivoreTest {

	@Test
	public void testAccepte() {
		ZoneCarnivore zone = new ZoneCarnivore();

		assertFalse(zone.accepte(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE)));
		assertTrue(zone.accepte(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE)));
		assertFalse(zone.accepte(new Animal("Requin blanc", AnimalType.POISSON, AnimalComportement.CARNIVORE)));
		assertFalse(zone.accepte(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalComportement.CARNIVORE)));
	}

	@Test
	public void testAddAnimal() {
		ZoneCarnivore zone = new ZoneCarnivore();

		zone.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE));

		assertEquals(1, zone.compterAnimaux());
	}

	@Test
	public void testCalculerKgsNourritureParJour() {
		ZoneCarnivore zone = new ZoneCarnivore();

		zone.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, AnimalComportement.CARNIVORE));

		assertTrue(zone.calculerKgsNourritureParJour() == 10);
	}

}
