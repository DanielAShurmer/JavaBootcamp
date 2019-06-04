class Account{
	public void Tax(){
		System.out.println("The Tax Rate Is "+22.7);
	}
	public void Tax(int Salary){
		double T;
		T = Salary * 22.7 / 100;
		System.out.println("Your Tax Is "+T);
	}
	public void Tax(int Salary, double TaxRate){
		double T;
		T = Salary * TaxRate / 100;
		System.out.println("Your Tax Is "+T);
	}
}

class MethodOverloader{
	public static void main(String XYZ[]){
		Account AccNo1 = new Account();
		AccNo1.Tax();
		AccNo1.Tax(20000);
		AccNo1.Tax(20000,19.5);
	}
}