package ex1;

import java.util.Date;

/**
 * Classe repr�sentant une entreprise.
 * 
 * @author hmerciol
 *
 */
public class Entreprise {

	/**
	 * Siret de l'entreprise.
	 */
	public int siret;
	/**
	 * Nom de l'entreprise.
	 */
	public String nom;
	/**
	 * Adresse de l'entreprise.
	 */
	public String adresse;
	/**
	 * Date de cr�ation de l'entreprise.
	 */
	public Date dateCreation;

	/**
	 * Constante, capital maximal de l'entreprise traitable par le programme.
	 */
	public static final int capitalMax = 3000000;

	/**
	 * M�thode qui affiche le statut de l'entreprise.
	 */
	public void afficherStatut() {

	}

}
