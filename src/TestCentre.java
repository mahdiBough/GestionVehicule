public class TestCentre {
    public static void main(String[] args) {
        Centre c = new Centre(3,0);
        Vehicule v = new Vehicule("1234-A-61");
        Vehicule v1 = new Vehicule("4321-A-16");
        Vehicule v2 = new Vehicule("1234-B-16");
        v.lecture();
        v1.lecture();
        v2.lecture();
        c.ajoutevehicule(v);
        c.ajoutevehicule(v1);
        c.ajoutevehicule(v2);
        c.afficher(c.getVehicules(), c.getNbe());
        c.afficher(c.supprime_vehicules(), c.getNbe());
        for(Vehicule vehicule: c.getVehicules()){
           if(c.fichier_vehicule(vehicule.getMat())==1) System.out.println("vehicule added successfully !");;
        }
        c.afficher(c.getVehicules(), c.getNbe());
        System.out.println("prix total :"+c.fiscale_prix());
    }
}
