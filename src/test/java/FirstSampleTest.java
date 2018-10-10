import com.epam.jira.JIRATestKey;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

@RunWith(com.epam.jira.junit.TestRunner.class)
public class FirstSampleTest {

    private final Random random = new Random();

    @Test
    @Ignore
    @JIRATestKey(key = "EPMFARMATS-3970")
    public void firstSampleTest() {
        boolean r = random.nextBoolean();
        Assert.assertTrue(r);
    }
}
