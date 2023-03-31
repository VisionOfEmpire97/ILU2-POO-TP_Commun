package model;

public abstract class Reservation {
	int mois;
	int jour;
	
	protected Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

}
