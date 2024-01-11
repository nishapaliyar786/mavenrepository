package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass1 {
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "adm", "password" },
      new Object[] { "admin", "pass" },
      new Object[] { "adm", "pass" }//give three credentials for unsuccessful login
    };
  }
  @DataProvider(name="login")//if more than one dataprovider used so give name
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "admin", "password" }//only valid credential for successful login
    };
  }
}
