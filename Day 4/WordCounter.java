class StringProcessing{
	public void WordCount(String Msg){
		int WordsFound = 0;
		int Counter = 0;
		while (Counter < Msg.length()){
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){
				WordsFound += 1;
			}
			Counter += 1;
		}
		System.out.println("There are " + (WordsFound + 1) + " words in your message.");
	}
}

class WordCounter{
	public static void main(String XYZ[]){
		StringProcessing S = new StringProcessing();
		S.WordCount("This is a sentence with many words in it.");
	}
}