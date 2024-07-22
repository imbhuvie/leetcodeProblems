package binary_search;

import junit.framework.TestCase;

public class SearchInsertElementTest extends TestCase {
SearchInsertElement searchInsertElement=new SearchInsertElement();

    public void testSearchInsert() {
        int[] nums=new int[]{};
        int[] nums0=new int[]{3};
        int[] nums1=new int[]{1,3,5};
        assertEquals(0,searchInsertElement.searchInsert(nums,1));
        assertEquals(1,searchInsertElement.searchInsert(nums0,4));
        assertEquals(0,searchInsertElement.searchInsert(nums0,2));
        assertEquals(0,searchInsertElement.searchInsert(nums1,0));
        assertEquals(3,searchInsertElement.searchInsert(nums1,6));
        assertEquals(1,searchInsertElement.searchInsert(nums1,2));
        assertEquals(2,searchInsertElement.searchInsert(nums1,4));
    }

}