package champollion;
import java.util.* ;
public class Enseignant extends Personne {
    private final List<ServicePrevu> servicesPrevu =new LinkedList<>() ;
    private Set<Intervention> myInterventions = new HashSet <> () ;    //hash set = liste sans doublons

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        double total = 0 ; 
        for (ServicePrevu sp : servicesPrevu) {
            total=total + sp.getVolumeCM()*1.5 + sp.getVolumeTD() + sp.getVolumeTP()*0.75 ; 
        }
        
            return (int) Math.round (total) ; 
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        double totalForOneUE = 0 ;
        for (ServicePrevu sp : servicesPrevu) { 
            if (ue.equals(sp.getUe())) {
            totalForOneUE =totalForOneUE + sp.getVolumeCM()*1.5 + sp.getVolumeTD() + sp.getVolumeTP()*0.75 ; 
        }}
        return (int) Math.round (totalForOneUE) ;
          
    }
                


    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        ServicePrevu nouveauService = new ServicePrevu ( volumeCM, volumeTD, volumeTP, this, ue  ) ;
        servicesPrevu.add(nouveauService);
    }

    public int heuresPlanifiées() {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
        /* NE FONCTIONNE PAS... 
        for (Intervention inter : myInterventions) {
            total += inter.getDuree();
        }
         return int total ; */
    }
    
    public boolean enSousService() {
        if (heuresPrevues() < 192) { 
            return true ; 
        }
        else {
            return false;
        }
    }
    
    public void ajouterIntervention(Intervention e ) {
        myInterventions.add(e);
        
    }
}
