import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employe employe=new Employe(2,"mannai");
        Employe employe1=new Employe(1,"massssannai");
        Departement d1= new Departement("g");
        Departement d = new Departement("ijk");
        AffectationHashMap aff=new AffectationHashMap();

          aff.ajouterEmployeDepartement(employe,d);
          aff.ajouterEmployeDepartement(employe1,d1);
          aff.afficherEmployesEtDepartements();
        aff.afficherEmployes();
        aff.afficherDepartements();
       System.out.println(aff.rechercherEmploye(employe)) ;
        System.out.println(aff.rechercherDepartement(d1)) ;
        
    }

}
