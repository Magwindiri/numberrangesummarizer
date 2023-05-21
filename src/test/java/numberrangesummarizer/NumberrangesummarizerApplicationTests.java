package numberrangesummarizer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.List;

@SpringBootTest
public class NumberrangesummarizerApplicationTests {

	@Test
	public void testCollect() {

		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		NumberRangeSummarizerImplementation numberRangeSummarizer = new NumberRangeSummarizerImplementation();
		Collection<Integer> numbers = numberRangeSummarizer.collect(input);
		Collection<Integer> expectedNumbers = List.of(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
		//assert numbers.equals(expectedNumbers);
		Assertions.assertEquals(numbers, expectedNumbers);
	}
}
