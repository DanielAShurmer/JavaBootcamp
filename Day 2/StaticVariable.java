class BankClass{
	static int Dollar;
	public void SetDollar(int A){
		Dollar = A;
	}
	public void Amount(int A){
		System.out.println("Amount Is:"+(A*Dollar));
	}
}

class StaticVariable{
	public static void main(String XYZ[]){
		BankClass HSBC,NATWEST,NBS;
		HSBC = new BankClass();
		NATWEST = new BankClass();
		NBS = new BankClass();
		HSBC.SetDollar(100);
		NBS.Amount(2);
		NBS.SetDollar(250);
		NATWEST.Amount(3); 
	}
}