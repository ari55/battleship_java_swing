package modele;

public class Case {
	private Bateau bateau;
	private boolean caseEstTouchee;

	public Case() {
		this.bateau = null;
	}

	public Case(Bateau bateau) {
		if (bateau == null) {
			throw new NullPointerException();
		}

		this.bateau = bateau;
	}

	public boolean caseEstVide() {
		return bateau == null ? true : false;
	}
	
	public boolean estTouchee()
	{
		return this.caseEstTouchee;
	}

	public Bateau toucher() {

		if (this.bateau != null && this.caseEstTouchee == false) {
			this.bateau.incrementerNbCasesToucheess();
			this.caseEstTouchee = true;
			return this.bateau;
		} else if (this.caseEstTouchee == false) {
			this.caseEstTouchee = true;
		}
		return null;
	}

	public Bateau getBateau() {
		return this.bateau;
	}

	public void removeBateau() {
		bateau = null;
	}

}
