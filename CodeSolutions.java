
// Java Solutions
import java.util.*;

public class CodeSolutions {

    public static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static int findMissing(int[] nums) {
        int n = nums.length + 1;
        int total = n * (n + 1) / 2;
        for (int num : nums) total -= num;
        return total;
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static boolean hasUniqueChars(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Java Code Solutions Menu ===");
            System.out.println("1. Reverse Words in a Sentence");
            System.out.println("2. Check if Two Strings are Anagrams");
            System.out.println("3. Find Missing Number in Array");
            System.out.println("4. Validate Parentheses");
            System.out.println("5. FizzBuzz Game");
            System.out.println("6. Check if String has Unique Characters");
            System.out.println("7. Two Sum Problem");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-7): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a sentence to reverse words: ");
                    String sentence = scanner.nextLine();
                    String reversed = reverseWords(sentence);
                    System.out.println("Original: " + sentence);
                    System.out.println("Reversed: " + reversed);
                    break;
                    
                case 2:
                    System.out.print("Enter first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = scanner.nextLine();
                    boolean isAnag = isAnagram(str1, str2);
                    System.out.println("'" + str1 + "' and '" + str2 + "' are " + 
                                     (isAnag ? "anagrams" : "not anagrams"));
                    break;
                    
                case 3:
                    System.out.print("Enter array size (n): ");
                    int n = scanner.nextInt();
                    int[] nums = new int[n-1];
                    System.out.println("Enter " + (n-1) + " numbers (1 to " + n + " with one missing): ");
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = scanner.nextInt();
                    }
                    int missing = findMissing(nums);
                    System.out.println("Missing number is: " + missing);
                    break;
                    
                case 4:
                    System.out.print("Enter string with parentheses to validate: ");
                    String parentheses = scanner.nextLine();
                    boolean isValid = isValidParentheses(parentheses);
                    System.out.println("'" + parentheses + "' has " + 
                                     (isValid ? "valid" : "invalid") + " parentheses");
                    break;
                    
                case 5:
                    System.out.print("Enter number for FizzBuzz game: ");
                    int fizzBuzzN = scanner.nextInt();
                    System.out.println("FizzBuzz output:");
                    fizzBuzz(fizzBuzzN);
                    break;
                    
                case 6:
                    System.out.print("Enter string to check for unique characters: ");
                    String uniqueStr = scanner.nextLine();
                    boolean hasUnique = hasUniqueChars(uniqueStr);
                    System.out.println("'" + uniqueStr + "' " + 
                                     (hasUnique ? "has all unique characters" : "has duplicate characters"));
                    break;
                    
                case 7:
                    System.out.print("Enter array size: ");
                    int arrSize = scanner.nextInt();
                    int[] twoSumArray = new int[arrSize];
                    System.out.println("Enter " + arrSize + " numbers: ");
                    for (int i = 0; i < arrSize; i++) {
                        twoSumArray[i] = scanner.nextInt();
                    }
                    System.out.print("Enter target sum: ");
                    int target = scanner.nextInt();
                    int[] result = twoSum(twoSumArray, target);
                    if (result.length == 2) {
                        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
                        System.out.println("Values: [" + twoSumArray[result[0]] + ", " + twoSumArray[result[1]] + "]");
                    } else {
                        System.out.println("No two numbers sum to target");
                    }
                    break;
                    
                case 0:
                    System.out.println("Goodbye! Thanks for using Code Solutions!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please enter a number between 0-7.");
                    break;
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
}
