class MathOperator{
	public int Addition(int A, int B){
		int Result;
		Result = A + B;
		return Result;
	}

	public int Subtraction(int A, int B){
		int Result;
		Result = A - B;
		return Result;
	}

	public int Multiplication(int A, int B){
		int Result;
		Result = A * B;
		return Result;
	}

	public int Division(int A, int B){
		int Result;
		Result = A / B;
		return Result;
	}

	public int Modulation(int A, int B){
		int Result;
		Result = A % B;
		return Result;
	}
}

class Calculator{
	public static void main(String XYZ[]){
		MathOperator MOp;
		MOp = new MathOperator();
		System.out.println("Result A: " + MOp.Addition(50,32));
		System.out.println("Result B: " + MOp.Subtraction(50,32));
		System.out.println("Result C: " + MOp.Multiplication(50,32));
		System.out.println("Result D: " + MOp.Division(50,32));
		System.out.println("Result E: " + MOp.Modulation(50,32));
	}
}