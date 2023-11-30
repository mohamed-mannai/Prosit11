import java.util.*;

public class AffectationHashMap {

    Map<Employe, Departement> affectations = new HashMap<>();


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("Erreur : employee deja existe dans un autre departement");
        }
        else{
            affectations.put(e,d);
            System.out.println("succes:employe ajoute a la departement");

        }
    }
    public void afficherEmployesEtDepartements(){
         for(Map.Entry<Employe,Departement> entry:affectations.entrySet()){
             System.out.println(entry.getKey()+" : "+entry.getValue());
         }
    }

    public void supprimerEmploye(Employe e){
        affectations.remove(e);
        System.out.println("employee a été supprime avec succes");
    }
    public void  supprimerEmployeEtDepartement(Employe e,Departement d){

       if(affectations.containsKey(e)){
           d=affectations.remove(e);
           System.out.println("Employé " + e.getNom() +  "a été supprimé du département" + d.getNomDepartement());
       }
    }
    public void afficherEmployes(){
        Set<Employe> keys=affectations.keySet();
        Iterator<Employe> iterator=keys.iterator();
        while(iterator.hasNext()){
            System.out.println("key: "+iterator.next());
        }

    }
    public void afficherDepartements(){
        Collection<Departement> values=affectations.values();
        for(Departement d:values){
            System.out.println("value: "+d);
        }

    }
    public boolean rechercherEmploye (Employe e){
        return affectations.containsKey(e);
    }
   public boolean rechercherDepartement (Departement d){
        return affectations.containsValue(d);
   }
   Comparator<Employe> idComparator=new Comparator<Employe>() {
       @Override
       public int compare(Employe e1, Employe e2) {
           return e1.getIdentifiant() -e2.getIdentifiant();
       }
   };
    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe,Departement>  affectations=new TreeMap<>(idComparator);
        return affectations;
    }
}