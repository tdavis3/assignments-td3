package hw_1;


import java.util.*;

public class part_2 {

    //    O(s1 + s2); s1, s2 length of strings
    public static Boolean isStringPermutation(String s1, String s2) {
        char[] chars_s1 = s1.toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        for (char character : chars_s1) {
            if (freq.get(character) == null) {
                freq.put(character, 1);
            } else {
                int val = freq.get(character);
                freq.put(character, val + 1);
            }
        }

        char[] chars_s2 = s2.toCharArray();
        Map<Character, Integer> freq2 = new HashMap<>();
        for (char character : chars_s2) {
            if (freq2.get(character) == null) {
                freq2.put(character, 1);
            } else {
                int val = freq2.get(character);
                freq2.put(character, val + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry1 : freq.entrySet()) {
            char key = entry1.getKey();
            int val = entry1.getValue();

            if (freq2.containsKey(key)) {
                int val2 = freq2.get(key);
                if (val2 != val) {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
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
