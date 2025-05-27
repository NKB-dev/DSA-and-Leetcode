import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2); // Convert binary string to BigInteger
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2); // Add the numbers
        return sum.toString(2); // Convert sum to binary string
    }
}