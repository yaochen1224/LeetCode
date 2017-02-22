import java.util.ArrayList;

/**
 * Created by YaoChen on 2/22/17.
 */

/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */

public class Solution {
    public int findComplement(int num) {
        ArrayList<Integer> complement = new ArrayList<Integer>();
        int remain;
        for (int i = num; i >= 1; i /= 2) {
            remain = i % 2;

            if (remain == 1) {
                complement.add(0);
            } else {
                complement.add(1);
            }
        }

        int flip= 0;
        int bi = 1;
        for (int r = 0; r < complement.size(); r++){
            flip += complement.get(r) * bi;
            bi *= 2;
        }

        return flip;
    }
}
