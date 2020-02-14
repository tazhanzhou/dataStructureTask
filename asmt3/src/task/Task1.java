package task;

public class Task1 {
	
	//task 1
	public int countLetter(String str) {
		if (str.length() < 3) {
			return 0;
		}
		if (str.substring(0, 3).equals("abc")) {
			return 1 + countLetter(str.substring(3));
		}
		if (str.substring(0, 3).equals("aba")) {
			return 1 + countLetter(str.substring(3));
		}
		return countLetter(str.substring(1));
	}

	//task2
	public int count11(String str) {
		if (str.length() < 2) {
			return 0;
		}
		if (str.substring(0, 2).equals("11")) {
			return 1 + count11(str.substring(2));
		}

		return count11(str.substring(1));
	}

	//task3
	
	public boolean isEqualSplit(int[] array, int n, int m) {
		//here n=array.length, m = n-1, m is where the array be cut.
		if (arraySum(array, n) % 2 != 0) {
			return false;
		}

		if (m == 0) {
			return false;
		}
		if (frontSum(array, m) == rearSum(array, n, n - m)) {
			return true;
		} else
			return isEqualSplit(array, n, m - 1);

	}
	
	public int arraySum(int[] array, int n) {
		if (n == 0) {
			return 0;
		} else {
			return arraySum(array, n - 1) + array[n - 1];
		}
	}

	public int frontSum(int[] array, int m) {
		if (m == 1) {
			return array[0];
		} else {
			return frontSum(array, m - 1) + array[m - 1];
		}

	}

	public int rearSum(int[] array, int n, int m) {
		if (m == 1) {
			return array[n - m];
		} else {
			return rearSum(array, n, m - 1) + array[n - m];
		}
	}

	
}
