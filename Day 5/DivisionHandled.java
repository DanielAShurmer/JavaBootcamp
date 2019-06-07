class DivisionHandled{
	public static void main(String[] InputList){
		int First, Second, Result;
		First = Second = Result = 0;

		try{
			First = Integer.parseInt(InputList[0]);
			Second = Integer.parseInt(InputList[1]);
			Result = First / Second;
			System.out.println("Result: " + Result);
		}
		catch(NumberFormatException E){
			System.out.println("Please Only Enter Digits");
		}
		catch(IndexOutOfBoundsException E){
			System.out.println("Please Enter Two Values");
		}
		catch(ArithmeticException E){
			System.out.println("Cannot Divide By Zero");
		}
		System.out.println("Program Terminated Successfully");
	}
}