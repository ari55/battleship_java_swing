package modele;

public class Bateau {

	private String nom;
	private int taille;
	private boolean orientation;
	private Coordonnees position;
	private int nbcasestouchees;
	protected int tab[];
	protected int tabTest[];
	protected static int i, j;
	public Bateau(String nom, int taille) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.nbcasestouchees = 0;
		i = 0;
		j = 0;
		tab = new int[taille];
		tabTest = new int[taille];
	}

	public int testPosition(int pos){
		for(int j=0; j < taille; j++){
			if (pos == tab[j]){
				for(int a = 0; a < taille; a++){
					if (pos == tabTest[a]){ 
						j--;
						return 0;
					}
				}
				tabTest[j] = pos;
				j++;
				return 2;
			}
		}
		return 1;
		
	}

	public int getVieInitiale() {

		return this.nbcasestouchees;
	}
	public int[] getPositions(){
		return tab;
	}
	public boolean addTouch(){
	
		nbcasestouchees ++;
		if (nbcasestouchees == taille) return true;
		else return false;
	}
	
	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void incrementerNbCasesToucheess() {
		this.nbcasestouchees++;
	}

	public boolean coule() {
		return this.nbcasestouchees == this.getVieInitiale() ? true : false;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean getOrientation() {
		return this.orientation;
	}

	public Coordonnees getPosition() {
		return this.position;
	}

	void setOrientation(boolean horizontal) {
		this.orientation = horizontal;
	}

	public void setPosition(int pos) {
		if(i < taille)
		{
			tab[i] = pos;
			i++;
		}
		if(i == taille) i = 0;
	}
}
