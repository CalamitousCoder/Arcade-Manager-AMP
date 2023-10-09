# Arcade-Manager-AMP
My current largest personal project. The program allows a user to manage their arcade’s revenue, machines, and employees. I’m still expanding the program. My next goals are creating a basic UI to make navigation less clunky and allowing users to create new employees & machines via a hashmap.


## How It's Made:

**Concepts used:** objects, methods, and Arraylists.
I seperated this program into handling the player's turn, computer's turn, win conditions and quit condition. 

### Classes

 #### Arcade
 The class has a constructor that takes five parameters (name, monthlyVisitors, monthlyProfit, projectedAnnualRevenue, and projectedAnnualProfit) and 
 initializes the instance variables with these values. The class provides a basic structure to represent an arcade business and allows the user to view its 
 status and rename it interactively. 

  checkArcadeStatus Method:

   This method is used to display information about the arcade's current status.It prints out the name of the arcade, the number of monthly visitors, monthly 
   profit, and projected annual revenue and profit.

  renameArcade Method:

  This method allows the user to rename the arcade. It creates a Scanner object to read user input.  It prompts the user to type in a new name for the arcade 
  and stores the input in the name instance variable. Then it prints a message confirming the new name.

 #### Employees
 This class has instance variables to store details about each employee at the arcade, such as their full name, ID number, role, pay, and performance rating. 
 Additionally, it provides methods to list current employees and get information about a specific employee.

 listCurrentEmployees Method:

  This method takes an ArrayList of strings (workersList) as a parameter and then prints the names of all the employees in the provided list.
 
 getEmployee Method:

  This method takes an Employees object (presumably representing a specific employee) as a parameter.
  It prints detailed information about the given employee, including their full name, ID number, role, pay, and performance rating.

 #### Machine
 This class stores about the machines in the arcade including each machine's name, monthly revenue, and 
 monthly cost. This class provides functionality to manage and display information about individual machines within the arcade.

 listCurrentMachines Method:

  This method takes an ArrayList of Machine objects as a parameter and  prints the names of all the machines in the provided list.

 checkMachineStatus Method:
 
  This method takes a Machine object as a parameter. It prints information about the given machine, including its name, monthly revenue, and monthly cost.



### Main program

The program employs various methods like delayedPrintln and checkQuit to provide a smooth and user-friendly experience. It allows arcade owners to interact with their arcade management data, check on the status of various elements, and make adjustments as needed while providing a structured and interactive user interface. 

## Lessons Learned:

Thread.Sleep for slow text
 If you just use normal print methods, the text spits out instantly which is very unnatural. I created a method that printed anything it was given and then 
 made the thread sleep for a given amount of time. This was incredibly helpful and made this program way more appealing to work with. I also learned that to 
 use Thread.Sleep I need to throw an interrupted exception.

Objects in practice
 I used objects in various ways I hadn't before. I put them in arrays, use it as a parameter, and constantly allowed them to be referenced by the main program. This pushed me to really flesh out my understanding of how objects work.

Classes
 Very similarly objects, while I understood classes in theory making this program really ironed out for me how exactly they work. I feel far more confident 
 using and creating classes and objects. I now feel really to tackle the more nuances parts of classes like inheritance.
 

 
