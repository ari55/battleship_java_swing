package modele;

public class Coordonnees {
	private short x;
	private short y;

	public Coordonnees(char verticale, int horizontale) {

	}

	public Coordonnees(int x, int y) {
		//super();
		this.x = (short) x;
		this.y = (short) y;
	}

	public short getX() {
		return x;
	}

	public void setX(short x) {
		this.x = x;
	}

	public short getY() {
		return y;
	}

	public void setY(short y) {
		this.y = y;
	}

	
}
