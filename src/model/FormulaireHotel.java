package model;

public class FormulaireHotel extends Formulaire {
	private int nombre_lits_simple;
	private int nombre_lits_double;

	public FormulaireHotel(int jour, int mois,int nombre_lits_simple, int nombre_lits_double) {
		super(jour, mois);
		this.nombre_lits_simple = nombre_lits_simple;
		this.nombre_lits_double = nombre_lits_double;
	}

}
