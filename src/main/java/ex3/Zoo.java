package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<ZoneZoo> zonesZoo;
	
	public Zoo(String nom){
		this.nom = nom;
		zonesZoo = new ArrayList<>();
		zonesZoo.add(new SavaneAfricaine());
		zonesZoo.add(new ZoneCarnivore());
		zonesZoo.add(new FermeReptile());
		zonesZoo.add(new Aquarium());
	}

	public void addAnimal(Animal animal){
		for(ZoneZoo zone : zonesZoo) {
			if(zone.accepte(animal)) {
				zone.addAnimal(animal);
				break;
			}
		}
	}
	
	public void afficherListeAnimaux(){
		for(ZoneZoo zone : zonesZoo) {
			zone.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
