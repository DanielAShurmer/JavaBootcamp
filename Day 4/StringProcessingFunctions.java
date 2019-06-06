class StringProcessing{
	public void WordCount(String Msg){
		int WordsFound = 0;
		int Counter = 0;
		while (Counter < Msg.length()){
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){
				WordsFound ++;
			}
			Counter ++;
		}
		System.out.println("There are " + (WordsFound + 1) + " words in your message.");
	}

	public void WordSplitter(String Msg){
		int Counter = 0;
		String CurrentWord = "";
		while (Counter < Msg.length()){
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){
				System.out.println(CurrentWord);
				CurrentWord = "";
			}
			else{
				CurrentWord += Msg.substring(Counter,Counter + 1);
			}
			Counter ++;		
		}
		System.out.println(CurrentWord);
	}

	public void ReverseWordSplitter(String Msg){
		Msg = " " + Msg;
		int Counter = Msg.length() - 1;
		String CurrentWord = "";
		while (Counter >= 0){
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){
				System.out.println(CurrentWord);
				CurrentWord = "";
			}
			else{
				CurrentWord = Msg.substring(Counter,Counter + 1) + CurrentWord;
			}
			Counter -= 1;
		}
	}

	public void ReverseLettersPerWord(String Msg){
		Msg = Msg + " ";
		int Counter = 0;
		String CurrentWord = "";
		while (Counter < Msg.length()){
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){
				System.out.println(CurrentWord);
				CurrentWord = "";
			}
			else{
				CurrentWord = Msg.substring(Counter,Counter + 1) + CurrentWord;
			}
			Counter ++;		
		}
	}
}

class StringProcessingFunctions{
	public static void main(String XYZ[]){
		StringProcessing S = new StringProcessing();
		S.WordCount("This is a sentence with many words in it.");
		System.out.println("--------------------------------------------------");
		S.WordSplitter("This is a sentence with many words in it.");
		System.out.println("--------------------------------------------------");
		S.ReverseWordSplitter("This is a sentence with many words in it.");
		System.out.println("--------------------------------------------------");
		S.ReverseLettersPerWord("This is a sentence with many words in it.");
	}
}