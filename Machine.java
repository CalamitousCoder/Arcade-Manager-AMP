import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Machine {
    String name;

    int monthlyRevenue;
    int monthlyCost;
    public Machine(String name, int monthlyRevenue, int monthlyCost){
        this.name = name;
        this.monthlyRevenue = monthlyRevenue;
        this.monthlyCost = monthlyCost;
    }
    public static void listCurrentMachines(ArrayList<Machine> machineList) throws InterruptedException{
        System.out.println();
        // Takes an array from the user and then prints all elements within it
        System.out.println("The current machines are:");
        sleep(1200);
        int i = 0;

        for (Machine machineNames: machineList) {
            System.out.println(machineList.get(i).name);
            i++;
            sleep(1400);
        }
        System.out.println();
    }
    public static void checkMachineStatus(Machine givenMachine) throws InterruptedException{
        // gets worker from user
        // prints out information about that worker
        System.out.println();
        System.out.println("This is " + givenMachine.name);
             Thread.sleep(1400);
          System.out.println();

        System.out.println("It brings in $" + givenMachine.monthlyRevenue + " in monthly revenue");
             Thread.sleep(1400);
        System.out.println("It costs about the arcade $" + givenMachine.monthlyCost + " a month");
            Thread.sleep(1400);
           System.out.println();
        Thread.sleep(3400);
    }

}
