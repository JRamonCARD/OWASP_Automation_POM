package myFirstPOM;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginFailed_TEST.class, LoginLogout_TEST.class, LoginNullValues_TEST.class, LoginValid_TEST.class })
public class OWASPTest {

}
