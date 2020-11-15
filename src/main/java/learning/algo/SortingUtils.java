package learning.algo;

import java.util.Arrays;

/**
 * Nov 2, 201812:53:14 PM
 *
 * @author cedric
 *
 */
public class SortingUtils {
	// finding the exact spot of each element
	public static int[] insertionSort(final int[] toBeSorted) {
		final int[] sorted = new int[toBeSorted.length];
		Arrays.fill(sorted, -1);
		int nextPositionToFill = 0;
		for (int i = 0; i < toBeSorted.length; i++) {
			boolean hasBeenFilled = false;
			for (int j = 0; j < sorted.length; j++) {
				if (toBeSorted[i] < sorted[j]) {
					if (sorted[j] != -1) {
						System.arraycopy(sorted, j, sorted, j + 1, sorted.length - 1 - j);
						sorted[j] = toBeSorted[i];
						hasBeenFilled = true;
						nextPositionToFill++;
						break;

					} else {
						sorted[i] = toBeSorted[i];
						hasBeenFilled = true;
						nextPositionToFill++;
						break;
					}
				}

			}
			if (!hasBeenFilled) {
				sorted[nextPositionToFill] = toBeSorted[i];
				nextPositionToFill++;
			}
		}
		return sorted;
	}

	public static int[] selectionSort(final int[] toBeSorted) {
		final int[] toBeSortedBig = new int[toBeSorted.length + 1];
		Arrays.fill(toBeSortedBig, -1);
		System.arraycopy(toBeSorted, 0, toBeSortedBig, 0, toBeSorted.length);
		for (int i = 0; i < toBeSortedBig.length - 1; i++) {
			int smallest = toBeSortedBig[i];
			int smallestPos = i;
			for (int j = i; j < toBeSortedBig.length - 1; j++) {
				if (toBeSortedBig[j] != -1 && smallest > toBeSortedBig[j]) {
					smallest = toBeSortedBig[j];
					smallestPos = j;
				}
			}
			// toBeSorted[j]
			System.arraycopy(toBeSortedBig, i, toBeSortedBig, smallestPos, smallestPos - i);
			toBeSortedBig[i] = smallest;
		}
		System.arraycopy(toBeSortedBig, 0, toBeSorted, 0, toBeSortedBig.length - 1);
		return toBeSorted;
	}
}
