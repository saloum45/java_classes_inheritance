public class CD extends Multimedia {
    

    private int nombredeplages;

    public CD(String auteur, String titre, int reference, float duree, int nombredeplages) {
        super(auteur, titre, reference, duree);
        this.nombredeplages=nombredeplages;
    }

    public int getNombredeplages() {
        return this.nombredeplages;
    }

    public void setNombredeplages(int nombredeplages) {
        this.nombredeplages = nombredeplages;
    }

    public void description(){
        System.out.println("\nLa description du CD");
        System.out.println("{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nnombre de plages : "+this.nombredeplages+"\n}");
    }

    public String toString(){
        return "CD\n"+"{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nduree : "+super.duree+"\nnombre de plages : "+this.nombredeplages+"\n}";
    }
}
