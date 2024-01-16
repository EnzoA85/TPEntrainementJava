public class Refrigerateur extends Stockage{

    public Refrigerateur(String nom, int volumeMax, int volume) {
        super(nom, volumeMax, volume);
    }
    
    public Boolean peutPlacerAliment(Aliment aliment){
        return aliment.getNom()=="Viande" || aliment.getNom()=="Laitage";
    }
}
