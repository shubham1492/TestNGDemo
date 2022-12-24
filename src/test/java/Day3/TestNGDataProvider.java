package Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {


    @DataProvider(name="dataprovider")
    public Object [][] dataProviderMethod(){
        return new Object [][] {{"first-value"},{"hello world"},{"shubham Jain"}};
    }

    @Test(dataProvider = "dataprovider")
    public void myTest(String val){
        System.out.println("Passed Parameter is "+val);
    }

}
