import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Hello world!");
        outputOddNumbers();
        System.out.println();
        outputEvenNumbers();
        System.out.println();
        printUniqueWords();
        System.out.println();
        printDuplicates();
    }

    public static void outputOddNumbers() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void outputEvenNumbers() {
        int uniqueNumber = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != uniqueNumber) {
                System.out.println(num);
                uniqueNumber = num;
            }

        }

    }

    public static void printUniqueWords() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void printDuplicates() {
        Map<String, Integer> uniqueWords = new HashMap<>();
        for (String string : strings) {
            if (!uniqueWords.containsKey(string)) {
                uniqueWords.put(string, 1);
            } else {
                uniqueWords.put(string, uniqueWords.get(string) + 1);
            }
        }
        System.out.println(uniqueWords.values());
    }


}