public class Riz extends Aliment{
    
    private int tempsCuisson;

    public Riz(int datePeremption, String nom, int volume, int tempsCuisson) {
        super(datePeremption, nom, volume);
        this.tempsCuisson = tempsCuisson;
    }

    public int getTempsCuisson() {
        return tempsCuisson;
    }

    public void setTempsCuisson(int tempsCuisson) {
        this.tempsCuisson = tempsCuisson;
    }
}
