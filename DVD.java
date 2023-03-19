public class DVD extends Multimedia{

    private boolean bonus;

    public DVD(String auteur, String titre, int reference, float duree, boolean bonus) {
        super(auteur, titre, reference, duree);
        this.bonus=bonus;
        
    }
    public boolean isBonus() {
        return this.bonus;
    }

    public boolean getBonus() {
        return this.bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }
    
    public void description(){
        System.out.println("\nLa description du DVD");
        System.out.println("{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nduree: "+super.duree+"\nbonus : "+this.bonus+"\n}");
    }

    public String toString(){
        return "DVD\n"+"{\n"+"auteur : "+super.auteur+"\ntitre : "+super.titre+"\nreference : "+super.reference+"\nduree : "+super.duree+"\nbonus : "+this.bonus+"\n}";
    }
    
}
