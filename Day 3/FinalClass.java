//  Code to demo usage of 'final' keyword. Will produce the following error upon compile: 
//  FinalClass.java:7: error: cannot inherit from final LockedClass

final class LockedClass{
	public void Msg(){
		System.out.println("Test");
	}
} 

class secClass extends LockedClass{
	public void Msg(){
		System.out.println("This will not work!");
	}
}

class FinalClass{
	public static void main(String XYZ[]){
		secClass Ref = new secClass();
		Ref.Msg();

	}
}