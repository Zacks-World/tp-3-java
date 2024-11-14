public class Employe {
    String Nom;
    String Dep;
    double Salaire;

    public Employe(String nom, String dep, double salaire) {
        Nom = nom;
        Dep = dep;
        Salaire = salaire;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getDep() {
        return Dep;
    }

    public void setDep(String dep) {
        Dep = dep;
    }

    public double getSalaire() {
        return Salaire;
    }

    public void setSalaire(double salaire) {
        Salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "Nom='" + Nom + '\'' +
                ", Dep='" + Dep + '\'' +
                ", Salaire=" + Salaire +
                '}';
    }
}
