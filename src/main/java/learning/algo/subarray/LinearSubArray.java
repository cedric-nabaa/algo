package learning.algo.subarray;

public class LinearSubArray {

	protected static int[] findMaxSubArray(int[] arr) {
		int start = 0;
		int end = 0;
		int globalMaxSum = 0;
		int currentSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int localSum = arr[i] + currentSum;
			if (localSum > globalMaxSum && localSum > arr[i]) {
				globalMaxSum = localSum;
				currentSum = localSum;
				end = i;
			} else if (arr[i] > globalMaxSum && arr[i] > currentSum) {
				globalMaxSum = arr[i];
				currentSum = arr[i];
				start = i;
				end = i;
			} else {
				currentSum += arr[i];
			}

		}
		return new int[] { start, end };
	}
}
