package ex3;

public enum AnimalComportement {
	CARNIVORE("Carnivore"),HERBIVORE("Herbivore");
	
	private String value;

	private AnimalComportement(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
