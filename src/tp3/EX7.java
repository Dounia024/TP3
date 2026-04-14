package tp3;
import java.util.ArrayList;

class Produit {
    private int id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    public Produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public String toString() {
        return "ID: " + id + " | Nom: " + nom + " | Prix: " + prix + " | Qté: " + quantite;
    }

    public int getId() {
        return id;
    }

    public void modifierProd(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }
}

class GestionProduit {
    private ArrayList<Produit> liste = new ArrayList<>();

    public void ajouterProd(Produit p) {
        liste.add(p);
    }

    public void supprimerProd(int id) {
        liste.removeIf(p -> p.getId() == id);
    }

    public Produit getProduitByID(int id) {
        for (Produit p : liste) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void getAllProduit() {
        for (Produit p : liste) {
            System.out.println(p);
        }
    }
}
public class EX7 {
    public static void main(String[] args) {

        GestionProduit gp = new GestionProduit();

        Produit p1 = new Produit(1, "PC", "Laptop", 8000, 5);
        Produit p2 = new Produit(2, "Souris", "Wireless", 150, 10);

        gp.ajouterProd(p1);
        gp.ajouterProd(p2);

        System.out.println("Tous les produits");
        gp.getAllProduit();

        System.out.println("\nModifier produit");
        Produit p = gp.getProduitByID(1);
        if (p != null) {
            p.modifierProd("PC Gamer", 10000, 3);
        }

        gp.getAllProduit();

        System.out.println("\nSupprimer produit");
        gp.supprimerProd(2);

        gp.getAllProduit();
    }
}