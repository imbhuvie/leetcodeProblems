package two_pointer;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PairsLessThenTargetTest extends TestCase {
    PairsLessThenTarget pairsLessThenTarget = new PairsLessThenTarget();
    public void testCountPairs() {
        List<Integer> l = new ArrayList<>();
        l.add(-6);
        l.add(2);
        l.add(5);
        l.add(-2);
        l.add(-7);
        l.add(-1);
        l.add(3);
//        int target = -2;
        assertEquals(10,pairsLessThenTarget.countPairs(l,-2));

    }
}