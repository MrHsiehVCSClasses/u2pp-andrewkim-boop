package projectName;

public class Drugs {
    private int amount;
    private double price;
    public Drugs(){
        amount = 5;
        price = 99.99;
    }
    public Drugs(int newAmount, double newPrice){
        amount = newAmount;
        price = newPrice;
    }
    public int getAmount(){
        return amount;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        if (newPrice > 0){
            price = newPrice;
        }
    }
    public void setAmount(int newAmount){
        if (newAmount > 0){
            amount = newAmount;
        }
    }
}
