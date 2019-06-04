class College{
	private int Phy, Che, Total; 
	private float Percent;

	private void Calculations(){
		Total = Phy + Che;
		Percent = Total * 100 / 300;
	}

	public void Physics(int P){
		if (P>=0 && P<=150){
			Phy = P;
		}
		else{
			Phy = -1;
			System.out.println("Invalid Physics Marks");
		}
	}

	public void Chemistry(int C){
		if (C>=0 && C<=150){
			Che = C;
		}
		else{
			Che = -1;
			System.out.println("Invalid Chemistry Marks");
		}
	}

	public void ShowResults(){
		if(Phy == -1 || Che == -1){
			System.out.println("No Results");
		}
		else{
			Calculations();
			System.out.println("Total: "+Total);
			System.out.println("Percentage: "+Percent);
		}
	}
}

class DayOneRecap{
	public static void main(String XYZ[]){
		College ColRef;
		ColRef = new College();
		ColRef.Physics(70);
		ColRef.Chemistry(84);
		ColRef.ShowResults();
	}
}