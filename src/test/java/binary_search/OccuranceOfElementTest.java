package binary_search;

import junit.framework.TestCase;

public class OccuranceOfElementTest extends TestCase {
    OccuranceOfElement occuranceOfElement=new OccuranceOfElement();

    public void testCountOfElement() {
        int[] nums=new int[]{};
        assertEquals(0,occuranceOfElement.countOfElement(nums,1));
        int[] nums0=new int[]{1,4,6,6,6,8,9,10,10,10,10,12,15};
        assertEquals(3,occuranceOfElement.countOfElement(nums0,6));
        assertEquals(4,occuranceOfElement.countOfElement(nums0,10));
        assertEquals(1,occuranceOfElement.countOfElement(nums0,15));
    }
}