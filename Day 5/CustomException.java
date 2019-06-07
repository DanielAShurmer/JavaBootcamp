class AbsentiesException extends Exception{}

class AccountsBase{
	public float Tax(int Salary, int Absenties) throws AbsentiesException{
		float T;

		if (Absenties >= 7){
			AbsentiesException E = new AbsentiesException();
			throw E;
		}
		else{
			T = Salary * 21/100;
		}
		return T;
	}
}

class AccountsSlip{
	public void SalarySlip(){
		AccountsBase AccBase = new AccountsBase();      
		try{
			float NetSalary = 20000 - AccBase.Tax(20000,5);  // <--- Change this final figure to change if exception is thrown.
			System.out.println("Net Salary: " + NetSalary);
		}
		catch(AbsentiesException E){
			System.out.println("Too Many Absenties!");
		}
	}
}

class CustomException{
	public static void main(String[] XYZ) {
		AccountsSlip AccSlip = new AccountsSlip();
		AccSlip.SalarySlip();
	}
}