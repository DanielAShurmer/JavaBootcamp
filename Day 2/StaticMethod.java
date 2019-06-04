class PrintX{
	static int X;
	static public void MSG(){
		X++;
		System.out.println(X);
	}
}

class StaticMethod{
	public static void main(String XYZ[]){
		PrintX Printer = new PrintX();
		Printer.X = 100;
		PrintX.MSG();
	}	
}