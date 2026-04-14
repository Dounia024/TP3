package tp3;

class Rectangle {
	private double largeur;
	private double hauteur;


public Rectangle(double largeur,double hauteur) {
	this.largeur=largeur;
	this.hauteur=hauteur;
}

public double surface() {
	return largeur * hauteur;
}

public double perimetre() {
	return 2*(largeur + hauteur);
}
}

public class EX2 {
	public static void main(String[] args) {
		Rectangle R = new Rectangle(5, 3);

	    System.out.println("Surface = " + R.surface());
	    System.out.println("Périmètre = " + R.perimetre());
	}

}
