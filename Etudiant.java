public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String matricule;
    //ligne de commentaire
    // Constructeur par défaut
    public Etudiant() {
    }

    // Constructeur avec paramètres
    public Etudiant(String nom, String prenom, int age, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matricule = matricule;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getMatricule() {
        return matricule;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", matricule='" + matricule + '\'' +
                '}';
    }
}