class BasicException{
	public static void main(String XYZ[]) {
		int A, B, C;
		A = B = C = 0;
		try{
			A = 42;
			B = 0;

			C = A / B;
			System.out.println("Result: "+C);
		}
		catch(ArithmeticException ExceptRefOne){
			System.out.println("Division By Zero Error!");
		}
	}
}