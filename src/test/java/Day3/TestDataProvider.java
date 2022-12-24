package Day3;

import dataprovider.DP;
import org.testng.annotations.Test;

public class TestDataProvider {

    @Test(dataProvider = "dp",dataProviderClass = DP.class)
    public void sum(int a, int b){
        int sum = a+b;
        System.out.println("The sum of the given value is :"+ sum);
    }

    @Test(dataProvider = "dp",dataProviderClass = DP.class)
    public void devide(int a, int b){
        int devide = a/b;
        System.out.println("The devide of the given value is :"+ devide);
    }

    @Test(dataProvider = "dp",dataProviderClass = DP.class)
    public void diff(int a, int b){
        int diff = a-b;
        System.out.println("The diff of the given value is :"+ diff);
    }

}
