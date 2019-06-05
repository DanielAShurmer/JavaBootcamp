abstract class Draw{
	abstract public void drawing();
}

class Line extends Draw{
	public void drawing(){
		System.out.println("Drawing Line");
	}
}

class Circle extends Draw{
	public void drawing(){
		System.out.println("Drawing Circle");
	}
}

class Square extends Draw{
	public void drawing(){
		System.out.println("Drawing Square");
	}
}

class ForcingClassCreation{
	public static void main(String XYZ[]){
		Line X = new Line();
		LetsDraw(X);
		Circle Y = new Circle();
		LetsDraw(Y);
		Square Z = new Square();
		LetsDraw(Z);
	}

	public static void LetsDraw(Draw D){
		D.drawing();
	}
}