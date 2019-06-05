class classOne{
	int A;
	public void MsgOne(){
		System.out.println("Test Output A");
	}
}

class classTwo extends classOne{
	int B;
	public void MsgTwo(){
		System.out.println("Test Output B");
	}
}

class ParentChildRefVars{
	public static void main(String XYZ[]){
		classOne Ref;
		Ref = new classTwo();
		Ref.MsgOne();    // <--- This line is fine.
		Ref.MsgTwo();    // <--- This line produces an error during compilation.
	}
}