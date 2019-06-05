abstract class CalculationsAbstract{
	abstract public void Tax(int salary);
	public void MSG(){
		Tax(20000);
		System.out.println("Test!");
	}
}

class Calculations2 extends CalculationsAbstract{
	public void Tax(int salary){
		System.out.println(salary * 21/100);
	}
}

class AbstractClassTest{
	public static void main(String XYZ[]){
		Calculations2 calc = new Calculations2();
		calc.MSG();
	}
}