class MathOperator{
	public float Addition(float A, float B){
		float Result;
		Result = A + B;
		return Result;
	}

	public float Subtraction(float A, float B){
		float Result;
		Result = A - B;
		return Result;
	}

	public float Multiplication(float A, float B){
		float Result;
		Result = A * B;
		return Result;
	}

	public float Division(float A, float B){
		float Result;
		Result = A / B;
		return Result;
	}

	public float Modulation(float A, float B){
		float Result;
		Result = A % B;
		return Result;
	}
}

class Calculator{
	public static void main(String XYZ[]){
		MathOperator MOp;
		MOp = new MathOperator();
		System.out.println("Result A: " + MOp.Addition(50.0f,32.0f));
		System.out.println("Result B: " + MOp.Subtraction(50.0f,32.0f));
		System.out.println("Result C: " + MOp.Multiplication(50.0f,32.0f));
		System.out.println("Result D: " + MOp.Division(50.0f,32.0f));
		System.out.println("Result E: " + MOp.Modulation(50.0f,32.0f));
	}
}