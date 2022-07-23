package AccountTests;

import credit_card.Account;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class AmountOfSpacesTest {
    private final String nameToCheck;

    public AmountOfSpacesTest(String nameToCheck) {
        this.nameToCheck = nameToCheck;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"JKRowling"},                      // 0 пробелов
                {"Martin Luther King"}              // 2 пробела
        };
    }

    @Test
    public void wrongSpacesAmount() {
        Account someClient = new Account(nameToCheck);
        MatcherAssert.assertThat(someClient.checkNameToEmboss(), is(false));
    }
}
