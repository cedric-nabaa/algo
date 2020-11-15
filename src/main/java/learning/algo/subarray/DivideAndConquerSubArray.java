package learning.algo.subarray;

/**
 * Jan 28, 201911:30:23 AM
 *
 * @author cedric
 *
 */
public class DivideAndConquerSubArray {

	public static int[] findMaxSubArray(int[] arr) {
		return findMaxSubArray(arr, 0, arr.length - 1);
	}

	// return a tuple : leftIdx, rightIdx, max
	protected static int[] findMaxSubArray(int[] arr, int low, int high) {

		if (low == high) {// base case
			return new int[] { low, high, arr[low] };
		}
		int mid = (low + high) / 2;
		int[] findMaxSubArrayLeft = findMaxSubArray(arr, low, mid);
		int[] findMaxSubArrayRight = findMaxSubArray(arr, mid + 1, high);
		int[] findMaxCrossingPoint = findMaxCrossingPoint(arr, low, mid, high);

		if (findMaxSubArrayLeft[2] > findMaxSubArrayRight[2] && findMaxSubArrayLeft[2] > findMaxCrossingPoint[2]) {
			return findMaxSubArrayLeft;
		} else if (findMaxSubArrayRight[2] > findMaxSubArrayLeft[2]
				&& findMaxSubArrayRight[2] > findMaxCrossingPoint[2]) {
			return findMaxSubArrayRight;
		} else {
			return findMaxCrossingPoint;
		}

	}

	// return a tuple : leftIdx, rightIdx, max
	protected static int[] findMaxCrossingPoint(int[] arr, int low, int mid, int high) {
		int leftSum = Integer.MIN_VALUE;
		int localSum = 0;
		int leftIdx = -1;
		for (int i = mid; i >= low; i--) {
			localSum += arr[i];
			if (localSum > leftSum) {
				leftSum = localSum;
				leftIdx = i;
			}
		}

		int rightSum = Integer.MIN_VALUE;
		localSum = 0;
		int rightIdx = -1;
		for (int i = mid + 1; i <= high; i++) {
			localSum += arr[i];
			if (localSum > rightSum) {
				rightSum = localSum;
				rightIdx = i;
			}
		}
		return new int[] { leftIdx, rightIdx, rightSum + leftSum };

	}
}
