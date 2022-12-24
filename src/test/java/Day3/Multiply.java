package Day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {


    @Test
    @Parameters({"val1","val2"})
    public void mul(int a , int b){
        int mul = a*b;
        System.out.println("The mul of given value is "+mul);
    }
}
