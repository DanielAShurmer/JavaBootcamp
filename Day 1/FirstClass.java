class Store{
	int X;
	int Y;
}

class FirstClass{
	public static void main(String XYZ[]){
		Store Ref;
		Ref = new Store();
		Ref.X = 15;
		Ref.Y = 20;
		System.out.println(Ref.X + Ref.Y);
	}
}