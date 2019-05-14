package hw_1;


import java.util.*;

public class part_2 {

    //    O(s1 + s2); s1, s2 length of strings
    public static Boolean isStringPermutation(String s1, String s2) {

        Map<Character, Integer> freqs1 = get_freqs(s1);
        Map<Character, Integer> freqs2 = get_freqs(s2);

        for (Map.Entry<Character, Integer> entry1 : freqs1.entrySet()) {
            char key = entry1.getKey();
            int val = entry1.getValue();

            if (freqs2.containsKey(key)) {
                int val2 = freqs2.get(key);
                if (val2 != val) {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    //    Helper function to get frequencies of characters in string
    private static Map<Character, Integer> get_freqs(String input) {
        char[] chars_input = input.toCharArray();
        Map<Character, Integer> freqs = new HashMap<>();
        for (char character : chars_input) {
            if (freqs.get(character) == null) {
                freqs.put(character, 1);
            } else {
                int val = freqs.get(character);
                freqs.put(character, val + 1);
            }
        }
        return freqs;
    }

    //    O(n^2); n = length of inputArray
    public static ArrayList<int[]> pairsThatEqualSum(int[] inputArray, int targetSum) {
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == targetSum) {
                    int[] pair = {i, j};
                    result.add(pair);
                }
            }
        }
        return result;
    }
}
