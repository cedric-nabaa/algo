package learning.algo;

import java.util.Arrays;

import org.junit.Test;

public class SortingAlgoTest {

	private final int[] toBeSorted = new int[] { 2, 1, 4, 14, 10, 7 };
	private final int[] expectedSorted = new int[] { 1, 2, 4, 7, 10, 14 };

	@Test
	public void testArrays() {
		final int[] resultSorted = toBeSorted.clone();
		Arrays.sort(resultSorted);
		// assertThat(resultSorted).isEqualTo(expectedSorted);
	}

	@Test
	public void test_insertion_sort() {
		// assertThat(SortingUtils.insertionSort(toBeSorted)).isEqualTo(expectedSorted);
	}

	@Test
	public void test_selection_sort() {
		// assertThat(SortingUtils.selectionSort(toBeSorted)).isEqualTo(expectedSorted);
	}
}
