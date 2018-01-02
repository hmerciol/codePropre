package ex2;

/**
 * Représente un compte bancaire de type livret A (type=LA)
 * 
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param solde
	 *            représente le solde du compte
	 * @param tauxRemuneration
	 *            représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void appliquerRemuAnnuelle() {
		setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
