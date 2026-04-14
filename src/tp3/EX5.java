package tp3;

class CompteBancaire {
    private String numero;
    private double solde;

    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde = solde + montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde = solde - montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }


    public void transferer(CompteBancaire c, double montant) {
        if (montant <= solde) {
            this.solde -= montant;
            c.solde += montant;
        } else {
            System.out.println("Transfert impossible !");
        }
    }

    public void afficherSolde() {
        System.out.println("Compte " + numero + " : " + solde + " DH");
    }
}

public class EX5 {
	public static void main(String[] args) {

	        CompteBancaire c1 = new CompteBancaire("002", 2000);
	        CompteBancaire c2 = new CompteBancaire("004", 600);

	        c1.afficherSolde();
	        c2.afficherSolde();

	        System.out.println("\nDépôt");
	        c1.deposer(200);
	        c1.afficherSolde();

	        System.out.println("\nRetrait");
	        c1.retirer(300);
	        c1.afficherSolde();

	        System.out.println("\nTransfert");
	        c1.transferer(c2, 400);

	        c1.afficherSolde();
	        c2.afficherSolde();
	    }
	}

