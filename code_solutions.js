
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

// Import readline for user input in Node.js
const readline = require('readline');

// Create readline interface
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Function to ask questions and return promises
function askQuestion(question) {
  return new Promise((resolve) => {
    rl.question(question, (answer) => {
      resolve(answer);
    });
  });
}

async function main() {
  console.log("Welcome to JavaScript Code Solutions!");
  
  while (true) {
    console.log("\n=== JavaScript Code Solutions Menu ===");
    console.log("1. Reverse Words in a Sentence");
    console.log("2. Rotate Array");
    console.log("3. Validate Parentheses");
    console.log("4. Find Longest Common Prefix");
    console.log("5. FizzBuzz Game");
    console.log("6. Check if String has Unique Characters");
    console.log("7. Two Sum Problem");
    console.log("0. Exit");
    
    try {
      const choice = await askQuestion("Enter your choice (0-7): ");
      
      switch (parseInt(choice)) {
        case 1:
          const sentence = await askQuestion("Enter a sentence to reverse words: ");
          const reversed = reverseWords(sentence);
          console.log(`Original: ${sentence}`);
          console.log(`Reversed: ${reversed}`);
          break;
          
        case 2:
          const arrInput = await askQuestion("Enter array elements separated by commas: ");
          const arr = arrInput.split(',').map(num => parseInt(num.trim()));
          const k = parseInt(await askQuestion("Enter rotation count: "));
          const rotated = rotateArray(arr, k);
          console.log(`Original array: [${arr.join(', ')}]`);
          console.log(`Rotated by ${k}: [${rotated.join(', ')}]`);
          break;
          
        case 3:
          const parentheses = await askQuestion("Enter string with parentheses to validate: ");
          const isValid = isValidParentheses(parentheses);
          console.log(`'${parentheses}' has ${isValid ? 'valid' : 'invalid'} parentheses`);
          break;
          
        case 4:
          const strsInput = await askQuestion("Enter strings separated by commas: ");
          const strs = strsInput.split(',').map(str => str.trim());
          const prefix = longestCommonPrefix(strs);
          console.log(`Strings: [${strs.map(s => `"${s}"`).join(', ')}]`);
          console.log(`Longest common prefix: "${prefix}"`);
          break;
          
        case 5:
          const n = parseInt(await askQuestion("Enter number for FizzBuzz game: "));
          console.log("FizzBuzz output:");
          fizzBuzz(n);
          break;
          
        case 6:
          const uniqueStr = await askQuestion("Enter string to check for unique characters: ");
          const hasUnique = hasUniqueChars(uniqueStr);
          console.log(`'${uniqueStr}' ${hasUnique ? 'has all unique characters' : 'has duplicate characters'}`);
          break;
          
        case 7:
          const numsInput = await askQuestion("Enter array elements separated by commas: ");
          const nums = numsInput.split(',').map(num => parseInt(num.trim()));
          const target = parseInt(await askQuestion("Enter target sum: "));
          const result = twoSum(nums, target);
          if (result.length === 2) {
            console.log(`Indices: [${result[0]}, ${result[1]}]`);
            console.log(`Values: [${nums[result[0]]}, ${nums[result[1]]}]`);
          } else {
            console.log("No two numbers sum to target");
          }
          break;
          
        case 0:
          console.log("Goodbye! Thanks for using JavaScript Code Solutions!");
          rl.close();
          return;
          
        default:
          console.log("Invalid choice! Please enter a number between 0-7.");
          break;
      }
      
      await askQuestion("\nPress Enter to continue...");
      
    } catch (error) {
      console.log("An error occurred:", error.message);
    }
  }
}

// Run the main function if this file is executed directly
if (require.main === module) {
  main().catch(console.error);
}
