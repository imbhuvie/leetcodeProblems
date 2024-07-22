package binary_search;

//35. Search Insert Position

public class SearchInsertElement {
    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int start = 0;
        int end = nums.length - 1;
        if(nums.length==1){
            if(nums[0]>=target) return 0;
            else return 1;
        }
        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if(start==end){
                if(nums[start]==target)
                    return start;
                else if(nums[start]<target)
                {
                    return start+1;
                }
                else{
                    if(start==0||start==nums.length-1)
                        return start;
                    else return start-1;
                }
            }


        }
            return 0;
    }
}
