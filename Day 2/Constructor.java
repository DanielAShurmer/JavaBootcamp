class Bank{
	private int Amount;
	public void Deposit(int Money){
		Amount += Money;
	}
	public void Withdraw(int Money){
		if (Amount >= Money){
			Amount -= Money;
		}
		else{
			System.out.println("Not Enough Funds");
		}
	}
	public void Balance(){
		System.out.println("Your Balance Is: " + Amount);
	}
	public Bank(){
		System.out.println("Account Created");
	}
}

class Constructor{
	public static void main(String XYZ[]){
		Bank BankRef;
		BankRef = new Bank();
	}
}