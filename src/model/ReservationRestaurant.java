package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	public ReservationRestaurant(int jour, int mois,int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String serviceToOrdinal(int numService) {
		return (numService == 1 ? "premier service." : "deuxième service.");
	}
	@Override
	public String toString() {
		return "Le " + getJour() + "/" + getMois() + " : table n°" + numTable + " pour le " + serviceToOrdinal(numService) + "\n"; 
	}

}
