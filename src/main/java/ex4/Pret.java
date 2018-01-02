package ex4;

import java.util.Date;

/**
 * La classe repr�sentant un pr�t.
 * 
 * @author DIGINAMIC
 *
 */
public class Pret {

	/**
	 * La strat�gie du pr�t.
	 */
	private Strategy strategy;
	/**
	 * Le capital corespondant au pr�t.
	 */
	private double capital;
	/**
	 * Le capital restant d�.
	 */
	private double capitalRestantDu;
	/**
	 * Le taux d'int�r�ts du pr�t.
	 */
	private double taux;
	/**
	 * La date de d�but du pr�t.
	 */
	private Date dateDebut;
	/**
	 * La date de fin du pr�t.
	 */
	private Date dateFin;

	/**
	 * Constructeur de la classe Pret
	 * 
	 * @param capital
	 *            le capital du pr�t
	 * @param taux
	 *            le taux du pr�t
	 * @param dateDebut
	 *            la date de d�but du pr�t
	 */
	public Pret(double capital, double taux, Date dateDebut) {
		super();
		this.strategy = new PretATerme();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}

	/**
	 * Constructeur de la classe Pret
	 * 
	 * @param capital
	 *            le capital du pr�t
	 * @param taux
	 *            le taux du pr�t
	 * @param dateDebut
	 *            la date de d�but du pr�t
	 * @param dateFin
	 *            la date de fin du pr�t
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		this(capital, taux, dateDebut);
		this.dateFin = dateFin;
	}

	/**
	 * Constructeur de la classe Pret
	 * 
	 * @param capital
	 *            le capital du pr�t
	 * @param capitalRestantDu
	 *            le capital restant d�
	 * @param taux
	 *            le taux du pr�t
	 * @param dateDebut
	 *            la date de d�but du pr�t
	 * @param dateFin
	 *            la date de fin du pr�t
	 */
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		this(capital, taux, dateDebut, dateFin);
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * R�cup�re la strategie du pr�t.
	 * 
	 * @return la strategie du pr�t
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * Etabli la strategie du pr�t.
	 * 
	 * @param strategy
	 *            la strategie du pr�t
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * R�cup�re le capital du pr�t.
	 * 
	 * @return le capital du pr�t
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Etabli le capital du pr�t.
	 * 
	 * @param capital
	 *            le capital du pr�t
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * R�cup�re le capital restant d�.
	 * 
	 * @return le capital restant d�
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/**
	 * Etabli le capital restant d�.
	 * 
	 * @param capitalRestantDu
	 *            le capital restant d�
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * R�cup�re le taux du pr�t.
	 * 
	 * @return le taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Etabli le taux du pr�t.
	 * 
	 * @param taux
	 *            le taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * R�cup�re la date de d�but du pr�t.
	 * 
	 * @return la date de d�but du pr�t
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Etabli la date de d�but du pr�t.
	 * 
	 * @param dateDebut
	 *            la date de d�but du pr�t
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * R�cup�re la date de fin du pr�t.
	 * 
	 * @return la date de fin du pr�t
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Etabli la date de fin du pr�t.
	 * 
	 * @param dateFin
	 *            la date de fin du pr�t
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
