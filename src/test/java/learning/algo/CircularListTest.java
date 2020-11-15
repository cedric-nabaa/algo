package learning.algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CircularListTest {

	@Test
	public void should_insert_2_elements_and_keep_order() {
		final CircularList<String> circularList = new CircularList<>();
		circularList.add("s");
		circularList.add("s2");
		assertThat(circularList.step()).isEqualTo("s");
		assertThat(circularList.step()).isEqualTo("s2");
		assertThat(circularList.step()).isEqualTo("s");
		assertThat(circularList.step()).isEqualTo("s2");
	}
}
