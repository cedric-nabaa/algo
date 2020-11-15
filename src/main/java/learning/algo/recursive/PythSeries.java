package learning.algo.recursive;

public class PythSeries {

	// 1,3,6,10,15,21,28

	public static int getIterativePythSeriesNumber(int pos) {
		int result = 0;
		for (int i = 1; i <= pos; i++) {
			result = result + i;
		}
		return result;
	}

	public static int getRecursivePythSeriesNumber(int pos) {
		if (pos == 1) {
			return 1;
		} else {
			return pos + getRecursivePythSeriesNumber(pos - 1);
		}
	}

	public static int binarySearch(int[] arr, int element) {
		return find(arr, element);
	}

	private static int find(int[] arr, int element) {
		int mid = arr.length / 2;
		if (arr[mid] == element) {
			return mid;
		} else if (arr.length == 1) {
			return -1;
		}

		else {
			if (element < arr[mid]) {
				int[] newArr = new int[mid];
				System.arraycopy(arr, 0, newArr, 0, mid);
				return find(newArr, element);

			} else {
				int[] newArr;
				if (arr.length % 2 == 0) {
					newArr = new int[mid];
					System.arraycopy(arr, mid, newArr, 0, mid);
				} else {
					newArr = new int[mid + 1];
					System.arraycopy(arr, mid, newArr, 0, mid + 1);
				}
				int pos = find(newArr, element);
				return pos == -1 ? pos : mid + pos;
			}
		}

	}
}
