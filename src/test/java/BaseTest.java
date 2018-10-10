import com.epam.jira.util.Screenshoter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.DriverManager;

public class BaseTest {

    @BeforeClass
    public static void initialize() {
        Screenshoter.initialize(DriverManager.getInstance().getDriver());
    }

    @AfterClass
    public static void close() {
        Screenshoter.initialize(null);
        DriverManager.getInstance().quit();
    }
}
