package leetcode;

public class Main {
	public static void main(String[] args){
	
	int size = 5;
	
	int[][] testCases = {{1, 2, 3, 4, 5},
						{1, 2, 3, 4, 5},
						{1, 2, 3, 4, 5},
						{1, 2, 3, 4, 5},
						{1, 2, 3, 4, 5},};
	
	int[] testValues = {5, 4, 6, 9, 12};
	
	
	int[][] result = new int[size][size];
	
	for(int j = 0; j < size; j++){
		result[j] = Problem1.twoSum(testCases[j], testValues[j]);
	}
	
	for(int k = 0; k< result.length; k++){
	for(int i = 0; i < result[0].length; i++){
		System.out.print(result[k][i] + " ");
	}
	System.out.println("");
	}
	}
}