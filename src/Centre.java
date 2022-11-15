public class Centre {
    private int max;
    private int nbe;
    private Vehicule[] vehicules;

    public Centre(int max, int nbe){
        this.max = max;
        this.nbe = nbe;
        vehicules = new Vehicule[max];
    }
    public  int getNbe(){
        return nbe;
    }
    public Vehicule[] getVehicules() {
        return vehicules;
    }
    public int rechercheVehicule(String [] im){
        for (int i = 0; i < vehicules.length; i++) {
            if(vehicules[i] != null && vehicules[i].getMat() == im)return i;
            else return -1;
        }
        return -1;
    }

    public boolean ajoutevehicule(Vehicule v) {
        int n = rechercheVehicule(v.getMat());
        boolean ok = false;
        if (n == -1 && nbe == 0) {
            vehicules[0] = v;
            nbe++;
            ok = true;
        }
        else {
            int i = 0;
            if (n != -1) {
                vehicules[n].setNom(v.getNom());
                vehicules[n].setCin(v.getCin());
                ok = true;
            }
            else {
                while (vehicules[i] != null) i++;
                vehicules[i] = v;
                nbe++;
                ok = true;

            }

        }
        return ok;
    }

    public void afficher(Vehicule [] vehicules, int d ){

        for (int i = 0; i < d; i++) {
            String ch = vehicules[i].toString();
            System.out.println(ch);
        }
    }

    public float fiscale_prix() {
        int i = 0;
        float prix = 0;
        while (vehicules[i] != null && i < nbe) {

            int pf = vehicules[i].getFiscale();
            if (vehicules[i].getCarb() == "essence") {

                if (pf < 8) {
                    prix += 350;
                } else if (pf < 10) {
                    prix += 650;
                } else if (pf<14) {
                    prix += 3000;
                } else {
                    prix += 8000;
                }
            } else {
                if (pf < 8) {
                    prix += 700;
                } else if (pf < 10) {
                    prix += 1500;
                } else if (pf < 14) {
                    prix += 6000;
                } else {
                    prix += 20000;
                }
            }

        }
        return prix;
    }

}
