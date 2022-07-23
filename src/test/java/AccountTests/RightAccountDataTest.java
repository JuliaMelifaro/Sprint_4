package AccountTests;

import credit_card.Account;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RightAccountDataTest {
    String nameToCheck = "Mother Teresa";

    @Test
    public void rightAccountDataTest() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(true));
    }
}
