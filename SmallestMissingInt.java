/*

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

*/

import java.util.*;

class Solution {
    public int solution(int[] A) {

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        // Runs through the hash and checks against each number > 0
        // Until it doesn't contain that number, then returns ans
        int ans = 1;
        while(set.contains(ans)) {
            ans++;
        }

        return ans;
    }
}
