package learning.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void should_return_1_2_3() {
		int[] arr = new int[] { 2, 1, 3 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, arr.length - 1);
		assertThat(arr[0]).isEqualTo(1);
		assertThat(arr[1]).isEqualTo(2);
		assertThat(arr[2]).isEqualTo(3);
	}

	@Test
	public void should_swap_1srt_and_2nd_element() {

		int[] arr = new int[] { 2, 1, 3 };
		QuickSort quickSort = new QuickSort();
		quickSort.swap(arr, 1, 2);
		assertThat(arr[0]).isEqualTo(2);
		assertThat(arr[1]).isEqualTo(3);
		assertThat(arr[2]).isEqualTo(1);
	}

	@Test
	public void should_return_sorted_partition_for_pivot() {
		int[] arr = new int[] { 2, 7, 3, 8, 5 };
		QuickSort quickSort = new QuickSort();
		quickSort.partition(arr, 0, arr.length - 1);

		assertThat(arr[0]).isEqualTo(2);
		assertThat(arr[1]).isEqualTo(3);
		assertThat(arr[2]).isEqualTo(5);
		assertThat(arr[3]).isEqualTo(8);
		assertThat(arr[4]).isEqualTo(7);
	}

	@Test
	public void should_return_sorted_partition_for_pivot_2() {
		int[] arr = new int[] { 10, 3, 8, 2, 5 };
		QuickSort quickSort = new QuickSort();
		quickSort.partition(arr, 0, arr.length - 1);

		assertThat(arr[0]).isEqualTo(3);
		assertThat(arr[1]).isEqualTo(2);
		assertThat(arr[2]).isEqualTo(5);
		assertThat(arr[3]).isEqualTo(10);
		assertThat(arr[4]).isEqualTo(8);
	}

	@Test
	public void should_return_sorted_big_array() {
		int[] arr = new int[] { 2, 1, 3, 8, 6, 0, 9, 4, 5, 7 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, arr.length - 1);
		assertThat(arr[0]).isEqualTo(0);
		assertThat(arr[1]).isEqualTo(1);
		assertThat(arr[2]).isEqualTo(2);
		assertThat(arr[3]).isEqualTo(3);
		assertThat(arr[4]).isEqualTo(4);
		assertThat(arr[5]).isEqualTo(5);
		assertThat(arr[6]).isEqualTo(6);
		assertThat(arr[7]).isEqualTo(7);
		assertThat(arr[8]).isEqualTo(8);
		assertThat(arr[9]).isEqualTo(9);

	}

}
