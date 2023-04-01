package model;

public class ReservationHotel extends Reservation {
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois,int nbLitsSimples, int nbLitsDoubles, int numChambre) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		this.numChambre = numChambre;
	}

	@Override
	public String toString() {
		 return "Le " + getJour() + "/" + getMois() + " : chambre n°" + numChambre + "possédant " +
				nbLitsSimples + " lits simples et " + nbLitsDoubles + " lits doubles" ;
	}

}
