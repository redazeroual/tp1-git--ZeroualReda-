public class Prof { private String nom;
    private String prenom;
    private int age;
    private String departement;
    private String bureau;

    // Constructeur par défaut
    public Prof() {
    }

    // Constructeur avec paramètres
    public Prof(String nom, String prenom, int age, String departement, String bureau) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.departement = departement;
        this.bureau = bureau;
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

    public String getDepartement() {
        return departement;
    }

    public String getBureau() {
        return bureau;
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

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    @Override
    public String toString() {
        return "Prof{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", departement='" + departement + '\'' +
                ", bureau='" + bureau + '\'' +
                '}';
    }

    
}
