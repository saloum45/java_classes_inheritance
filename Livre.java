public class Livre extends Document{

    private int nombredepages;

    public int getNombredepages() {
        return this.nombredepages;
    }

    public void setNombredepages(int nombredepages) {
        this.nombredepages = nombredepages;
    }
    public Livre(String auteur, String titre, int reference, int nombredepages) {
        super(auteur, titre, reference);
        this.nombredepages=nombredepages;
    }
    

    public void description(){
        System.out.println("\nLa description du livre");
        System.out.println("{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nnombre de pages : "+this.nombredepages+"\n}");
    }
    
    public String toString(){
        return "livre\n"+"{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nnombre de pages : "+this.nombredepages+"\n}";
    }
}
