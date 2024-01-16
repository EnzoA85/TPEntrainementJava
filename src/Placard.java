public class Placard extends Stockage{

    public Placard(String nom, int volumeMax, int volume) {
        super(nom, volumeMax, volume);
    }

    public Boolean peutPlacerAliment(Aliment aliment){
        return aliment.getNom()=="Farine" || aliment.getNom()=="Riz";
    }
    
}
