class ReadNumber{
	static public String ones(int InputNum){
		switch(InputNum){
			case 1: return "One"; 
			case 2: return "Two";
			case 3: return "Three"; 
			case 4: return "Four"; 
			case 5: return "Five"; 
			case 6: return "Six"; 
			case 7: return "Seven"; 
			case 8: return "Eight"; 
			case 9: return "Nine"; 
			case 10: return "Ten"; 
			case 11: return "Eleven"; 
			case 12: return "Twelve"; 
			case 13: return "Thirteen"; 
			case 14: return "Fourteen"; 
			case 15: return "Fifteen"; 
			case 16: return "Sixteen"; 
			case 17: return "Seventeen"; 
			case 18: return "Eighteen"; 
			case 19: return "Nineteen"; 
			default: return "Error";
		}
	}

	static public String tens(int InputNum){
		switch(InputNum){
			case 20: return "Twenty"; 
			case 30: return "Thirty"; 
			case 40: return "Fourty"; 
			case 50: return "Fifty";
			case 60: return "Sixty"; 
			case 70: return "Seventy"; 
			case 80: return "Eighty"; 
			case 90: return "Ninety"; 
			default: return "Error";
		}
	}

	static public String MainBlock(int InputNum){
	String Answer = "";
	int LocalNum = 0;

		if (InputNum >= 1000 && InputNum <= 9999){
			Answer += ReadNumber.ones(InputNum/1000) + " Thousand ";
			InputNum %= 1000;
		}

		if (InputNum >= 100){
			Answer += ReadNumber.ones(InputNum/100) + " Hundered ";
			InputNum %= 100;
		}

		if (InputNum >= 20){
			Answer += ReadNumber.tens((InputNum/10)*10) + " ";
			InputNum %= 10;
		}

		if (InputNum > 0 && InputNum <= 19){
			Answer += ReadNumber.ones(InputNum);
		}

		return Answer;
	}
}

class ReadMyNumber{
	public static void main(String XYZ[]){
		String Output = ReadNumber.MainBlock(7618);
		System.out.println(Output);
	}

}