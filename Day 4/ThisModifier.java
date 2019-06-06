class Maths42{
	int X;
	public void Message(){
		int X;
		X = 20;
		this.X = 10;
		System.out.println("Local X:"+X);
		System.out.println("Global X:"+this.X);
		System.out.println("Object Location: "+this);
	}
	public void MessageTwo(){
		System.out.println("Global X:"+X);
	}
}

class ThisModifier{
	public static void main(String XYZ[]){
		Maths42 A = new Maths42();
		Maths42 B = new Maths42();
		A.X = 25;
		A.MessageTwo();
		A.Message();
		B.MessageTwo();
		B.Message();
	}
}