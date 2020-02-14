package app;

import task.Task1;

public class Run {

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		String str = "abcabcaabdaaba11s111fe";
		int[] array = new int[] {2,3,1,4,10,1};
		
		System.out.println("there are " + task1.countLetter(str)+" abc or aba.");
		System.out.println("there are " + task1.count11(str)+" 11.");
		System.out.println("Is this array can be eauqlly divide? "+
		task1.isEqualSplit(array, 6, 5));

	}

}
