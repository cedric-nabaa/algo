package learning.algo.subarray;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Jan 28, 201910:44:14 AM
 *
 * @author cedric
 *
 */
public class BruteForceSubArrayTest {

	@Test
	public void should_return_0_1_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11 };
		assertThat(BruteForceSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 1 });
	}

	@Test
	public void should_return_7_10_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11, 7, 10, 6 };
		assertThat(BruteForceSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 4 });
	}

	@Test
	public void should_return_7_13_for_short_array() {
		final int[] initialPrices = new int[] { 10, 11, 7, -10, -13, -6 };
		assertThat(BruteForceSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 0, 2 });
	}

	@Test
	public void should_return_7_17_for_short_array() {
		final int[] initialPrices = new int[] { -10, 11, -7, -10, -9, 17, -6 };
		assertThat(BruteForceSubArray.findMaxSubArray(initialPrices)).isEqualTo(new int[] { 5, 5 });
	}
}
