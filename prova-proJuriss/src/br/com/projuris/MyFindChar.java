package br.com.projuris;

public class MyFindChar implements FindCharachter {

	@Override
	public char findChar(String word) {
		for(int i = 0; i < word.length(); i++) 
			for(int j = 1; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j))
					if(word.charAt(i + 1) != word.charAt(i))
						return word.charAt(i + 1);
			}
		return 0;
	}
}
