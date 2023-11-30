public class Employe {
    private int identifiant;
    private String nom;

    public Employe(){}
    public Employe(int identifiant,String nom){

        this.identifiant = identifiant;
        this.nom = nom;


    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public boolean equals(Object obj){
        if(this==obj)return true;
        if(null==obj)return false;

        if(obj instanceof Employe employe){
            return this.nom.equals(nom)&&this.identifiant==identifiant;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                '}';
    }
}
