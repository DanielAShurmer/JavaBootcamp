class ParentClass{
	public void Add(int A, int B){
		int Result = A + B;
		System.out.println("Result: "+Result);
	}
	public void Subtraction(int A, int B){   //This is overwritten later
		System.out.println(A - B);
	}
}

class ChildClass extends ParentClass{
	public void Multiplication(int A, int B){
		System.out.println("Result: "+(A*B));
	}
	public void Subtraction(int A, int B){
		System.out.println("Result: "+(A-B));
	}
}

class ClassInheritence{
	public static void main(String XYZ[]){
		ChildClass Calc = new ChildClass();
		Calc.Add(86,43);
		Calc.Subtraction(86,43);
		Calc.Multiplication(86,43);
	}
}