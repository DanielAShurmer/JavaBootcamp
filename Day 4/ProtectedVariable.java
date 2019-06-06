class ProtectedVarClass{
	protected int X;
}

class ExtendingClass extends ProtectedVarClass{
	public void CallingFunction(){
		X = 42;
		System.out.println("X:"+X);
	}
}

class ProtectedVariable{
	public static void main(String XYZ[]){
		ExtendingClass EXClass = new ExtendingClass();
		EXClass.CallingFunction();
	}
}