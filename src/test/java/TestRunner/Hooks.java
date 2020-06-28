package TestRunner;

import BaseClass.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest  {
  //  BaseTest bt = new BaseTest();

    @Before ("@Test")
    public void openBrowser(){

        System.out.println("This is opening browser");
        System.out.println("created new branch");

        BaseTest.openDriver();
    }


    @After("@Test")
    public void closeBrowser(){

        System.out.println("This is closing browser");
        BaseTest.closeDriver();
   }

}
