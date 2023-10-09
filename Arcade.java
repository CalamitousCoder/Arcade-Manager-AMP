

import java.util.Scanner;

public class Arcade {
    //instance variables
    String name;
    int monthlyVisitors;
    int monthlyProfit;
    int projectedAnnualRevenue;
    int projectedAnnualProfit;

    public Arcade(String name, int monthlyVisitors, int monthlyProfit, int projectedAnnualRevenue, int projectedAnnualProfit) {
        this.name = name;
        this.monthlyVisitors = monthlyVisitors;
        this.monthlyProfit = monthlyProfit;
        this.projectedAnnualRevenue = projectedAnnualRevenue;
        this.projectedAnnualProfit = projectedAnnualProfit;

    }
    public void checkArcadeStatus(){
        System.out.println("Your Arcade is called " + name);
        System.out.println();
        System.out.println("It receives about " + monthlyVisitors + " visitors a month");
        System.out.println();
        System.out.println(name + " brings in $" + monthlyProfit + " in profit" );
        System.out.println();
        System.out.println("If things stay consistent " + name + " will make $" + projectedAnnualRevenue + " in revenue and $" + projectedAnnualProfit + " in profit");
        System.out.println();


    }
    public void renameArcade() throws InterruptedException{
        Scanner input = new Scanner (System.in);
        System.out.println("Please type in a new name");
        name = input.nextLine();
        Thread.sleep(3000);
        System.out.println("Your Arcade is now named " + name);
        Thread.sleep(3500);
        System.out.println();
    }

}
