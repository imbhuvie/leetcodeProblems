package binary_search;

import junit.framework.TestCase;

public class SearchElementTest extends TestCase {
    SearchElement searchElement=new SearchElement();
    public void testSearch() {
        int[] nums=new int[]{};
        assertEquals(-1,searchElement.search(nums,9));
        int[] nums0=new int[]{1};
        assertEquals(0,searchElement.search(nums0,1));
        int[] nums1=new int[]{2,4,6,9,10};
        assertEquals(0,searchElement.search(nums1,2));
        assertEquals(4,searchElement.search(nums1,10));
    }
}