
# Python Solutions

def reverse_words(sentence):
    return ' '.join(sentence.strip().split()[::-1])

def is_anagram(s1, s2):
    return sorted(s1.replace(' ', '').lower()) == sorted(s2.replace(' ', '').lower())

def rotate_array(arr, k):
    k %= len(arr)
    return arr[-k:] + arr[:-k]

def is_valid_parentheses(s):
    stack = []
    mapping = {')': '(', ']': '[', '}': '{'}
    for char in s:
        if char in mapping.values():
            stack.append(char)
        elif char in mapping:
            if not stack or stack.pop() != mapping[char]:
                return False
    return not stack

def fizz_buzz(n):
    for i in range(1, n+1):
        if i % 15 == 0:
            print("FizzBuzz")
        elif i % 3 == 0:
            print("Fizz")
        elif i % 5 == 0:
            print("Buzz")
        else:
            print(i)

def flatten_list(nested):
    result = []
    for item in nested:
        if isinstance(item, list):
            result.extend(flatten_list(item))
        else:
            result.append(item)
    return result

def has_unique_chars(s):
    return len(set(s)) == len(s)

def two_sum(nums, target):
    map = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in map:
            return [map[complement], i]
        map[num] = i

def main():
    while True:
        print("\n=== Python Code Solutions Menu ===")
        print("1. Reverse Words in a Sentence")
        print("2. Check if Two Strings are Anagrams")
        print("3. Rotate Array")
        print("4. Validate Parentheses")
        print("5. FizzBuzz Game")
        print("6. Flatten Nested List")
        print("7. Check if String has Unique Characters")
        print("8. Two Sum Problem")
        print("0. Exit")
        
        try:
            choice = int(input("Enter your choice (0-8): "))
            
            if choice == 1:
                sentence = input("Enter a sentence to reverse words: ")
                reversed_sentence = reverse_words(sentence)
                print(f"Original: {sentence}")
                print(f"Reversed: {reversed_sentence}")
                
            elif choice == 2:
                str1 = input("Enter first string: ")
                str2 = input("Enter second string: ")
                is_anag = is_anagram(str1, str2)
                print(f"'{str1}' and '{str2}' are {'anagrams' if is_anag else 'not anagrams'}")
                
            elif choice == 3:
                arr_input = input("Enter array elements separated by spaces: ")
                arr = list(map(int, arr_input.split()))
                k = int(input("Enter rotation count: "))
                rotated = rotate_array(arr, k)
                print(f"Original array: {arr}")
                print(f"Rotated by {k}: {rotated}")
                
            elif choice == 4:
                parentheses = input("Enter string with parentheses to validate: ")
                is_valid = is_valid_parentheses(parentheses)
                print(f"'{parentheses}' has {'valid' if is_valid else 'invalid'} parentheses")
                
            elif choice == 5:
                n = int(input("Enter number for FizzBuzz game: "))
                print("FizzBuzz output:")
                fizz_buzz(n)
                
            elif choice == 6:
                print("Enter nested list (e.g., [1, [2, 3], [4, [5, 6]]]): ")
                nested_input = input()
                try:
                    nested_list = eval(nested_input)  # Note: eval is used for demo purposes
                    flattened = flatten_list(nested_list)
                    print(f"Original: {nested_list}")
                    print(f"Flattened: {flattened}")
                except:
                    print("Invalid input format. Please use proper list syntax.")
                
            elif choice == 7:
                unique_str = input("Enter string to check for unique characters: ")
                has_unique = has_unique_chars(unique_str)
                print(f"'{unique_str}' {'has all unique characters' if has_unique else 'has duplicate characters'}")
                
            elif choice == 8:
                arr_input = input("Enter array elements separated by spaces: ")
                nums = list(map(int, arr_input.split()))
                target = int(input("Enter target sum: "))
                result = two_sum(nums, target)
                if result:
                    print(f"Indices: {result}")
                    print(f"Values: [{nums[result[0]]}, {nums[result[1]]}]")
                else:
                    print("No two numbers sum to target")
                
            elif choice == 0:
                print("Goodbye! Thanks for using Python Code Solutions!")
                break
                
            else:
                print("Invalid choice! Please enter a number between 0-8.")
                
        except ValueError:
            print("Invalid input! Please enter a valid number.")
        except KeyboardInterrupt:
            print("\n\nGoodbye! Thanks for using Python Code Solutions!")
            break
        
        input("\nPress Enter to continue...")

if __name__ == "__main__":
    main()
