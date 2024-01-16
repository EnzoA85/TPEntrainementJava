public class Viande extends Aliment{

    private String type;

    public Viande(int datePeremption, String nom, int volume, String type) {
        super(datePeremption, nom, volume);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
        
}
