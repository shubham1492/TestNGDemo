package dataprovider;
import org.testng.annotations.DataProvider;
import utils.ExcelReader;

public class DP {

    @DataProvider(name="dp")
    public Object [][] dataProviderMethod(){
        return new Object [][] {
                {2,3},
                {5,8},
                {3,4}};
    }


    @DataProvider(name = "empLogin")
    public Object[][] loginData(){

        Object[][] arryObject = ExcelReader.getExcelData("C:\\Users\\shubh\\OneDrive\\Desktop\\JAVA- Selenium\\TestNG Content\\Testdata.xls","userdata");
        return arryObject;
    }

}
