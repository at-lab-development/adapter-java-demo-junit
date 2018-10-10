import com.epam.jira.JIRATestKey;
import com.epam.jira.util.JiraInfoProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Random;

@RunWith(com.epam.jira.junit.TestRunner.class)
public class SecondSampleTest {

    @Test
    @JIRATestKey(key = "EPMFARMATS-3024")
    public void secondSampleTest() {
        Random random = new Random();

        JiraInfoProvider.saveValue("Random number", String.valueOf(random.nextInt()));
        JiraInfoProvider.saveValue("Random boolean", String.valueOf(random.nextBoolean()));
        JiraInfoProvider.saveValue("Some static string", "Hello, world!");
        JiraInfoProvider.saveFile(new File(".\\src\\test\\resources\\jenkins-oops.jpg"));
        JiraInfoProvider.saveFile(new File(".\\src\\test\\resources\\jenkins-oops.jpg"));

        int result = 100 / 0;
        JiraInfoProvider.saveValue("100 / 0 = ", String.valueOf(result));
    }

}
