package mchall;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testConcatenate() {
        Demo myUnit = new Demo();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}