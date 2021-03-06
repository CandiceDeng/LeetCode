// Rotate String

// We are given two strings, A and B.

// A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

// Example 1:
// Input: A = 'abcde', B = 'cdeab'
// Output: true

// Example 2:
// Input: A = 'abcde', B = 'abced'
// Output: false
// Note:

// A and B will have length at most 100.

class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length()){
            return false;
        }
        //In java the == operator compares the address of the object. To compare if two strings are equals need to use the .equals() function.
        if (A.equals("")||A.equals(B)){
            return true;
        }
        for (int i=0;i<A.length();i++){
            if (A.charAt(i)==B.charAt(0)){
                String tmp = A.substring(0,i);
                tmp = A.substring(i,A.length())+tmp;
                if (tmp.equals(B)){
                    return true;
                }
            }
        }
        return false;
    }
}