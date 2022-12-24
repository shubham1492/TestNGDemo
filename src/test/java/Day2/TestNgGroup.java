package Day2;

import org.testng.annotations.Test;

public class TestNgGroup {

    @Test(groups = {"sanity"})
    public void b_method(){
        System.out.println("B Method");
    }

    @Test(groups = {"sanity"})
    public void a_method(){
        System.out.println("A Method");
    }

    @Test(groups = {"sanity"})
    public void c_method(){
        System.out.println("C Method");
    }

    @Test(groups = {"smoke1"})
    public void d_method(){
        System.out.println("D Method");
    }

    @Test(groups = {"smoke2"})
    public void e_method(){
        System.out.println("E Method");
    }

    @Test(groups = {"smoke3"})
    public void f_method(){
        System.out.println("F Method");
    }

    @Test(groups = {"smoke4"})
    public void g_method(){
        System.out.println("G Method");
    }

    @Test(groups = {"smoke5"})
    public void h_method(){
        System.out.println("H Method");
    }

    @Test(groups = {"smokedemo"})
    public void i_method(){
        System.out.println("I Method");
    }


}
