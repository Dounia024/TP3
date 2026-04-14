package tp3;

class Voiture {
    private String marque;
    private int vitesse;

    public Voiture(String marque) {
        this.marque = marque;
        this.vitesse = 0;
    }

    public void accelerer(int v) {
        vitesse = vitesse + v;
        if (vitesse > 260) {
            vitesse = 260;
        }
    }

    public void freiner(int v) {
        vitesse = vitesse - v;
        if (vitesse < 0) {
            vitesse = 0;
        }
    }

    public void afficher() {
        System.out.println("Voiture: " + marque + ", Vitesse: " + vitesse + " km/h");
    }
}

public class EX6 {
	public static void main(String[] args) {

        Voiture v = new Voiture("DACIA");

        v.afficher();

        System.out.println("\nAccélération");
        v.accelerer(120);
        v.afficher();

        v.accelerer(200);
        v.afficher();

        System.out.println("Freinage");
        v.freiner(50);
        v.afficher();

        v.freiner(200);
        v.afficher();
    }
}

