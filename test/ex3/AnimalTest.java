package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void testAnimal() {
		Animal animal = new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalComportement.HERBIVORE);

		assertNotNull(animal.getNom());
		assertNotNull(animal.getType());
		assertNotNull(animal.getComportement());
		
		assertSame("Gazelle", animal.getNom());
		assertSame(AnimalType.MAMMIFERE, animal.getType());
		assertSame(AnimalComportement.HERBIVORE, animal.getComportement());
	}

}
