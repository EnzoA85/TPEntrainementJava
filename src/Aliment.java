public abstract class Aliment implements Perissable{

    protected int datePeremption;
    protected String nom;
    protected int volume;    

    public Aliment(int datePeremption, String nom, int volume) {
        this.datePeremption = datePeremption;
        this.nom = nom;
        this.volume = volume;
    }

    public int getDatePeremption() {
        return datePeremption;
    }
    public void setDatePeremption(int datePeremption) {
        this.datePeremption = datePeremption;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boolean estPerime(int annee) {
        if(annee > 2023){
            return false;
        } return true;
    }

    public String stockage(){
        if (this.nom=="Viande"||this.nom=="Laitage"){
            return "Frigo";
        } else {
            return "Placard";
        }
    }

    @Override
    public String toString() {
        return "Aliment [datePeremption=" + datePeremption + ", nom=" + nom + ", volume=" + volume + "]";
    }
    
}
