package learning.algo;

public class QuickSort {

	public void sort(int arr[], int low, int high) {

		if (low < high) {

			int lastPositionToBeSwapped = partition(arr, low, high);
			sort(arr, low, lastPositionToBeSwapped - 1);
			sort(arr, lastPositionToBeSwapped + 1, high);
		}

	}

	protected int partition(int[] arr, int low, int pivotPos) {
		int positionToBeSwapped = -1;
		for (int i = low; i < pivotPos; i++) {
			if (arr[i] < arr[pivotPos] && positionToBeSwapped >= 0) {
				swap(arr, i, positionToBeSwapped);
				positionToBeSwapped++;
			} else if (arr[i] > arr[pivotPos])
				if (i == 0 || arr[i - 1] < arr[pivotPos]) {
					positionToBeSwapped = i;
				}
		}
		if (positionToBeSwapped != -1) {
			// swap pivot
			swap(arr, positionToBeSwapped, pivotPos);
		} else {
			positionToBeSwapped = pivotPos;

		}
		return positionToBeSwapped;
	}

	protected void swap(int[] arr, int i, int positionToBeSwapped) {
		int value = arr[positionToBeSwapped];
		arr[positionToBeSwapped] = arr[i];
		arr[i] = value;
	}

}
