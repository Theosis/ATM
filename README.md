# ATM

# Create an ATM Application

Create an application that will simulate an ATM's operations. This will use all your Object-Oriented skills in one big project. Read the documentation below first and plan your work to avoid rewriting it.

Your project must include the following classes or interfaces:

ATM - contains methods to prompt user and receive input from the user. The only class in which the System.out.printtln statements are allowed in is the ATM class. The ATM class must not know any information about the user. It will simply create an Account class and print information from the Account class.

The iATM interface must define the methods that need to be implemented but the interface doesn't actually contain the implementation.

The ATM class will allow the user to make a deposit, make a withdraw or check the balance.The ATM class must also display the results of any transaction or inquiry.

Account class - contains the account number, user name, balance,PIN. Deposits and withdraws must update the balance.

The main method will simply call the ATM class and the  ATM class will  interact with the user and with the Account class. There should be MINIMAL logic in the main method.

The screen should print out just like the ATMs you've used in real life. It should prompt you to enter an account number (since we can't insert the card) and enter your PIN.

The ATM class should validate the PIN and the Account Number. If the user enters the incorrect PIN three times the ATM should lock the user out so they can't log in with the correct PIN on the fourth try. Simply hardcode three account numbers and their PINs and use if statements to ensure the user has entered the correct PIN. Later we may move these to a database.

Create an abstract class called Receipt. This class must contain one method which prints the receipt in the appropriate format.  Because it's an abstract class the method shall include the method definition. Make the method take parameters for the date, name, and any other variables needed to create the receipt.

The TransactionSummary class should print the receipt in a nice format like we did during the first two days of class (https://canvas.instructure.com/courses/1154373/assignments/6260907?module_item_id=12584748).

Arrays are fine but consider using ArrayLists inside your classes.

Include your NumberFormatter utiltiy class and, if you have one, the DateUtility class, in your project to help you reuse code.
