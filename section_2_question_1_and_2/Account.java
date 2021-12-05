import java.util.Scanner;
public class Account {
	// 3 unique instances/objects in java
	// id usually store in numeric or integer, thats why integer is use in this case
	int id = 1;
	// name usually store in alphabet in addition of numeric, so string suitable for the job
	String name = "Rahmat";
	// money or any related form that involve money require the use of decimal places which usually use only two decimal places, so double one of best choices for this
	double balance_amount = 500.00;
  
  // method for deposit
  static void deposit(double amount) {	
	// calling instances/object from class
	Account getName = new Account();
	Account getBalance = new Account();
	if(amount < 1.00){
		System.out.print("\nAmount not reach minimum limits!");
	}else if(amount > 10000.00){
		System.out.print("\nAmount exceeded limits!");
	}else{
	getBalance.balance_amount = getBalance.balance_amount + amount;
	System.out.println("\n"+getName.name + "'s account. Balance: RM" + String.format("%.2f", getBalance.balance_amount));
	}
  }
  
  // method for withdraw
  static void withdraw(double amount) {  
	// calling instances/object from class
	Account getName = new Account();
	Account getBalance = new Account();
	if(amount < 1.00){
		System.out.print("\nAmount not reach minimum limits!");
	}else if(amount > getBalance.balance_amount){
		System.out.print("\nAmount exceeded the balance amount!");
	}else{
	getBalance.balance_amount = getBalance.balance_amount - amount;
	System.out.println("\n"+getName.name + "'s account. Balance: RM" + String.format("%.2f", getBalance.balance_amount));
	}
  }
  
  // method for balance
  static void balance() {   
	// calling instances/object from class
	Account getName = new Account();
	Account getBalance = new Account();
	System.out.println("\n"+getName.name + "'s account. Balance: RM" + String.format("%.2f", getBalance.balance_amount));
  }
  
  // main method for acquiring input
  public static void main(String[] args) {
	// initialize the variables
	String option;
	double getDepositAmount, getWithdrawAmount;
    
    Scanner getOption = new Scanner(System.in);
    System.out.print("Welcome to the Bank!");
	System.out.print("\n1: Deposit");
	System.out.print("\n2: Withdraw");
	System.out.print("\n3: Balance");
	System.out.print("\nInput option(1, 2 or 3): ");
    option = getOption.nextLine();
	
	if(option.equals("1")){
		Scanner getDeposit = new Scanner(System.in);
		System.out.print("\nInput Deposit Amount: ");
		getDepositAmount = getDeposit.nextDouble();
		deposit(getDepositAmount);	
	}else if(option.equals("2")){
		Account getName = new Account();
		Account getBalance = new Account();
		Scanner getWithdraw = new Scanner(System.in);
		System.out.println("\n"+getName.name + "'s account. Balance: RM" + String.format("%.2f", getBalance.balance_amount));
		System.out.print("\nInput Withdraw Amount: ");
		getWithdrawAmount = getWithdraw.nextDouble();
		withdraw(getWithdrawAmount);
	}else if(option.equals("3")){
		balance();
	}else{
		System.out.print("\nInvalid option!");
	}
	
  }
}