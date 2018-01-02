package ex2;

/**
 * Représente un compte bancaire de type compte courant (type=CC)
 * 
 * @author hmerciol
 *
 */
public class CompteCourant extends CompteBancaire {

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Compte Courant
	 * 
	 * @param solde
	 *            représente le solde du compte
	 * @param decouvert
	 *            représente le d�couvert autoris� pour le Compte Courant
	 */
	public CompteCourant(double solde, double decouvert) {
		super("CC", solde, decouvert);
	}

}
