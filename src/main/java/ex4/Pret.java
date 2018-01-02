package ex4;

import java.util.Date;

/**
 * La classe représentant un prêt.
 * 
 * @author DIGINAMIC
 *
 */
public class Pret {

	/**
	 * La stratégie du prêt.
	 */
	private Strategy strategy;
	/**
	 * Le capital corespondant au prêt.
	 */
	private double capital;
	/**
	 * Le capital restant dû.
	 */
	private double capitalRestantDu;
	/**
	 * Le taux d'intérêts du prêt.
	 */
	private double taux;
	/**
	 * La date de début du prêt.
	 */
	private Date dateDebut;
	/**
	 * La date de fin du prêt.
	 */
	private Date dateFin;

	/**
	 * Constructeur de la classe Pret
	 * 
	 * @param capital
	 *            le capital du prêt
	 * @param taux
	 *            le taux du prêt
	 * @param dateDebut
	 *            la date de début du prêt
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
	 *            le capital du prêt
	 * @param taux
	 *            le taux du prêt
	 * @param dateDebut
	 *            la date de début du prêt
	 * @param dateFin
	 *            la date de fin du prêt
	 */
	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		this(capital, taux, dateDebut);
		this.dateFin = dateFin;
	}

	/**
	 * Constructeur de la classe Pret
	 * 
	 * @param capital
	 *            le capital du prêt
	 * @param capitalRestantDu
	 *            le capital restant dû
	 * @param taux
	 *            le taux du prêt
	 * @param dateDebut
	 *            la date de début du prêt
	 * @param dateFin
	 *            la date de fin du prêt
	 */
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		this(capital, taux, dateDebut, dateFin);
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Récupère la strategie du prêt.
	 * 
	 * @return la strategie du prêt
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * Etabli la strategie du prêt.
	 * 
	 * @param strategy
	 *            la strategie du prêt
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Récupère le capital du prêt.
	 * 
	 * @return le capital du prêt
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Etabli le capital du prêt.
	 * 
	 * @param capital
	 *            le capital du prêt
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * Récupère le capital restant dû.
	 * 
	 * @return le capital restant dû
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/**
	 * Etabli le capital restant dû.
	 * 
	 * @param capitalRestantDu
	 *            le capital restant dû
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Récupère le taux du prêt.
	 * 
	 * @return le taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Etabli le taux du prêt.
	 * 
	 * @param taux
	 *            le taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Récupère la date de début du prêt.
	 * 
	 * @return la date de début du prêt
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Etabli la date de début du prêt.
	 * 
	 * @param dateDebut
	 *            la date de début du prêt
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Récupère la date de fin du prêt.
	 * 
	 * @return la date de fin du prêt
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Etabli la date de fin du prêt.
	 * 
	 * @param dateFin
	 *            la date de fin du prêt
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
