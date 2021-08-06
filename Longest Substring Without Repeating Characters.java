//Given a string s, find the length of the longest substring without repeating characters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// Example 4: 
//
// 
//Input: s = ""
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 104 
// s consists of English letters, digits, symbols and spaces. 
// 


import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longestSubString = 0;
        HashSet<Character> tempSet = new HashSet<Character> ();

        for (int i = 0; i < s.length(); i++){

            char currentCharecter = s.charAt(i);
            int tempSubstringLen = 1;
            tempSet.add(currentCharecter);

            for (int j = i+1; j < s.length() ; j++ ){
                char iteratingLetter = s.charAt(j);

                if(tempSet.add(iteratingLetter)){
                    tempSubstringLen++;
                }
                else {
                    tempSubstringLen = tempSet.size();
                    tempSet.clear();
                    break;
                }

            }
            if (tempSubstringLen > longestSubString) {
                longestSubString = tempSubstringLen;
            }
        }
        return longestSubString;
    }
}
