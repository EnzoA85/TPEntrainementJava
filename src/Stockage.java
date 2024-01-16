import java.util.ArrayList;

public abstract class Stockage {

    private String nom;
    private int volumeMax;
    private ArrayList<Aliment> listeAliments;
    private int volume;

    public Stockage(String nom, int volumeMax,int volume) {
        this.nom = nom;
        this.volumeMax = volumeMax;
        this.volume = volume;
        this.listeAliments = new ArrayList<Aliment>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public ArrayList<Aliment> getAliment() {
        return listeAliments;
    }

    public void setAliment(ArrayList<Aliment> aliments) {
        listeAliments = aliments;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void retirerAliment(Aliment aliment) throws Exception{
        if(listeAliments.contains(aliment)){
            listeAliments.remove(aliment);
        } else {
            throw new AlimentAbsentException("Aliment manquant");
        }
    }

    public Boolean estPleine(){
        if(volume==volumeMax){
            return true;
        }
        return false;
    }

    public int volumeTotal(){
        return volume;
    }

    public Boolean peutPlacerAliment(Aliment aliment){
        if(aliment.getVolume() > volume){
            return false;
        }
        return true;
    }

    public void ajouterAliment(Aliment aliment) throws Exception{
        if(peutPlacerAliment(aliment)==false){
            throw new StockagePleinException("Stockage plein");
        } else {
            if (aliment.stockage()!=this.nom){
                throw new AlimentIncompatibleException("Aliment incompatible");
            } else {
                listeAliments.add(aliment);
            }
        }
    }
}
