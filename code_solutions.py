
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
