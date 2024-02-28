class BankAccount
{
	public String accountName;
	public int accountNo;
	public int deposite;
	public int withdraw;
	public double balance;

	public void newaccount(String accountName, int accountNo)
	{
		this.accountName = accountName;
		this.accountNo = accountNo;
	}

	public void deposite(int balance, int deposite)
	{
		this.balance = balance;
		this.deposite = deposite;
		this.balance = this.balance + deposite;
	}

	public void withdraw(int withdraw)
	{
		this.withdraw = withdraw;
		this.balance = this.balance - withdraw;
	}

	public void viewbalance()
	{
		System.out.println("Account Holder Name :" + this.accountName);
		System.out.println("New Account Number :" + this.accountNo);
		System.out.println("Account Deposite Money :"+ this.deposite);
		System.out.println("Account WithDraw Money :" + this.withdraw);
		System.out.println("Account Total Balance :" + this.balance);
	}

	public static void main(String args[])
	{
		BankAccount bankaccount = new BankAccount();

		bankaccount.newaccount("Darshan Mistari",101);
		bankaccount.deposite(5000,2000);
		bankaccount.withdraw(1000);
		bankaccount.viewbalance();

	}
}