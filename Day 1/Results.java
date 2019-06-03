class Results{
	public static void main(String XYZ[]){
		int Phy,Che,Mat,Total;
		float Percent;
		Phy = 67;
		Che = 96;
		Mat = 139;
		Total = Phy + Che + Mat;
		Percent = Total * 100/450;
		System.out.println("Total Marks: " + Total);
		System.out.println("Percentage: " + Percent);

		if (Percent >= 60){
			System.out.println("You Have Passed The Exam!");
		}
		else{
			System.out.println("You Have Failed The Exam.");
		}
		
	}
}