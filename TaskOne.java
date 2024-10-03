public class TaskOne{
	public static void main(String[] args){
		String sentence = "There is a tide in the affairs of men and resting";
	sentence.split(" ");
	String [] sentence1 = {"There", "is", "a", "tide", "in", "the", "affairs", "of", "men"};
	String [] sentence2 = new String[9];
	
	
	sentenceReverse(sentence1);
	
	
	
	}
	
	
	
	public static void sentenceReverse(String [] sentence1){
		for(int outdex = sentence1.length-1; outdex > -1; outdex--){
				System.out.print(sentence1[outdex] + " ");
			}
	}



}