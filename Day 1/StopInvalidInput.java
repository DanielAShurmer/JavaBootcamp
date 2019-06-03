class Scores{
	private int Phy, Che, Mat;

	public void ShowResults(){
		int Total;
		Total = Phy + Che + Mat;
		
		if (Phy == 0 || Che == 0 || Mat == 0){
			System.out.println("Please First Enter Valid Inputs For All Three Subjects Before Displaying Results");
		}
		else{
			System.out.println("Total Score: "+Total);
			if (Total >= 300){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}
	}

	public void Physics(int P){
		if (P>=0 && P<=150){
			Phy = P;
		}
		else{
			System.out.println("Invalid Input For Physics");
		}
	}
	public void Chemistry(int C){
		if (C>=0 && C<=150){
			Che = C;
		}
		else{
			System.out.println("Invalid Input For Chemistry");
		}
	}
	public void Maths(int M){
		if (M>=0 && M<=150){
			Mat = M;
		}
		else{
			System.out.println("Invalid Input For Maths");
		}
	}
}

class StopInvalidInput{
	public static void main(String XYZ[]){
		Scores Peter, James;
		Peter = new Scores();
		James = new Scores();
		Peter.Physics(1200);
		Peter.Chemistry(89);
		Peter.Maths(94);
		Peter.ShowResults();
	}
}