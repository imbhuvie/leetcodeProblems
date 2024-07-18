package two_pointer;

import junit.framework.TestCase;

import static junit.framework.TestCase.assertEquals;

public class MinimumAverageTest extends TestCase {
    MinimumAverage minimumAverage=new MinimumAverage();
    public void testMinimumAverage() {

        assertEquals(5.5,minimumAverage.minimumAverage(new int[]{ 7, 8, 3, 4, 15, 13, 4, 1 }));
    }


}