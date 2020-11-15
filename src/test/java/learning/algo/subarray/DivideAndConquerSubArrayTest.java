package learning.algo.subarray;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Jan 28, 201911:31:08 AM
 *
 * @author cedric
 *
 */
public class DivideAndConquerSubArrayTest {

	@Test
	public void should_return_0_1_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11 };
		assertThat(DivideAndConquerSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 1, 21 });
	}

	@Test
	public void should_return_7_10_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11, 7, -6 };
		assertThat(DivideAndConquerSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 2, 28 });
	}

	@Test
	public void should_return_8_10_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11, -6, 7 };
		assertThat(DivideAndConquerSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 3, 22 });
	}

	@Test
	public void should_return_7_13_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11, 7, -10, -13, -6 };
		assertThat(DivideAndConquerSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 2, 28 });
	}

	@Test
	public void should_return_7_17_for_short_array() {
		final int[] initialPrices = new int[] { -10, 11, -7, -10, -9, 17, -6 };
		assertThat(DivideAndConquerSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 5, 5, 17 });
	}

	@Test
	public void should_return_0_3_15_for_max_crossing_point() {
		final int[] points = new int[] { 10, 1, 1, 3 };
		assertThat(DivideAndConquerSubArray.findMaxCrossingPoint(points, 0, 1, 3)).isEqualTo(new int[] { 0, 3, 15 });
	}

	@Test
	public void should_return_1_2_15_for_max_crossing_point() {
		final int[] points = new int[] { -10, 10, 5, -3 };
		assertThat(DivideAndConquerSubArray.findMaxCrossingPoint(points, 0, 1, 3)).isEqualTo(new int[] { 1, 2, 15 });
	}

	@Test
	public void should_return_1_3_15_for_max_crossing_point() {
		final int[] points = new int[] { -10, 10, 4, 1 };
		assertThat(DivideAndConquerSubArray.findMaxCrossingPoint(points, 0, 1, 3)).isEqualTo(new int[] { 1, 3, 15 });
	}

}
