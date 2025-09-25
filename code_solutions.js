
// JavaScript Solutions

function reverseWords(sentence) {
  return sentence.trim().split(/\s+/).reverse().join(" ");
}

function rotateArray(arr, k) {
  k = k % arr.length;
  return arr.slice(-k).concat(arr.slice(0, -k));
}

function isValidParentheses(s) {
  const stack = [];
  const map = {')': '(', ']': '[', '}': '{'};
  for (let char of s) {
    if (['(', '[', '{'].includes(char)) stack.push(char);
    else if (stack.pop() !== map[char]) return false;
  }
  return stack.length === 0;
}

function longestCommonPrefix(strs) {
  if (!strs.length) return "";
  let prefix = strs[0];
  for (let i = 1; i < strs.length; i++) {
    while (strs[i].indexOf(prefix) !== 0) {
      prefix = prefix.slice(0, -1);
      if (!prefix) return "";
    }
  }
  return prefix;
}

function fizzBuzz(n) {
  for (let i = 1; i <= n; i++) {
    if (i % 15 === 0) console.log("FizzBuzz");
    else if (i % 3 === 0) console.log("Fizz");
    else if (i % 5 === 0) console.log("Buzz");
    else console.log(i);
  }
}

function hasUniqueChars(str) {
  const set = new Set();
  for (let char of str) {
    if (set.has(char)) return false;
    set.add(char);
  }
  return true;
}

function twoSum(nums, target) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    let complement = target - nums[i];
    if (map.has(complement)) return [map.get(complement), i];
    map.set(nums[i], i);
  }
  return [];
}
