package binary_search;
    public class OccuranceOfElement {
        public int countOfElement(int[] nums,int target){
            int start=0;
            int end=nums.length-1;
            int mid;
            while(start<=end){
                mid=(start+end)/2;
                if(nums[mid]==target)
                    return getCount(nums,mid,target);
                else if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return 0;
        }

        private int getCount(int[] nums, int mid, int target) {
            int start=mid-1;
            int end=mid+1;
            int count=1;
            while(start>=0 && end<nums.length){
                if(nums[start]==target){
                    count+=1;
                }
                if(nums[end]==target){
                    count+=1;
                }
                    start--;
                    end++;
            }
            return count;
        }

    }
