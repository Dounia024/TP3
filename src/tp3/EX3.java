package tp3;


class Etudiant {
    private String cne;
    private double note;

    public Etudiant(String cne, double note) {
        this.cne = cne;
        this.note = note;
    }

    public String toString() {
        return "Etudiant [cne=" + cne + ", note=" + note + "]";
    }

    public boolean estAdmis() {
        return note >= 12;
    }
}

public class EX3 {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("D676188", 17);
        Etudiant e2 = new Etudiant("A223651", 8);

        System.out.println(e1);
        System.out.println("Résultat : " + (e1.estAdmis() ? "Admis" : "Non admis"));

        System.out.println();

        System.out.println(e2);
        System.out.println("Résultat : " + (e2.estAdmis() ? "Admis" : "Non admis"));
    }
}
