package Day2;

import org.testng.annotations.Test;

public class TestNGDepensOnGroup {

    @Test(groups = {"SignIn"},dependsOnMethods = {"openBrowser"})
    public void signIn(){
        System.out.println("This metthod will execute second after browser launch");
    }

    @Test
    public void openBrowser(){
        System.out.println("This metthod will execute First to launch the browser");
    }

    @Test
    public void validateHomePage(){
        System.out.println("This metthod will execute third to validate home Page");
    }


}
