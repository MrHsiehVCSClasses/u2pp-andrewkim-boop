package projectName;

public class Cocaine extends Drugs{
    private int straw;
    public Cocaine(int newAmount, double newPrice, int newStraw){
        super(newAmount, newPrice);
        straw = newStraw;
    }
    public Cocaine(){
        this(5, 99.99, 3);
    }
    public int getStraw(){
        return straw;
    }
    public void setStraw(int newStraw){
        straw = newStraw;
    }
    public String toString(){
        return super.toString() + straw;
    }
    public void strawmessage(){
        System.out.println("Your straw is 3 inches long. That's very large!");
    }
}
