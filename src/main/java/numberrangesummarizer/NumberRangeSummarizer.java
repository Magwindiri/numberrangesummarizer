package numberrangesummarizer;

import java.util.Collection;

public interface NumberRangeSummarizer {
    /**
     * @auther Stephen Magwindiri
     * Collect the input
     *
     * @param input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31
     * string of comma separated positive integers
     * @return Result: [1, 3, 6-8, 12-15, 21-24, 31]
     * Collection of positive Integers
     */
    Collection<Integer> collect(String input);
    String summarizeCollection(Collection<Integer> input);
}
