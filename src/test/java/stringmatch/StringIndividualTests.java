package stringmatch;

import com.knighten.ai.genetic.stringmatch.StringIndividual;
import org.junit.Test;

public class StringIndividualTests {

    ////////////////////////
    // Parameter Checking //
    ////////////////////////

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullString() {
        new StringIndividual(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorEmptyString() {
        new StringIndividual("");
    }

}