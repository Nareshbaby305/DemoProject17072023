package JavaTest;

import java.util.HashMap;
import java.util.Map;

public class Main {
	    public static void main(String[] args) {
	        String str = "Hyderabad";
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count the occurrences of each character in the string
	        for (char c : str.toCharArray()) {
	            if (Character.isLetter(c)) {
	                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	            }
	        }

	        // Print the repetitive letters
	        System.out.print("Repetitive letters: ");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    }
	}

