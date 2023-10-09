/********************************************************************************
 *@file ArcadeManagement.java
 *@brief Welcome to A.M.P the best program to let arcade owners handle all of their needs.
 *       Anything from managing workers to checking machine revenue can be done with this program.
 *@author Destiny Hale
 ********************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void delayedPrintln(String printedString,int delayinMS) throws InterruptedException{
        // Method Prints a string and delays the message for a given ammount in milliseconds
        System.out.println(printedString);
        Thread.sleep(delayinMS);

    }
    public static void delayedPrint (String printedString, int delayinMS) throws InterruptedException{
        // Method is the same as DelayedPrintln, but doesn't print a new line
        System.out.print(printedString);
        Thread.sleep(delayinMS);
    }
    public static boolean checkQuit() throws InterruptedException{
        // variable set up
        Scanner user = new Scanner(System.in);
        boolean isQuitting = false;
        String response;

        // Prompt user
        delayedPrintln("If you're done working today type in \"quit\"",3000);

        // if user types quit, end program, otherwise let it continue
        response = user.next();
        if(response.equals("quit")) {
            isQuitting = true;
        }
        if(isQuitting){
            delayedPrintln("Goodbye for now!",3000);
        } else {
            delayedPrintln("Noted",2000);
            Thread.sleep(2000);
        }
        // will set userQuitting variable from main method equal to boolean of the method variable
        return isQuitting;
    }
    public static boolean checkDoneWithMenu() throws InterruptedException{
        // variable set up
        Scanner user = new Scanner(System.in);
        boolean isDone = false;
        String response;

        // Prompt user
        delayedPrintln("If you'd like to return to the main menu type \"back\"",3000);

        // if user types back send them to home screen, otherwise let them continue
        response = user.next();
        if(response.equals("back")) {
            isDone = true;
        }
        if(isDone){
            delayedPrintln("Sending you back to home Screen",3000);
            System.out.println();
        } else {
            delayedPrintln("Okay continue working",2000);
            Thread.sleep(4000);
        }
        // will set doneWithCurrentMenu variable from main method equal to boolean of the method variable
        return isDone;
    }
    public static void main(String[] args) throws InterruptedException{

            boolean userQuit = false;
            boolean doneWithCurrentMenu = false;
            // set up some default settings for arcade
                // General Arcade
            Arcade Arcade1 = new Arcade("FunTown",1340,17000,288000,204000);
                // Employees
            Employees worker1 = new Employees("Alex Smith",232,"Arcade Attendant",17,'B');
            Employees worker2 = new Employees("Lauren Williams",157,"Bartender",20,'A');
            Employees worker3 = new Employees("Derick Anderson",461,"Shift Manager",30,'B');
                // Array for names
                    ArrayList<String> listOfEmployeesNames = new ArrayList<String>();
                    listOfEmployeesNames.add(worker1.fullName);
                    listOfEmployeesNames.add(worker2.fullName);
                    listOfEmployeesNames.add(worker3.fullName);

                 // Array for Employee Objects
                    ArrayList<Employees> listOfEmployees = new ArrayList<Employees>();
                    listOfEmployees.add(worker1);
                    listOfEmployees.add(worker2);
                    listOfEmployees.add(worker3);

            // Machines
        Machine machine1 = new Machine("Pinball",130,15);
        Machine machine2 = new Machine("Air Hockey",200,10);
        Machine machine3 = new Machine("Super Bikes 3",100,30);
        Machine machine4 = new Machine("Big Duck Hunt",90,20);
        Machine machine5 = new Machine("Space invaders",170,10);

            //Array for Machine Names
            ArrayList<String> listOfMachinesNames = new ArrayList<String>();
            listOfMachinesNames.add(machine1.name);
            listOfMachinesNames.add(machine2.name);
            listOfMachinesNames.add(machine3.name);
            listOfMachinesNames.add(machine4.name);
            listOfMachinesNames.add(machine5.name);

        // Array for Machines
                ArrayList<Machine> listOfMachines = new ArrayList<Machine>();
                listOfMachines.add(machine1);
                listOfMachines.add(machine2);
                listOfMachines.add(machine3);
                listOfMachines.add(machine4);
                listOfMachines.add(machine5);




        // introduce program
delayedPrintln("Welcome to A.M.P", 500);
delayedPrintln("Your very own", 700);
delayedPrintln("A rcade",700);
delayedPrintln("M anegment",700);
delayedPrintln("P rogram",700);

        // Pause and add a line for formatting
            System.out.println("");
            Thread.sleep(400);

            while (!userQuit) {
                // Variable set up
                Scanner userinfo = new Scanner(System.in);
                String userAnswer;

                // Prompt User
                delayedPrintln("Please type in which of the following you would like to work with:",1200);
                delayedPrint("General Arcade,",500);
                delayedPrint(" Employees,",500);
                delayedPrintln(" or Machines",500);

                // Get user response
                userAnswer = userinfo.nextLine();

                // Give options to interact with Arcade based on User's choice
                if (userAnswer.equals("General Arcade")) {
                    // Prints information about User's Arcade
                    delayedPrintln("Here's an overview of how the Arcade is doing",700);
                    Arcade1.checkArcadeStatus();
                    Thread.sleep(7000);

                   // Lets users rename arcade
                    delayedPrintln("Would you like to rename your Arcade: Y or N", 1000);
                    userAnswer = userinfo.next();
                    if(userAnswer.equals("Y")) {
                       Thread.sleep(4000);
                        Arcade1.renameArcade();
                    } else {
                        delayedPrintln("Okay",1200);
                    }
                    // Checks if user is done for today
                    userQuit = checkQuit();
                    if(userQuit){
                        break;
                    }
                    System.out.println();


                } else if (userAnswer.equals("Employees")) {
                    // list employees
                    Employees.listCurrentEmployees(listOfEmployeesNames);

                    // Make sure User enters loop
                    doneWithCurrentMenu = false;

                    while(!doneWithCurrentMenu) {
                        // Prompt User
                        delayedPrintln("What would you like to do?", 700);
                        delayedPrintln("Get report on worker or Manage workers", 700);

                        userAnswer = userinfo.nextLine();

                        // Give them options depending on response
                        if (userAnswer.equals("Get report on worker")) {
                            // Prompt User
                            delayedPrintln("Which worker would you like a report on?",700);

                            // List workers
                            Employees.listCurrentEmployees(listOfEmployeesNames);

                            // Find index of worker Name given by user
                            userAnswer = userinfo.nextLine();

                            // Use that index to pull proper worker object from array
                            // Then call getEmployee info
                            int workerIndex = listOfEmployeesNames.indexOf(userAnswer);
                            Employees.getEmployee(listOfEmployees.get(workerIndex));

                           // let user quit program or go back to home screen
                            userQuit = checkQuit();
                            if(userQuit){
                                break;
                            }
                            doneWithCurrentMenu = checkDoneWithMenu();


                        } else if (userAnswer.equals("Manage workers")){
                            double newPay;
                            String newRole;
                            char newRating;

                                // Ask user what worker's information is being edited
                            delayedPrintln("Type the name of the worker who's status you'd like to edit",1200);

                            // Store name and index of relevant worker object
                            String editedWorkerName = userinfo.nextLine();
                            int workerIndex = listOfEmployeesNames.indexOf(editedWorkerName);

                            // Allow user to change pay & print new result
                            delayedPrintln("Would you like to change the pay of " + editedWorkerName,200);
                            delayedPrintln("Y/N",300);
                            userAnswer = userinfo.next();
                            if(userAnswer.equals("Y")){
                                delayedPrintln("Enter new pay",700);
                                newPay = userinfo.nextDouble();
                                delayedPrintln(editedWorkerName + " now makes $" + newPay,1200);
                                System.out.println();

                                // Change actual object
                                listOfEmployees.get(workerIndex).pay = newPay;
                            } else{
                                Thread.sleep(1300);
                                System.out.println();
                            }


                            // Allow user to change role & print new result
                            delayedPrintln("Would you like to change the role of " +  editedWorkerName,200);
                            delayedPrintln("Y/N",300);
                            userAnswer = userinfo.next();

                            if(userAnswer.equals("Y")){
                                delayedPrintln("Enter new role",700);
                                newRole = userinfo.next();
                                delayedPrintln(editedWorkerName + " is now a " + newRole,1200);
                                System.out.println();

                                // Change actual object
                                listOfEmployees.get(workerIndex).role = newRole;
                            } else{
                                Thread.sleep(1300);
                                System.out.println();
                            }

                            // Allow user to change rating & print new result
                            delayedPrintln("Would you like to change the performance rating of " + editedWorkerName,200);
                            delayedPrintln("Y/N",300);

                            userAnswer = userinfo.next();

                            if(userAnswer.equals("Y")){
                                delayedPrintln("Enter new rating",700);
                                newRating = userinfo.next().charAt(0);
                                delayedPrintln(editedWorkerName + "'s their rating is now " + newRating,1200);
                                System.out.println();

                                // Change actual object
                                listOfEmployees.get(workerIndex).performanceRating = newRating;
                            } else{
                                Thread.sleep(1300);
                                System.out.println();
                            }
                            // let user quit program or go back to home screen
                            userQuit = checkQuit();
                            if(userQuit){
                                break;
                            }
                            doneWithCurrentMenu = checkDoneWithMenu();

                        } else {
                            delayedPrintln("Sorry. I don't understand that command",600);
                            System.out.println("");
                            Thread.sleep(1300);
                        }
                    }

                } else if (userAnswer.equals("Machines")) {
                    Machine.listCurrentMachines(listOfMachines);
                    while(!doneWithCurrentMenu) {
                        delayedPrintln("Would you like to check the status of any machines? Y or N", 700);
                        userAnswer = userinfo.next();

                        if (userAnswer.equals("Y")) {
                            delayedPrintln("Which machine do you want information on?", 700);

                            // get Machine name from user and get index of the name from username list
                            userAnswer = userinfo.nextLine();
                            userAnswer = userinfo.nextLine();

                            // Use that index to pull proper machine object from list
                            // Then call checkMachineStatus()
                            int machineIndex = listOfMachinesNames.indexOf(userAnswer);
                            Machine.checkMachineStatus(listOfMachines.get(machineIndex));

                            System.out.println();
                                // Let user quit or return to main menu
                            userQuit = checkQuit();
                            if (userQuit) {
                                break;
                            }
                            doneWithCurrentMenu = checkDoneWithMenu();

                        } else {
                            // Let user quit or return to main menu
                            userQuit = checkQuit();
                            if (userQuit) {
                                break;
                            }
                            doneWithCurrentMenu = checkDoneWithMenu();
                        }
                    }
                } else {
                    delayedPrintln("Sorry. I don't understand that command",600);
                    System.out.println("");
                    Thread.sleep(1300);
                }
            }


        }
    }
