package ex3;

public enum AnimalType {
	MAMMIFERE("Mammifère"),REPTILE("Reptile"),POISSON("Poisson");
	
	private String value;

	private AnimalType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
