package learning.algo.recursive;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class PythSeriesTest {

	@Test
	public void should_return_4_when_pos_is_10_with_iterative() {
		assertThat(PythSeries.getIterativePythSeriesNumber(4)).isEqualTo(10);
	}

	@Test
	public void should_return_4_when_pos_is_10_with_recursive() {
		assertThat(PythSeries.getRecursivePythSeriesNumber(4)).isEqualTo(10);
	}

	@Test
	public void should_return_4_when_element_is_in_array() {
		int[] arr = new int[] { 1, 5, 2, 4, 8, 10, 1000, 98, 65 };
		Arrays.sort(arr);
		assertThat(PythSeries.binarySearch(arr, 5)).isEqualTo(Arrays.binarySearch(arr, 5));
	}

	@Test
	public void should_return_size_when_element_is_last_in_array() {
		int[] arr = new int[] { 1, 5, 2, 4, 8, 10, 1000, 98, 65 };
		Arrays.sort(arr);
		assertThat(PythSeries.binarySearch(arr, 1000)).isEqualTo(arr.length - 1);
	}

	@Test
	public void should_return_minus_1_when_element_is_not_in_array() {
		int[] arr = new int[] { 1, 5 };
		Arrays.sort(arr);
		assertThat(PythSeries.binarySearch(arr, 24231)).isEqualTo(-1);
	}

}
