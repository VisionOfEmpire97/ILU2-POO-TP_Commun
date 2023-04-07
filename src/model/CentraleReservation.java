package model;

public class CentraleReservation<E extends EntiteReservable<F>,F extends Formulaire>{
	private EntiteReservable<F>[] tabEntites;
	private int nombreEntite;
	
	public CentraleReservation(EntiteReservable<F>[] entites, int nombreEntite) {
		this.tabEntites = entites;
		this.nombreEntite = nombreEntite;
	}
	
	public int ajouterEntite(EntiteReservable<F> entiteToAdd){
		tabEntites[nombreEntite] = entiteToAdd;
		int idEntite = entiteToAdd.getNumIdentification();
		idEntite++;
		entiteToAdd.setNumIdentification(idEntite);
		return idEntite;
	}
	public int[] donnerPossibilites(F resForm) {
		int[] tab = new int[tabEntites.length];
		for (int i = 0; i < tabEntites.length; i++) {
			if (tabEntites[i].estLibre(resForm)){
				tab[i] = tabEntites[i].getNumIdentification();				
			} else {
				tab[i] = 0;
			}
		}
		return tab;
	}
	public Reservation reserver(int idEntite,F resForm){
		EntiteReservable<F> entiteToBook = tabEntites[idEntite];
		resForm.setIdentificationEntite(entiteToBook.getNumIdentification());
		return entiteToBook.reserver(resForm);
	 }
}
