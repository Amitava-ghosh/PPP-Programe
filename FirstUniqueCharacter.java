import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Update the frequency of each character in the hashmap
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // No non-repeating character found
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        int result = solution.firstUniqChar(input);
        
        System.out.println("Output: " + result);
    }
}
