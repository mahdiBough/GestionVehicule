import java.util.Scanner;

public class Vehicule {
    //fixme create getters and setters of :
    // -  setCin  setNom getFiscale
    private String nom ;
    private String cin;
    private String marque;
    private int[] mod;
    private String carb;
    private String eta;
    private int fiscale;
    private String[] mat;

    public Vehicule(String mat){
        this.mat = mat.split("[-\\∕|]");
        mod = new int[3];
    }

    public static String clavier(){
        Scanner in = new Scanner(System.in);
        String ch = in.nextLine();
        return ch;
    }
    public String[]  getMat(){
        return mat;
    }
    public String getNom(){
        return nom;
    }
    public String getCin(){
        return cin;
    }
    public int  getFiscale(){
        return fiscale;
    }
    public void setNom(String nom){
        this.nom = nom ;
    }
    public void setCin(String cin){
        this.cin = cin ;
    }
    public String getCarb(){
        return carb;
    }

    public int[] getMod() {
        return mod;
    }

    public void lecture() {

        System.out.println("enter le nom :");
        nom = clavier();
        System.out.println("enter cin :");
        cin = clavier();
        System.out.println("entrer la marque :");
        marque = clavier();
        System.out.println("enter le modele :");

        String modele = clavier();
        String[] modeleTab = modele.split("[-\\/]");
        try {
            for (int k = 0; k < modeleTab.length; k++) {
                mod[k] = Integer.parseInt(modeleTab[k]);
            }
        } catch (NumberFormatException e) {
            System.out.println("s'il vous plait enter un nombre !");
            modele = clavier();
            modeleTab = modele.split("[-\\/]");

            for (int k = 0; k < modeleTab.length; k++) {
                mod[k] = Integer.parseInt(modeleTab[k]);
            }
        }


        System.out.println("enter le type de carb :");
        carb = clavier();

        System.out.println("enter l'etat du Vehicule :");
        eta = clavier();


    }


    public String toString(){
        return  "le nom :"+ nom
                +"\nle cin :"+ cin
                +"\nla marque :"+ marque
                +"\nle modele :"+mod[0]+"-"+mod[1]+"-"+mod[2]
                +"\nle type de carb :"+carb
                +"\nl'etat du Vehicule :"+eta
                +"\nle matricule :" +mat[0]+"|"+mat[1]+"|"+mat[2];
    }


}
