package myFirstPOM;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccoutPage_TEST.class, LoginPage_TEST.class, ProductPage_TEST.class })
public class AllTEST {

}
