class SecondStore{
	int Phy, Che;
	public void messageOut(){
		System.out.println("Phy: "+Phy);
		System.out.println("Che: "+Che);
	}
}

class SecondClass{
	public static void main(String XYZ[]){
		SecondStore Ref;
		Ref = new SecondStore();
		Ref.Phy = 76;
		Ref.Che = 92;
		Ref.messageOut();
	}
}