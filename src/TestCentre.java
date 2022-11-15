public class TestCentre {
    public static void main(String[] args) {
        Centre c = new Centre(2,0);
        Vehicule v = new Vehicule("1234-A-61");
        Vehicule v1 = new Vehicule("1234-A-61");
        v.lecture();
        v1.lecture();
        c.ajoutevehicule(v1);
        c.ajoutevehicule(v);
        c.afficher(c.getVehicules(), c.getNbe());
    }
}
