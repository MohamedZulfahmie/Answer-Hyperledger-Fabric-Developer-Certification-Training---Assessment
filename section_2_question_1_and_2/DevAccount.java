import java.util.Scanner;

class DevAccount {
	
	// instances for new class
	int id = 2;
	String name = "DevAccount";
	double balance_amount = 800.00;
	
	// method for get balance
	static void get_balance() { 
	// calling instances/object from class	
	Account getName = new Account();
	Account getBalance = new Account();
	System.out.println("\n"+getName.name + "'s account. Balance: RM" + String.format("%.2f", getBalance.balance_amount));
  }
  
  // method for set balance
  static void set_balance(double amount) { 
	// calling instances/object from class
	Account getName = new Account();
	Account getBalance = new Account();
	getBalance.balance_amount = amount;
	System.out.println("\n"+getName.name + "'s account. Balance: RM" + String.format("%.2f", getBalance.balance_amount));
  }
  
  // method for transfer to other account
  static void transfer_to_other_account(double amount) {   
	// calling instances/object from class
	Account getName_Account = new Account();
	Account getBalance_Account = new Account();
	DevAccount getName_DevAccount = new DevAccount();
	DevAccount getBalance_DevAccount = new DevAccount();
	if(amount < 1.00){
		System.out.print("\nAmount not reach minimum limits!");
	}else if(amount > getBalance_DevAccount.balance_amount){
		System.out.print("\nAmount exceeded the balance amount!");
	}else{
	getBalance_Account.balance_amount = getBalance_Account.balance_amount + amount;
	getBalance_DevAccount.balance_amount = getBalance_DevAccount.balance_amount - amount;
	System.out.println("\n"+getName_DevAccount.name + "'s account. Balance: RM" + String.format("%.2f", getBalance_DevAccount.balance_amount));
	System.out.println(getName_Account.name + "'s account. Balance: RM" + String.format("%.2f", getBalance_Account.balance_amount));
	}
  }
  
  // main method for acquiring input
  public static void main(String[] args) {
	// initialize the variables
    String option;
	double getBalanceAmount, getAmountTransfer;
    
    Scanner getOption = new Scanner(System.in);
    System.out.print("Welcome to the Bank!");
	System.out.print("\n1: Get Balance");
	System.out.print("\n2: Set Balance");
	System.out.print("\n3: Transfer to Other Account");
	System.out.print("\nInput option(1, 2 or 3): ");
    option = getOption.nextLine();
	
	if(option.equals("1")){
		get_balance();
	}else if(option.equals("2")){
		Scanner getBalance = new Scanner(System.in);
		System.out.print("\nInput new balance amount: ");
		getBalanceAmount = getBalance.nextDouble();
		set_balance(getBalanceAmount);
	}else if(option.equals("3")){
		DevAccount getName_DevAccount = new DevAccount();
		DevAccount getBalance_DevAccount = new DevAccount();
		Scanner getAmount = new Scanner(System.in);
		System.out.println("\n"+getName_DevAccount.name + "'s account. Balance: RM" + String.format("%.2f", getBalance_DevAccount.balance_amount));
		System.out.print("\nInput amount to transfer: ");
		getAmountTransfer = getAmount.nextDouble();
		transfer_to_other_account(getAmountTransfer);
	}else{
		System.out.print("\nInvalid option!");
	}
  }
}