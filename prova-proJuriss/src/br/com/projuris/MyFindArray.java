package br.com.projuris;

public class MyFindArray implements FindArray {
	
	@Override
	public int findArray(int[] array, int[] subArray) {
		int num = subArray[0];
		int result = -1;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == num)
				result = i;
		}
		return result;
	}
}
