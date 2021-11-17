import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addTestCase1.class, addTestCase2.class, addTestCase3.class, addTestCase4.class, addTestCase5.class,
		divTestCase1.class, divTestCase2.class, divTestCase3.class, divTestCase4.class, divTestCase5.class,
		multiplyTestCase1.class, multiplyTestCase2.class, multiplyTestCase3.class, multiplyTestCase4.class,
		multiplyTestCase5.class, subTestCase1.class, subTestCase2.class, subTestCase3.class, subTestCase4.class,
		subTestCase5.class })
public class AllTests {

}
