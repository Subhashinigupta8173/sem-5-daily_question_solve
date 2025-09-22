// Last updated: 22/9/2025, 8:27:24 pm
import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n = new BigInteger(num1);
        BigInteger m = new BigInteger(num2);
        BigInteger ans = n.multiply(m);
        return ans.toString();
    }
}
//both long and int approach fails