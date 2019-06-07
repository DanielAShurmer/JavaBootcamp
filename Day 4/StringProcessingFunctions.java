class StringProcessing{
	// Count the number of words in a string
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

	// Count the number of words in a string and return the result
	public int ReturnWordCount(String Msg){
		int WordsFound = 0;
		int Counter = 0;
		while (Counter < Msg.length()){
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){
				WordsFound ++;
			}
			Counter ++;
		}
		return WordsFound;
	}

	// Print each word in a string on its own line
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
			Counter --;
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

	public void RemoveDuplicateWords(String Msg){
		int WordsFound = ReturnWordCount(Msg);
		String[] PreviousWords= new String[WordsFound];
		boolean SameWord = false;
		Msg = Msg + " ";
		int Counter = 0;
		String CurrentWord = "";

		// Set an array with the same number of spaces as the number of words in the string, and set all values to empty strings.
		int ArrayInitCounter = 0;
		for (String ListWord : PreviousWords){
			PreviousWords[ArrayInitCounter] = "";
			ArrayInitCounter ++;
		}

		while (Counter < Msg.length()){

			// If encountering a space in the string, check complete word against all previous found words.
			if ((Msg.substring(Counter,Counter + 1)).equals(" ")){	
				for (String CheckingWord : PreviousWords){
				 	if (CheckingWord.equals(CurrentWord)){
				 		SameWord = true;
				 	}
				}

				 // If no matches found, print the word, and add it to the next empty slot in the found words array.
				 if (SameWord == false){
				 	System.out.print(CurrentWord + " ");

				 	int SubCounter = 0;

				 	for (String ListWord : PreviousWords){
				 		if (ListWord == ""){
				 			PreviousWords[SubCounter] = CurrentWord;
				 			break;
				 		}
				 		SubCounter ++;
				 	}
				}

				// Whether or not a match was found, reset word and match-found variables.
				SameWord = false; 
				CurrentWord = "";
			}
			// If encoutering a non-space character, add it to the current word.
			else{
				CurrentWord += Msg.substring(Counter,Counter + 1);
			}
			Counter ++;		
		}
	}
}

class StringProcessingFunctions{
	public static void main(String XYZ[]){
		StringProcessing S = new StringProcessing();
		System.out.println("---Count Words---");
		S.WordCount("This is a sentence with many words in it.");
		System.out.println("---Print One Word At A Time---");
		S.WordSplitter("This is a sentence with many words in it.");
		System.out.println("---Print One Word At A Time - Starting From The Last Word---");
		S.ReverseWordSplitter("This is a sentence with many words in it.");
		System.out.println("---Print One Word At A Time - With Each Word Backwards---");
		S.ReverseLettersPerWord("This is a sentence with many words in it.");
		System.out.println("---Print Words With Duplicate Words Removed---");
		S.RemoveDuplicateWords("This is a is sentence with many is words with in a it.");
	}
}