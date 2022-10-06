package projectName;

public class Weed extends Drugs{
    private String name;
    public Weed(int newAmount, double newPrice, String newName){
        super(newAmount, newPrice);
        name = newName;
    }
    public Weed(){
        this(5, 99.99, "raging homosexuality");
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String toString(){
        return super.toString() + name;
    }
    public void namesay(){
        System.out.println("Your weed name is " + name);
    }
}