package ex3;

public enum AnimalType {
	MAMMIFERE("Mammif�re"),REPTILE("Reptile"),POISSON("Poisson");
	
	private String value;

	private AnimalType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
