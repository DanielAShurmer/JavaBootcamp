class Results{
	int Phy, Che, Mat;
	public void ShowResults(){
		int Total;
		Total = Phy + Che + Mat;
		System.out.println("Total Score: "+Total);
		if (Total >= 300){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}

class MultipleObjects{
	public static void main(String XYZ[]){
		Results Peter, James;
		Peter = new Results();
		James = new Results();
		Peter.Phy = 121;
		Peter.Che = 109;
		Peter.Mat = 88;
		James.Phy = 92;
		James.Che = 103;
		James.Mat = 87;
		Peter.ShowResults();
		James.ShowResults();
	}
}