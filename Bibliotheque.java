import java.util.Arrays;
import java.util.Scanner;

public class Bibliotheque {

    private Document document[];
    private int nombredocuments=0;

    public Bibliotheque(Document document[]){
        this.document=document;
        nombredocuments+=this.document.length;
    }

    public Document[] getDocument() {
        return this.document;
    }

    public void setDocument(Document document[]) {
        this.document= document;
    }

    public int getNombredocuments() {
        return this.nombredocuments;
    }

    public void setNombredocuments(int nombredocuments) {
        this.nombredocuments = nombredocuments;
    }
    //  working well (delate function)
    public void EnleverDocument(String titre1){
        if(TrouverDocument(titre1)==true){
            for(int i=0;i<document.length;i++){
                if(document[i].titre.equals(titre1)){
                    for(int j=i;j<document.length-1;j++){
                        document[i]=document[i+1];
                        i++;
                    }
                    
                }
            }
            document=Arrays.copyOf(document, document.length-1);
            nombredocuments--;
            System.out.println("Suppression faite avec succés !");

        }else{
            System.out.println("Suppression n'est pas faite car document non trouvé  !");
        }
        
    }
    // working well (display function)
    public void ListerDocuments(){
        System.out.println("\nAffichage des documents de la bibliotheques : \n");
        for(int i=0;i<document.length;i++){
            System.out.println("\n"+document[i]);
        }

    }
    // working well (rechearch function)
    public boolean TrouverDocument(String titre1){
        for(int i=0;i<document.length;i++){
            if(this.document[i].titre.equals(titre1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String auteur,titre;
        int reference,nombreplages,nombrepages;
        float duree;
        boolean bonus;
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir le nombre de document que vous voulez enregistrer : ");
        int  nombredocuments= sc.nextInt();
        Document documents[] = new Document [nombredocuments];
        // j'ai essayé de controler la saisie avec un switch qui d'ailleurs fonctionne correctement
        for(int i=0;i<nombredocuments;i++){
            System.out.print("saisissez le numero du type de document à enregistrer [ 1-CD 2-DVD 3-LIVRE ] : ");
            int choix = sc.nextInt();

            while (choix<1 || choix >3){
                System.out.print("le choix fait est inexistant veuillez  ressayer [ 1-CD  2-DVD 3-LIVRE ] :  ");
                choix = sc.nextInt();
            }
        // pour la saisie j'ai utilisé des variables temporaires pour initialiser chaque type de document 
            switch (choix) {
                
                case 1:
                    System.out.print("saisir l'auteur du CD : ");
                    auteur=sc.next();
                    System.out.print("saisir le titre du CD : ");
                    titre=sc.next();
                    System.out.print("saisir la reference du CD : ");
                    reference=sc.nextInt();
                    System.out.print("saisir la duree du CD : ");
                    duree=sc.nextFloat();
                    System.out.print("saisir le nombre de plages du CD : ");
                    nombreplages=sc.nextInt();
                    documents[i]= new CD(auteur, titre, reference, duree, nombreplages);
                    break;
                case 2:
                    System.out.print("saisir l'auteur du DVD : ");
                    auteur=sc.next();
                    System.out.print("saisir le titre du DVD : ");
                    titre=sc.next();
                    System.out.print("saisir la reference du DVD : ");
                    reference=sc.nextInt();
                    System.out.print("saisir la duree du DVD : ");
                    duree=sc.nextFloat();
                    System.out.print("saisir le bonus du DVD (true or false) : ");
                    bonus=sc.nextBoolean();
                    documents[i]= new DVD(auteur, titre, reference, duree, bonus);
                    break;
                case 3:
                    System.out.print("saisir l'auteur du LIVRE : ");
                    auteur=sc.next();
                    System.out.print("saisir le titre du LIVRE : ");
                    titre=sc.next();
                    System.out.print("saisir la reference du LIVRE : ");
                    reference=sc.nextInt();
                    System.out.print("saisir le nombre de pages du LIVRE : ");
                    nombrepages=sc.nextInt();
                    documents[i]= new Livre(auteur, titre, reference, nombrepages);
                    break;
                default:
                    System.out.println("choix inexistant ressayer !");

                break;
            }
            
        }
        // initialisation de la bibliotheque elle reçoit le tableau de documents
        Bibliotheque stic = new Bibliotheque(documents);
        System.out.print("voulez vous supprimer un document taper : oui ou non :  ");
        String sup=sc.next();
        if(sup.equals("oui")){
            for(int i=0;i<2;i++){
                System.out.print("saisissez le titre du document "+(i+1)+" à supprimer : ");
                stic.EnleverDocument(sc.next());
            }

        }

        System.out.print("voulez vous rechercer un document taper : oui ou non :  ");
        String rech=sc.next();
        if(rech.equals("oui")){
            System.out.print("saisissez le titre du document que vous chercher : " );
            if(stic.TrouverDocument(sc.next())==true){
                System.out.print("le titre recherché est existant et se sera affiché dans la liste des document \n" );
            }else{
                System.out.print("le titre recherché est inéxistant \n" );
            }

        }
        System.out.print("voulez vous lister les document taper : oui ou non :  ");
        String list=sc.next();
        if(list.equals("oui")){
            stic.ListerDocuments();
        }
        System.out.println("\nFIN DE PROGRAMME !");
        
    }

    
}
