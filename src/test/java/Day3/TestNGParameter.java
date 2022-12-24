package Day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

    @Test
    @Parameters({"val1","val2"})
    public void sum(int a, int b){
        int sum = a+b;
        System.out.println("The sum of the given value is :"+ sum);
    }

    @Test
    @Parameters({"val1","val2"})
    public void devide(int a, int b){
        int devide = a/b;
        System.out.println("The devide of the given value is :"+ devide);
    }


    @Test
    @Parameters({"val1","val2"})
    public void diff(int a, int b){
        int diff = a-b;
        System.out.println("The diff of the given value is :"+ diff);
    }

}
