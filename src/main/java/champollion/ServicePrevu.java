package champollion;

public class ServicePrevu {
    private int volumeCM ; 
    private int volumeTD ; 
    private int volumeTP ; 
    private final Enseignant professeur ; 
    private final UE ue ; 

    public ServicePrevu(int volumeCM, int volumeTD, int volumeTP, Enseignant professeur, UE ue) {
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
        this.professeur = professeur;
        this.ue = ue;
    }
    

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public UE getUe() {
        return ue;
    }
    

    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }

    public void setVolumeTD(int volumeTD) {
        this.volumeTD = volumeTD;
    }

    public void setVolumeTP(int volumeTP) {
        this.volumeTP = volumeTP;
    }

    
    @Override
    public String toString() {
        return "ServicePrevu : " + "volumeCM=" + volumeCM + ", volumeTD=" + volumeTD + ", volumeTP=" + volumeTP ;
    }

    

}
