class InherOne{
	public InherOne(){
		System.out.println("1");
	}
	public InherOne(int X){
		System.out.println("2");
	}
}

class InherTwo extends InherOne{
	public InherTwo(){
		super(42);
		System.out.println("3");
	}
	public InherTwo(int X){
		System.out.println("4");
	}
	public InherTwo(int X, int Y){
		this();
		System.out.println("5");
	}
}

class InheritingConstructors{
	public static void main(String XYZ[]){
		InherTwo A = new InherTwo();
		InherTwo B = new InherTwo(52);
		InherTwo C = new InherTwo(62,72);
	}
}