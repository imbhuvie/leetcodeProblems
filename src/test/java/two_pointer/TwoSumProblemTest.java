package two_pointer;

import junit.framework.TestCase;

public class TwoSumProblemTest extends TestCase {
    TwoSumProblem twoSumProblem =new TwoSumProblem();
    public void testTwoSum() {
        int arr[]=new int[]{4,7,3};
        int[] result=new int[]{0,1};
        assertEquals(result,twoSumProblem.twoSum(arr,11));

    }

}