import java.util.Objects;

public class Departement {

    private String nomDepartement;

    public Departement(){}
    public Departement(String nomDepartement){

        this.nomDepartement = nomDepartement;

    }




    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "nomDepartement='" + nomDepartement + '\'' +
                '}';
    }



}
