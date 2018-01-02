package ex3;

/**
 * Enumération des comportements alimentaire possibles de l'animal.
 * 
 * @author hmerciol
 *
 */
public enum AnimalComportement {
	CARNIVORE("Carnivore"), HERBIVORE("Herbivore");

	private String value;

	private AnimalComportement(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
