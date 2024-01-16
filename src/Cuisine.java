public class Cuisine {
    
    public void placer(Aliment aliment) throws Exception{
        if(Stockage.peutPlacerAliment(aliment)==false){
            throw new StockagePleinException("Stockage plein");
        }
    }
}
