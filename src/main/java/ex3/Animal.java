package ex3;

public class Animal {
	
	private String nom;
	private AnimalType type;
	private AnimalComportement comportement;
	
	public Animal(String nom, AnimalType type, AnimalComportement comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	public String getNom() {
		return nom;
	}

	public AnimalType getType() {
		return type;
	}

	public AnimalComportement getComportement() {
		return comportement;
	}

}
