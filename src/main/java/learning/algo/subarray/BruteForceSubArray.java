package learning.algo.subarray;

/**
 * Jan 28, 201910:53:53 AM
 *
 * @author cedric
 *
 */
public class BruteForceSubArray {

	public static int[] findMaxSubArray(int[] arr) {
		int currentMax = Integer.MIN_VALUE;
		int firstSubElement = -1;
		int lastSubElement = -1;
		for (int i = 0; i < arr.length; i++) {
			int rowSum = arr[i];
			for (int j = i; j < arr.length; j++) {
				int localMax = rowSum + arr[j];
				if (localMax > currentMax) {
					currentMax = localMax;
					firstSubElement = i;
					lastSubElement = j;
				}
				rowSum += arr[j];
			}
		}
		return new int[] { firstSubElement, lastSubElement };
	}

}
