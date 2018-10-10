import com.epam.jira.JIRATestKey;
import com.epam.jira.util.JiraInfoProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RunWith(com.epam.jira.junit.TestRunner.class)
public class ThirdSampleTest {

    private final Random random = new Random();

    @Test
    @JIRATestKey(key = "EPMFARMATS-3023")
    public void thirdSampleTest() throws InterruptedException {
        boolean r = random.nextBoolean();
        TimeUnit.SECONDS.sleep(2);

        JiraInfoProvider.saveValue("Value1", "Sample");
        JiraInfoProvider.saveValue("Value2", "Sample");
        JiraInfoProvider.saveValue("Value3", "Sample");
        Assert.assertTrue(true);

    }

}
