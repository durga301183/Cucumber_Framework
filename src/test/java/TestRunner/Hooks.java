package TestRunner;

import BaseClass.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest  {
  //  BaseTest bt = new BaseTest();

    @Before ("@Test")
    public void openBrowser(){
        BaseTest.openDriver();
    }


    @After("@Test")
    public void closeBrowser(){
        BaseTest.closeDriver();
   }

}
