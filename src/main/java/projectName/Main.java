package projectName;
import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {
        Heroin myHeroin = new Heroin();
        Cocaine myCocaine = new Cocaine();
        Weed myWeed = new Weed();
        Scanner myDrug = new Scanner(System.in);
        System.out.println("Choose a drug: Heroin, Cocaine, Weed");
        String Drug = myDrug.nextLine();
        if(Drug != "Heroin" || Drug != "Cocaine" || Drug != "Weed"){
            Drug = "Heroin";
            System.out.println("Because you did not choose the correct drug, we chose for you! You get heroin!!");
        }
        System.out.println("You chose: " + Drug);
        myDrug.close();
        System.out.println("The generic price for " + Drug + " is $99.99");
        System.out.println("We have decided to give you 5 packs of " + Drug);
        if(Drug == "Heroin"){
            myHeroin.death();
        }
        if(Drug == "Cocaine"){
            myCocaine.strawmessage();
        }
        if(Drug == "Weed"){
            myWeed.namesay();
        }
        for(int i = 0; i == 10; i++){
            System.out.println("Don't do drugs!!!");
        }
        }
    }

