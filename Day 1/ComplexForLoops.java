class ComplexForLoops{
	public static void main(String XYZ[]){
		int A, B, C;

		for(A=1,B=10,C=100;A<=10 && B<=75; A++,B+=10,C+=25){
			System.out.println(A+" - "+B+" - "+C);
		}

		System.out.println("---------------------------------------------");

		int X, Y, Z;
		X = 1;
		Y = 3;
		Z = 7;
		for(;X<=10;){
			System.out.println(X+" - "+Y+" - "+Z);
			X++;
			Y += 8;
			Z += 17;
		}

	}
}