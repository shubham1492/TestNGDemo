package Day2;

import org.testng.annotations.Test;

public class TestNGPriority {


    @Test(priority = -1)
    public void b_method(){
        System.out.println("B Method");
    }

    @Test(priority = -2)
    public void a_method(){
        System.out.println("A Method");
    }

    @Test(priority = -3)
    public void c_method(){
        System.out.println("C Method");
    }

    @Test
    public void d_method(){
        System.out.println("D Method");
    }

    @Test
    public void e_method(){
        System.out.println("E Method");
    }


}
