package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer {
    private Collection<Integer> numbers;

    public Collection<Integer> collect(String input) {
        String[] inputArray = input.split(",");
        numbers = new ArrayList<>();
        for (String s : inputArray) {
            try {
                int number = Integer.parseInt(s.trim());
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
        return numbers;
    }
    /*
    public String summarizeCollection(Collection<Integer> input) {
        List<Integer> sortedNumbers = new ArrayList<>(input);
        sortedNumbers.sort(Integer::compareTo);
        List<String> summarizedNumbers = new ArrayList<>();
        int start = sortedNumbers.get(0);
        int end = sortedNumbers.get(0);
        for (int i = 1; i < sortedNumbers.size(); i++) {
            if (sortedNumbers.get(i) - sortedNumbers.get(i - 1) == 1) {
                end = sortedNumbers.get(i);
            } else {
                summarizedNumbers.add(start == end ? String.valueOf(start) : start + "-" + end);
                start = sortedNumbers.get(i);
                end = sortedNumbers.get(i);
            }
        }
        summarizedNumbers.add(start == end ? String.valueOf(start) : start + "-" + end);
        return String.join(",", summarizedNumbers);
    }

     */
    public static void main(String[] args) {
        NumberRangeSummarizerImplementation numberRangeSummarizerImplementation = new NumberRangeSummarizerImplementation();
        Collection<Integer> numbers = numberRangeSummarizerImplementation.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,Stephen");
        System.out.println(numbers);
        //String summarizedNumbers = numberRangeSummarizerImplementation.summarizeCollection(numbers);
        //System.out.println(summarizedNumbers);
    }
}
