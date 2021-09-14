class Account {
	private int accountNumber;
	private double balance;

	Account(int accountNumber, double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}
	public double getBalance(){
		return this.balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void credit(int amt){
		this.balance=this.balance+amt;
	}
	public void debit(int amt){
		if(amt<this.balance)
			this.balance=this.balance-amt;
		else
			System.out.println("Insufficient Balance");
	}

	public void displayAccountInfo(){
		System.out.println("Account Number  : "+this.accountNumber);
		System.out.println("Account Balance : "+this.balance);
	}
}


class Details{
	public static void main(String[] args) {
		Account a1 = new Account(673892,10000.00);
		System.out.println("Account Info :");
		a1.getAccountNumber();
		a1.getBalance();
		a1.displayAccountInfo();

		System.out.println("Do you want to Credit");
		a1.credit(7000);
		System.out.println("Account Info After Credit :");
		a1.displayAccountInfo();
		
		System.out.println("Do you want to Debit");
		a1.debit(7000);
		System.out.println("Account Info After Credit :");
		a1.displayAccountInfo();


	}
}