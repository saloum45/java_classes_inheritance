public class Multimedia extends Document{

    protected float duree;

    public Multimedia(String auteur, String titre, int reference, float duree) {
        super(auteur, titre, reference);
        this.duree=duree;
    }

    public float getDuree() {
        return this.duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    

    public void description(){
        System.out.println("\nLa description du multimedia");
        System.out.println("{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nduree: "+this.duree+"\n}");
    }

    public String toString(){
        return "Multimedia\n"+"{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nduree : "+this.duree+"\n}";
    }
}
