public class Document {
    protected String auteur;
    protected String titre;
    protected int reference;

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getReference() {
        return this.reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public Document(String auteur, String titre, int reference){
        this.auteur=auteur;
        this.titre=titre;
        this.reference=reference;
    }

    public void description(){
        System.out.println("\nLa description du document");
        System.out.println("{\n"+"auteur : "+this.auteur+"\ntitre : "+this.titre+"\nreference : "+this.reference+"\n}");
    }

    public String toString(){
        return "document\n"+"{\n"+"auteur : "+this.auteur+"\ntitre : "+this.titre+"\nreference : "+this.reference;
    }
    
}