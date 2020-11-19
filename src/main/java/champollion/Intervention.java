package champollion;
import java.util.* ; 

public class Intervention {
    private Date debut ; 
    private int duree; 
    private boolean annulee = false ; 
    private UE matiere ;
    private Salle lieu ; 

    //Constructeur a faire 

    public Date getDebut() {
        return debut;
    }

    public int getDuree() {
        return duree;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public UE getMatiere() {
        return matiere;
    }

    public Salle getLieu() {
        return lieu;
    }
    
    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setAnnulee(boolean annulee) {
        this.annulee = annulee;
    }

    public void setMatiere(UE matiere) {
        this.matiere = matiere;
    }

    public void setLieu(Salle lieu) {
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "Intervention:" + "debut=" + debut + ", duree=" + duree + ", annulee=" + annulee + ", matiere=" + matiere + ", lieu=" + lieu;
    }
    
    
    
}
