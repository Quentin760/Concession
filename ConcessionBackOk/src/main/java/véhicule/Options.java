package véhicule;

public enum Options {
	Climatisation ("Climatisation"), BarreDeToit ("Barre de toit"), VitreElectrique ("Vitre électrique"),
	SiegeEnCuir ("Siège en cuir"), ABS ("ABS"), FreinageDUrgence ("Freinage d'urgence"),
	RadarDeRecul ("Radar de recul"), Regulateur ("Régulateur de vitesse"), Limitateur ("Limitateur de vitesse"),
	GPS ("GPS");
	
	private String option;
	
	private Options (String option) {
		this.option = option;
	}
	
	public String toString() {
		return option;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

}
