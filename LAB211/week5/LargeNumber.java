
package week5;

import java.math.BigInteger;
import java.util.List;

public class LargeNumber {
    private String num1;
    private String num2;
    public BigInteger plus(){
        
        num1 = "123123";
        num2 = "8777";
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger result = bigNum1.add(bigNum2);
        return result;
    }
    public void showLargeNum(){
        System.out.println(plus());
    }
}
