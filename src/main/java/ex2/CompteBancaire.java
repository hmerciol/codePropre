package ex2;

/**
 * ReprÃ©sente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/**
	 * decouvert : un dÃ©couvert est autorisÃ© seulement pour les comptes courants
	 */
	private double decouvert;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;

	/**
	 * Constructeur du Compte Bancaire.
	 * 
	 * @param solde
	 *            reprÃ©sente le solde du compte
	 * @param decouvert
	 *            reprÃ©sente le découvert autorisé pour le Compte Courant
	 * @param type
	 *            représente le type du compte
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 *            montant à ajouter
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant au solde
	 * 
	 * @param montant
	 *            montant à débiter
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Applique la rémunération annuelle (n'a d'effet qu'avec le type LivretA)
	 */
	public void appliquerRemuAnnuelle() {
	}

	/**
	 * Getter pour solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            le nouveau solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter pour decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            le nouveau decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Getter pour type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            le nouveau type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
