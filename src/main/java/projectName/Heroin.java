package projectName;

public class Heroin extends Drugs{
    private boolean overdose;
    public Heroin(int newAmount, double newPrice, boolean newOverdose){
        super(newAmount, newPrice);
        overdose = newOverdose;
    }
    public Heroin(){
        this(5, 99.99, true);
    }
    public boolean getOverdose(){
        return overdose;
    }
    public void setOverdose(boolean newOverdose){
        overdose = newOverdose;
    }
    public String toString(){
        return super.toString() + overdose;
    }
    public void death(){
        System.out.println("You died of an overdose...");
    }
}
